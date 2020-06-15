
/*
自动类型转换（隐式）
	1：不需要特别处理
	2：从小到大自动转换
强制类型转换（显示）
	一般不推荐，有可能发生数据溢出
*/
public class Test03{
	public static void main(String[] args){
		System.out.println(1024);//默认int类型
		System.out.println(3.14);//默认浮点型
		
		long num1 = 100;//左右两边类型不一样，从小到大自动转换
		System.out.println(num1);
		
		int num2 = (int)100L;//左右不一样，强制转换
		System.out.println(num2);
		
		double num3 = (int)3.5;
		System.out.println(num3);
	}
}