package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016100900647675";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCHnYTKGVk6OtYEYMAbAs1NrCDNqQ0XUXyjhQb0KakQA/dmbnBWUcXeKdXdSsYrOC1Fxi0KUdTd2ZZ+fCzi4qgI0Xhg6dVH7aA+PgVoealG6a9Z6eMF3qoIkOrDAH0e9kFJi36mYEC5rtM9LltvE829iQUgHj+xvzSqtvLqu1IXFcw+X77n6QnBpmEIr4gX5p6J7FI80AohlhWyWW39c4EZpsXTK1oa3v3a1pZc4BzSBKUsw+05habEmxyCTjkYOVT2r0NB32BTbNRmtyLUE/l8juUQ+U//xk4NSEYUvRpfP4oqidnVRnj2T3WpoiGWO8wMRGd36b1LsMrXUTJ4OMBJAgMBAAECggEAbuhuuc1jQJDviGMLmMuA1X3o0ejoMOLOePiJCFOt1NA5m0bEjoOPu7IhGjpVuPDXbZG2MhNccBbL0iOBngfZfmS4+yEg8RMwEtcsGxYsTzc71d/Gb317N0g1Bkc3DIQ+PoRbjnt3U6PbU9S+qCfdAZ22WF8EnjwOOXMnVLrfVsqk96ZLIqX8DAPZo+joVG0qRwW/o1KKwcM0T7BHz/4uxEOw3j4kPRMRNyjRWHoxDJ/9gJEyMjiu2NMG44o5vhhcRkalv6AlR18Qs6xT2kHRVN7dlLe8pdl+sneDeQE2QjtwAy9TdxiYSwM4HmM1rlDSUoCNSCh5zAh2fN2a/H0I0QKBgQDRwiMVI5ApeqIXXpOpMwyicDEcG26je08Vs0a3bwPKslbEEoG/NtuUWbToTNYWsGq1un1rh7aJzttXLoS4agYVC5Pdy1ymhhyvHCwTFQBxwAAtAWUNzLlSbUz3b1R7JVmf5k75tOzmZhsapeuL2g8v5fMw0Gw3qxOG8shgyI+CXQKBgQClgxDiQfESg/RSan1TsbGsaQ6x24oOpKTdfMyRyVWCqeI05gEXgW1f+DxCE6IaAbWNQqRXAYl8xtEiZHmrNTf2U1esmePNMRD2mTXM7T3cS17aR+fR2enBI2S1QTh/pbjCCqYmaKx0jh1ioAr0ZVAyHfuo7kIoD3HBLjgliQKu3QKBgCiYtkmFFIWyomR7fYClzLAzno2eEY+6cdf1Vp5x8f3s/jX8jvf/GghgRE8hb938TurVKSkCnyWUz4bUDgPTIVI5Z2jpzwi7tBmADlezHN7nFiGfv3soQEXfuaG5/lPHKs1zuZ1CkwcUg/JoYmoyzfWrP6IW9JrhlWns2zNAHeZRAoGAOmi+lJpg0P/wQQWDpP2YjhelL+8iEXjZFbDtIKXEn5AEXFavG/R4/N1Fpqv3EOZ5g5h5FptcQcSIGXML3PezACL5VdgZJFike+IlsmQm6I9QsgeeL9iPPbGX4L9biPCa+x928ycNdTSR+jQwqX73hjg+j6dFgY2xv1LoTZbEc6ECgYAi/1N6P7aHOkJRkz9CeEf5z+uHlT81OSXtFJ3yyr8RdqaQGs3monCAlfUrTrb/hKqoPTv1B4zdPxzfWReqiFE4+iLCNhViPl27rpNdOI2Dh6ogt0beG1Yk1qoxvfQqPSaRwiVqLDfFyHBEwfO7BusLdvQljiaj6+dvhqiPZaYcmw==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnrhl6bH0ZBMp9vPRl6NQzNtV/wDjGcMRSfl2ZgKX/VmjIfiLGd5/WkOC8ftRP3itsjs7qNS1eZxpZ6+onFOWRKVKlJfRSHi1NMz5feX/bMKWlzbWsraYrWuBlBs0gALrdtoNohZ327lFbopHHNA+1PfJHFl2qmG37WTHkS5FrhQs2fbDbLM2x6CYop7qHvZ69ybvd1iaa0x2fPZH+MWG9V50OojZdXDRPCe9X82wn9D/zrJK0zkyeohalmf5V4r+1Rs3/GuDDNRsFqLVprXJPxgHPJOirBAl0JIaGnw3K3bOmtBHbEes3yDQ2bffh5LJjW/a7jnCqoElkJda/DdURQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	//public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	//沙箱网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "d:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

