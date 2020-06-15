/* 关键字：只能是小写字母
标识符
1：指在程序钟，外卖自己定义的内容。比如类的名字、方法的名字和变量的名字等等。HelloWorld就是关键字
2：标识符可以包含英文字母区分大小写、0-9数字、$符号和_符号，不能以数字开头，不能是关键字。

常量：在程序运行期间，固定不变的量
1.字符串常量：用双引号引起来的部分。例如：“abc”、“hello”
2.整数常量：直接写上数字，没有小数点。例如：100、200
3.浮点数常量：直接写上数字，有小数点。例如：0.0、2.1
4.字符常量：单引号引起来的单个字符。例如：‘a’、‘A’、‘1’
5.布尔常量：true、false
6.空常量:null */

public class Test01{
	public static void main(String[] args){
		//字符串常量
		System.out.println("abc");
		System.out.println("");
		System.out.println("hello");
		//整数常量：直接写上数字，没有小数点。例如：100、200
		System.out.println("100");
		System.out.println("200");
		//浮点数常量：直接写上数字，有小数点。例如：0.0、2.1
		System.out.println("0.0");
		System.out.println("2.1");
		//字符常量：单引号引起来的单个字符。例如：‘a’、‘A’、‘1’
		System.out.println('a');
		System.out.println('A');
		System.out.println(' ');
		//布尔常量：true、false
		System.out.println(true);
		System.out.println(false);
		
	}
}
