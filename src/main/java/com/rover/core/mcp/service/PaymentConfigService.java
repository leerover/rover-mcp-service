package com.rover.core.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class PaymentConfigService {

    @Tool(description = "根据业务描述获取支付配置")
    public String getPaymentConfigByContent(@ToolParam(description = "业务场景，例如：正常还款")String businessScene,
                                            @ToolParam(description = "交易模式，例如：收银台、非收银台")String transMode,
                                            @ToolParam(description = "费用类型，例如：92")String fundType,
                                            @ToolParam(description = "支付类型，例如：收款、支付中签约")String payType,
                                            @ToolParam(description = "交易方式，例如：银行卡支付、微信支付")String transWay,
                                            @ToolParam(description = "支付方式，例如：H5,API")String payWay,
                                            @ToolParam(description = "交易主体，例如：众联商务、众先安行")String transSubject){
       StringBuilder stringBuilder = new StringBuilder();
       if(!"正常还款".equals(businessScene) && !"逾期还款".equals(businessScene)){
           stringBuilder.append("不支持的业务场景");
       }
       if(!"收银台".equals(transMode) && !"非收银台".equals(transMode)){
           stringBuilder.append("不支持的交易模式");
       }
       if(!"H5".equals(payWay) && !"API".equals(payWay)){
            stringBuilder.append("不支持的支付方式");
       }
       if (!"银行卡支付".equals(transWay) && !"微信支付".equals(transWay) && !"支付宝支付".equals(transWay)) {
           stringBuilder.append("不支持的交易方式");
       }
       stringBuilder.append("交易参数校验通过");
        return stringBuilder.toString();
    }
}
