/*
循环语句的基本组成部分，一般分为四个部分：

1.初始化语句：在循环开始最初执行，而且只做唯一一次。
2.条件判断：如果成立，则循环举行，不成立退出。
3。循环体：重复要做的事情内容，若干行语句。
步进语句：每次循环只会都要进行扫尾工作。

while循环：

标准格式：
while（条件判断）{
	循环体
}

拓展格式：
初始化语句；
while（条件判断）{
	循环体
	步进语句；
}

do-while循环标准格式：
do{
	循环体
	步进语句;
}while(条件判断);
*/

public class Test11{
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			System.out.println(i);
		}
		System.out.println("停止");
		whil();
		dow();
	}
	
	public static void whil(){
		int i = 1;//初始化语句
		while(i <= 3){//条件判断
			System.out.println(i);//循环体
			i++;
		}
	}
	public static void dow(){
		int i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i <= 3);
	}
}