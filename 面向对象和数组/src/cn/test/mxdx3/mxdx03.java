package cn.test.mxdx3;
import cn.test.mxdx3.mxdx02;

/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

1.导包：就是指出需要使用的类，在上面位。
import 包名称.类名称;
import cn.test.day03.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建，格式：
类名称 对象名 = new 类名称（）；
Student stu = new Student（）；

3.使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）

注意事项：
如果成员变量每一天进行赋值，那么将会有一个默认值，规则和数组一样
*/
public class mxdx03 {

    public static void main(String[] args) {

        //创建格式
        //类名称 对象名 = new 类名称（）；
        mxdx02 stu = new mxdx02();
        //调用成员变量：对象名.成员变量名
        System.out.println(stu.name); // 当前没赋值string类型为null
        stu.name = "张三";
        stu.age = 18;
        stu.num = 1;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.num);

        //使用成员方法：对象名.成员方法名（参数）
        stu.stady();
        stu.eat();
        stu.stady();




    }
}
