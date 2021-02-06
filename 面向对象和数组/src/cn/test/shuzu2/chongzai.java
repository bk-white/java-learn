package cn.test.day2;


/*
* 在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式。
* */
public class chongzai {
    public static void main(String[] args) {
        myPrint(10);// int
        myPrint('1');// char
        myPrint(20);// long
        myPrint(3.4);// float
        myPrint(3.2);// double
        myPrint("zhong");//String
        myPrint(true); //boolean
    }
    public static void myPrint(int num){
        System.out.println(num);
    }

    public static void myPrint(long num){
        System.out.println(num);
    }

    public static void myPrint(float num){
        System.out.println(num);
    }

    public static void myPrint(double num){
        System.out.println(num);
    }

    public static void myPrint(char num){
        System.out.println(num);
    }

    public static void myPrint(boolean num){
        System.out.println(num);
    }

    public static void myPrint(String num){
        System.out.println(num);
    }
}
