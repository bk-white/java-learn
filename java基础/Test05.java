/*
与（并且） && 全部都是true，才是true
或（或者） || 至少有一个是true，才是true
非（取反） ！ 本来是true ，变成false， 本来是false，变成true

注意事项：
1.逻辑运算符只能用于boolean值。
2.与、或需要左右各自有一个boolean值，取反只要有唯一一个boolean值。
3.与、或两种运算符如果有多个条件可以连续写。

tips
对于1 < x <4的情况，应该拆成两部分，然后使用运算符连接起来；
int x = 2;
1 < x && x < 4
*/

public class Test05{
	public static void main(String[] args){
		System.out.println(true && false); // false
		System.out.println(true || false); // true
		//短路
		int a =10;
		System.out.println(3 > 4 && ++a < 100);// 左边已经false，右边没有进行 a=10
	}
	
}