package cn.test.day2;

//怎样获取数组长度
//数组的长度运行期间不可以改变
public class shuzuTest03 {
    public static void main(String[] args) {
        int[]a = new int[]{1, 2, 3, 4, 5};
        int len = a.length;
        System.out.println("a数组长度是" + len);

        int[]b = a;
        System.out.println("b数组长度的" + b.length);

        int[]c = new int[3];
        System.out.println("c数组长度的" + c.length);
    }
}
