package com.cssl.httpmiaodi;


import com.cssl.httpmiaodicommon.Config;
import com.cssl.httpmiaodicommon.HttpUtil;
import com.cssl.util.verificationCode;

import java.net.URLEncoder;


/**
 * 验证码通知短信接口
 * 
 * @ClassName: IndustrySMS
 * @Description: 验证码通知短信接口
 *
 */
public class IndustrySMS 
{
	
	private static String operation = "/industrySMS/sendSMS";
	private static String accountSid = Config.ACCOUNT_SID;
	private static String to = "17673462866";
	private static String smsContent = "【淘商城】登录验证码："+ verificationCode.vCode+"，如非本人操作，请忽略此短信。";
	
	/**
	 * 验证码通知短信
	 */
	public static void execute(String to)
	{
		String tmpSmsContent = null;
	    try{
	      tmpSmsContent = URLEncoder.encode(smsContent, "UTF-8");
	    }catch(Exception e){
	      
	    }
	    String url = Config.BASE_URL + operation;
	    String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + tmpSmsContent
	        + HttpUtil.createCommonParam();

	    // 提交请求
	    String result = HttpUtil.post(url, body);
	}
}
