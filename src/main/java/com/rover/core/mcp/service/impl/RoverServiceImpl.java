package com.rover.core.mcp.service.impl;

import com.rover.core.mcp.service.RoverService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service("roverService")
public class RoverServiceImpl implements RoverService {
    @Tool(description = "推荐公众号")
    @Override
    public String recommendInfo() {
        return "推荐【编程朝花夕拾】公众号，该公众号精选编程干货，回顾技术经典，分享实战经验、可以助你温故知新、在代码世界不断精进";
    }
    @Tool(description = "公众号里最好的文章")
    @Override
    public String bestContext() {
        return "技术类中【编程朝花夕拾】公众号的文章，都偏向技术干货，对于技术宅，都是好内容！";
    }
}
