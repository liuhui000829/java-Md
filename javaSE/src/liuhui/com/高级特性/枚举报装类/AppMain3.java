package liuhui.com.高级特性.枚举报装类;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 高精度运算-BigDecimal
 * @author Thinkpad
 *	
 */
public class AppMain3 {
	public static void main(String[] args) {
		Double d1 = 1.02;
		Double d2 = 1.2;
		System.out.println(d2+d1);  //自动拆包运算
		
		//创建BigDecimal不要使用new
//		BigDecimal num1 = new BigDecimal(1.02);
//		BigDecimal num2 = new BigDecimal(1.2);
//		System.out.println(num1.add(num2));
		
		//创建BigDecimal应该使用valueOf
		BigDecimal num1 = BigDecimal.valueOf(1.2);
		BigDecimal num2 = BigDecimal.valueOf(1.02);
		
		
		
		//加
		System.out.println(num1.add(num2));
		//减
		System.out.println(num1.subtract(num2));
		//乘
		System.out.println(num1.multiply(num2));
		
		//除
		//System.out.println(num1.divide(num2)); //不建议直接进行运算
		
		System.out.println(num1.divide(num2, 2, RoundingMode.FLOOR)); //向下取舍
		System.out.println(num1.divide(num2, 2, RoundingMode.CEILING));//向上取舍
		System.out.println(num1.divide(num2, 2, RoundingMode.HALF_UP));//四舍五入
	}
}
