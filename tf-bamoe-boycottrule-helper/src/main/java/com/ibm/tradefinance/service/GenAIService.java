package com.ibm.tradefinance.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.tradefinance.model.RuleRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.logging.Logger;

@ApplicationScoped
public class GenAIService {

    private static final Logger LOGGER = Logger.getLogger(GenAIService.class.getName());

    @ConfigProperty(name = "genapi.url")
    String genApiUrl;

    @ConfigProperty(name = "genapi.username")
    String username;

    @ConfigProperty(name = "genapi.password")
    String password;

    @Inject
    ObjectMapper mapper;

    public String getGenAIResponse(RuleRequest request) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(genApiUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            // Set Basic Auth header
            String encoded = Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
            connection.setRequestProperty("Authorization", "Basic " + encoded);

            // Convert request to JSON and write to output
            String requestBody = mapper.writeValueAsString(request);
            LOGGER.info("Sending request to GenAPI: " + requestBody);

            try (OutputStream os = connection.getOutputStream()) {
                os.write(requestBody.getBytes());
                os.flush();
            }

            int responseCode = connection.getResponseCode();
            LOGGER.info("GenAPI responded with status: " + responseCode);

            if (responseCode == 200) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    reader.lines().forEach(response::append);
                    return response.toString();
                }
            } else {
                // Log error stream content
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()))) {
                    reader.lines().forEach(line -> LOGGER.warning("GenAPI error: " + line));
                }
                return null;
            }

        } catch (Exception e) {
            LOGGER.severe("Exception calling GenAPI: " + e.getMessage());
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
