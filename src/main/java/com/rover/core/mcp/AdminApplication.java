package com.rover.core.mcp;

import com.rover.core.mcp.service.BIService;
import com.rover.core.mcp.service.PaymentConfigService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
    @Bean
    public ToolCallbackProvider biTools(BIService biService){
        return MethodToolCallbackProvider.builder()
                .toolObjects(biService)
                .build();
    }

    @Bean
    public ToolCallbackProvider paymentConfigTools(PaymentConfigService paymentConfigService){
        return MethodToolCallbackProvider.builder()
                .toolObjects(paymentConfigService)
                .build();
    }
}
