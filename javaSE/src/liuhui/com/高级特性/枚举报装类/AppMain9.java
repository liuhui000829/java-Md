package liuhui.com.高级特性.枚举报装类;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期的处理
 * @author Thinkpad
 *
 */
public class AppMain9 {

	public static void main(String[] args) {
		//创建Date对象-获取当前系统时间
		Date date = new Date();
		//创建格式化对象 月使用MM hh：12小时制  HH：24小时制
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//完成时间格式化处理
		System.out.println(sdf.format(date));
		
		//Calendar
		//使用系统时间完成日历对象的创建
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(
				cal.get(Calendar.YEAR)+"年"
				+(cal.get(Calendar.MONTH)+1)+"月"
				+cal.get(Calendar.DAY_OF_MONTH)+"日 "
				+"星期"+(cal.get(Calendar.DAY_OF_WEEK)==1?"日":cal.get(Calendar.DAY_OF_WEEK)-1)
				+" "+(cal.get(Calendar.AM_PM)==0?"AM":"PM")
				+" "+(cal.get(Calendar.HOUR))+":"
				+(cal.get(Calendar.MINUTE))+":"
				+(cal.get(Calendar.SECOND))
				);
		System.out.println(
				"今天是本年的第"+cal.get(Calendar.DAY_OF_YEAR)+"天"
				);
		
		//将日历进行修改并重新输出
		boolean flag = cal.get(Calendar.MONTH)>=10;
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)+2);
		System.out.println(
				"下下个月的今天是"+(flag?"明":"本")+"年的第"+cal.get(Calendar.DAY_OF_YEAR)+"天"
				);
	}

}
