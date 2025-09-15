package com.rover.core.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class WeatherService {

    private String appid = "13644492";
    private String appSecret = "zT5hZH4X";
    private String url = "http://v1.yiketianqi.com/free/day?";

    @Tool(description = "根据城市获取实时天气信息")
    public String getWeatherByCity(@ToolParam(description = "城市，例如：上海") String city){
        StringBuilder requestUrl = new StringBuilder(url);
        requestUrl.append("appid=").append(appid).append("&appsecret=").append(appSecret).append("&city=").append(city).append("&unescape=1");
        String response = sendGetRequest(requestUrl.toString());
        return response;
    }

    public static String sendGetRequest(String url) {
        try {
            // 创建HttpClient实例
            HttpClient client = HttpClient.newHttpClient();

            // 构建GET请求
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()  // 设置为GET请求
                    .timeout(Duration.ofSeconds(30))  // 设置超时时间
                    .build();

            // 发送请求并获取响应
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            // 返回响应体内容
            return response.body();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
