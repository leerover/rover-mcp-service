package com.rover.core.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class BIService {

    @Tool(description = "根据经纬度获取天气预报")
    public String getWeatherForecastByLocation(@ToolParam(description = "纬度，例如：39.9042") String latitude,
                                               @ToolParam(description = "经度，例如：116.4074") String longitude){
        return "当前位置（纬度：" + latitude + "，经度：" + longitude + "）的天气信息：123\n";
    }
}
