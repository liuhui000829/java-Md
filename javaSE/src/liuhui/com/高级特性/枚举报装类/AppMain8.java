package liuhui.com.高级特性.枚举报装类;
/**
 * StringBuffer-带缓冲的String
 * StringBuilder-带缓冲的String-线程不安全的
 * 
 * @author Thinkpad
 * 1.创建一个字符串 www.${name}.com
 * new StringBuffer(str) 将字符串转为StringBuffer类型
 * 2.将输入的内容替换${name} www.baidu.com
 * indexOf-获取字符串第一次出现的位置
 * lastIndexOf-获取字符串最后一次出现的位置
 * replace(start,end,str)-从StringBuffer start位置到end-1位置的内容替换为str
 * 3.将输入的内容拼接到后面 www.baidu.com/news
 * append-将内容拼接到StringBuffer后面
 * 4.如果字符串中有baidu-将www去掉
 * reverse -将字符串进行反转
 * www.baidu.com  com.baidu.www
 */
public class AppMain8 {
	public static void main(String[] args) {
		String str = "www.${name}.com";
		//将str转为StringBuffer
		StringBuffer sb  = new StringBuffer(str);
		
		/*
		 * 2.将输入的内容替换${name} www.baidu.com
		 */
		String name = "baidu";
		//2-1找到要替换的开始位置
		int start = sb.indexOf("${name}");
		//2-2计算要替换的结束位置
		int end = start+"${name}".length();  
		//2-3完成替换
		sb.replace(start, end, name);
		System.out.println(sb);
		
		//3.将输入的内容拼接到后面 www.baidu.com/news
		String info = "/news";
		sb.append(info);
		System.out.println(sb);
		
		//如果字符串中有baidu-将www去掉
		if(sb.indexOf("baidu")>=0) {
			sb.delete(0, "www.".length());
		}
		System.out.println(sb);
		
		//将整个字符串反转
		System.out.println(sb.reverse());
		
		str = sb.toString();
		System.out.println(str);
	}
}
