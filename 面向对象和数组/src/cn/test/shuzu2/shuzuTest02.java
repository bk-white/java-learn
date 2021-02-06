package cn.test.day2;

/*java的内存需要划分成五个部分：
        1.栈：（Stack）：存放的都是方法中的局部变量。方法在栈当中运行
        局部变量：方法的参数，或者是方法{}内部的变量
        作用域：一旦超过出用于，立刻从栈中消失。
        2.堆（Heap）凡是new出来的东西都在堆中
        3.方法区
 */

public class shuzuTest02 {
    public static void main(String[] args) {
        //静态数组a
        int[] a = new int[3];
        System.out.println(a); //地址值
        System.out.println(a[0]); //1号元素
        System.out.println(a[1]);
        System.out.println(a[2]);

        //定义一个数组b
        int[]b = a; //将a传给b
        System.out.println(b); //a的地址值
        System.out.println(a[0]); //a的1号元素
        System.out.println(a[1]);
        System.out.println(a[2]);

        //给b的后两个元素赋值,由于引用数组，a数组的2，3号元素值也变成1，2
        b[1] = 1;
        b[2] = 2;
        System.out.println(b); //地址值
        System.out.println(a[0]); //1号元素
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
