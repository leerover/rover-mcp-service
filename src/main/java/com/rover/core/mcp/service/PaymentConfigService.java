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
        stringBuilder.append("businessScene=");
        stringBuilder.append(businessScene);
        stringBuilder.append(";transMode=");
        stringBuilder.append(transMode);
        stringBuilder.append(";fundType=");
        stringBuilder.append(fundType);
        stringBuilder.append(";payType=");
        stringBuilder.append(payType);
        stringBuilder.append(";transWay=");
        stringBuilder.append(transWay);
        stringBuilder.append(";payWay=");
        stringBuilder.append(payWay);
        stringBuilder.append(";transSubject=");
        stringBuilder.append(transSubject);
        return stringBuilder.toString();
    }
}
