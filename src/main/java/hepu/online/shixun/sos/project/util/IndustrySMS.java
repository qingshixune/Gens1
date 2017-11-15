package hepu.online.shixun.sos.project.util;

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
	/**z
	 * 验证码通知短信
	 */
	public static void execute(String to, String smsContent)
	{
		String url = Config.BASE_URL + operation;
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent
				+ HttpUtil.createCommonParam();

		// 提交请求
		String result = HttpUtil.post(url, body);
		System.out.println("result:" + System.lineSeparator() + result);
	}
	
}
