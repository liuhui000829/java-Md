package liuhui.com.高级特性.枚举报装类;

import java.util.Random;

/**
 * Random类
 * @author Thinkpad
 *
 */
public class AppMain5 {
	public static void main(String[] args) {
		Random rd = new Random();
		//随机小数
		for (int i = 0; i < 5; i++) {
			System.out.print(rd.nextDouble()+" ");
		}
		
		//随机整数
		for (int i = 0; i < 5; i++) {
			System.out.println(rd.nextInt());
		}
		
		//给范围边界的随机整数
		for (int i = 0; i < 5; i++) {
			System.out.print(rd.nextInt(10)+1+" ");
		}
		System.out.println("================");
		
		//获取伪随机数
		Random rd1 = new Random(10);
		for (int i = 0; i < 5; i++) {
			System.out.print(rd1.nextInt(100)+" ");
		}
		
	}
}
