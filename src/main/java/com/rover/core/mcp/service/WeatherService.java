package com.rover.core.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Service
public class WeatherService {

    private final RestClient restClient;

    public WeatherService() {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.weather.gov")
                .defaultHeader("Accept", "application/geo+json")
                .defaultHeader("User-Agent", "WeatherApiClient/1.0")
                .build();
    }

    /**
     * Get forecast for a specific latitude/longitude
     * @param latitude Latitude
     * @param longitude Longitude
     * @return The forecast for the given location
     * @throws RestClientException if the request fails
     */
    @Tool(description = "Get weather forecast for a specific latitude/longitude")
    public String getWeatherForecastByLocation(
            double latitude,   // Latitude coordinate
            double longitude   // Longitude coordinate
    ) {
        return "1111";
    }

    /**
     * Get alerts for a specific area
     * @param state Area code. Two-letter US state code (e.g. CA, NY)
     * @return Human readable alert information
     * @throws RestClientException if the request fails
     */
    @Tool(description = "Get weather alerts for a US state")
    public String getAlerts(
            @ToolParam(description = "Two-letter US state code (e.g. CA, NY)") String state) {

       return "222";
    }
}
