/*
	数据类型
	1.基本数据类型
	整数型 byte short int long
	浮点型 float double
	字符型 char
	布尔型 boolean
	
	
	2.引用数据类型
	字符串、数组、类、接口、lambda
	
	注意事项：
	1.字符串不是基本类型，而是引用类型。
	2.浮点型可能只是一个近似值，并非精确的值。
	3.数据范围与字节数不一定相关，例如float数据范围比long更广泛，但是float是4字节，long是8字节。
	4.浮点数当中默认类型是double。如果一定要使用float类型，需要加后缀F。
	  如果是整数，默认int类型，如果要使用long类型，需要加后缀L。
	  
	  变量：程序运行期间，内容可以发送改变的量。
	  创建一个变量并且使用的格式：
	  数据类型 变量名称；//创建了一个变量
	  变量名称 = 数据值；//赋值，将右边的数据值，赋值给左边的变量
	  一步到位格式：
	  数据类型 变量名称 = 数据值；// 在创建一个变量的同时，立刻放入指定的数据值
	
*/
public class Test02{
	public static void main(String[] args){
		int num1 = 10;		
		System.out.println(num1);
		double num2 = 2.3;
		System.out.println(num2);
		float num3 = 2.4F;
		System.out.println(num3);
		char a = 'A';
		System.out.println(a);
		char b = '钟'；
		System.out.println(a);
	}
}