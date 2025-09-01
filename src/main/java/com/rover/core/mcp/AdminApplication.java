package com.rover.core.mcp;

import com.rover.core.mcp.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class AdminApplication {

    public static void main(String[] args) {
        log.info("McpServerApplication 启动啦");
        SpringApplication.run(AdminApplication.class, args);
    }
    @Bean
    public ToolCallbackProvider weatherTools(WeatherService weatherService){
        return MethodToolCallbackProvider.builder().toolObjects(weatherService).build();
    }
}
