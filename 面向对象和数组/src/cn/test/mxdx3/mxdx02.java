package cn.test.mxdx3;


/*
定义一个学生类
属性：姓名，年龄，学号
行为：学习，吃饭，睡觉

注意事项：
成员变量直接定义在类当中，在方法外。
成员方法不要写static关键字。
 */
public class mxdx02 {

        //成员变量
        String name;
        int age;
        int num;

        //成员方法
        public void eat(){
            System.out.println("吃饭");
        }
        public void stady(){
            System.out.println("学习");
        }
        public void sleep(){
            System.out.println("睡觉");
        }

}
