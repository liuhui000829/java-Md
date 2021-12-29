package liuhui.com.高级特性.枚举报装类;

import java.util.Scanner;

/**
 * 注册操作
 * 	因为String是一个常量，所以操作的时候必须要返回新的字符串
 * 1.用户名和密码前后不能有空格-如果有则取消
 * 	trim()-去掉字符串前后的空格
 * 2.用户名不能有大写，如果有则转为小写
 * 	toLowerCase() 所有内容转为小写
 * 	toUpperCase() 所有内容转为大写
 * 3.用户名不能小于5位，密码不能小于6
 * 	length() 获取字符串的长度
 * 4.两次密码必须一致
 * 	equals() 比较字符串内容是否一致
 * 
 * 5.帐号中不允许出现admin
 * indexOf()返回指定子字符串第一次出现的索引
 * 
 * 6.将密码进行简单加密-密码拼接帐号的后三位
 * 	substing(startIndex,endIndex) 截取当前字符串中startIndex到endIndex-1的字符串
 * 	concat()给原字符串拼接新的内容并返回
 * @author Thinkpad
 *
 */
public class AppMain6 {
	public static void main(String[] args) {
		 
	 
		String username = "123Asdmin  ";
 
		String pwd1 = "123123  ";
		 
		String pwd2 = "   123123   ";
		
		//1.用户名和密码前后不能有空格-如果有则取消
		username = username.trim();
		pwd1 = pwd1.trim();
		pwd2 = pwd2.trim();
		
		//2.用户名不能有大写，如果有则转为小写
		username = username.toLowerCase();
	
		//3.用户名不能小于5位，密码不能小于6
		if(username.length()<5) {
			System.out.println("用户名不能小于5位");
			return;
		}
		if(pwd1.length()<6) {
			System.out.println("密码不能小于6位");
			return;
		}
		
		//4.两次密码必须一致
		if(!pwd1.equals(pwd2)) {
			System.out.println("两次密码必须一致");
			return;
		}
		//5.帐号中不允许出现admin
		System.out.println(username.indexOf("admin"));
		if(username.indexOf("admin")>=0) {
			System.out.println("不能使用敏感词汇");
			return;
		}
		
		/*
		 * 将密码进行简单加密-密码拼接帐号的后三位
		 * 1.获取帐号的后三位
		 * 2.拼接到密码后面
		 */
		String uml3 = username.substring(username.length()-3, username.length());
		System.out.println(uml3);
		String str = pwd1.concat(uml3);
		System.out.println(str);
		
		System.out.println("注册成功");
	}
}
