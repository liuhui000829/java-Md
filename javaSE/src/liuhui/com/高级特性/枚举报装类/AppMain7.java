package liuhui.com.高级特性.枚举报装类;

import java.util.Arrays;

/**
 * 字符串转数组
 * @author Thinkpad
 * split-将字符串转为数组
 */
public class AppMain7 {
	public static void main(String[] args) {
		String s = "1,2,3,4,5,6,7,8";
		String[] strs = s.split(",");
		System.out.println(Arrays.toString(strs));
	}
}
