/*
switch语句的使用注意事项：
1：多个case后面的值不可以重复

2：switch后面的小括号当中只能是下列数据类型：
基本数据类型： byte/stort/char/int
引用数据类型:String字符串、enum枚举

3：switch语句格式考研很灵活：前后顺序考研颠倒，而且break语句还可以省略。
匹配到哪一个case就从那个位置向下执行知道遇见break结束。
*/
public class Test10{
	public static void main(String[] args){
		int num = 1;
		switch(num){
			case 1:
				System.out.println("aaa");
				break;
			case 2:
				System.out.println("bbb");
				break;
			default:
				System.out.println("ccc");
				break；
		}
	}
}