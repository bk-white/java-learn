/*
一元运算符：只需要一个数据就可以进行操作的运算符。例如：取反！、自增++、自减--
二元运算符：需要两个数据才可以进行操作的运算符。例如：加法+、赋值=
三元运算符：需要三个数据才可以进行操作的运算符。

格式：
数据类型 变量名称 = 条件判断 ？ 表达式A ：表达式B;

流程：
首先判断条件是否成立：
如果成立为true，那么将表达式A的值赋值给左侧变量；
如果不成立false，那么将表达式B复制给左侧变量
*/

public class Test06{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int max = a > b ? a : b;
		System.out.println("最大值：" + max);
	}
}