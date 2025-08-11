package com.rover.core.mcp.config;

import com.rover.core.mcp.service.RoverService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolCallbackProviderConfig {

    @Bean
    public ToolCallbackProvider recommendTools(RoverService roverService) {
        return MethodToolCallbackProvider.builder().toolObjects(roverService).build();
    }
}
