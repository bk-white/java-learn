package cn.test.day2;
/*
数组元素反转
只能用一个数组进行反转
*/
public class shuzuTest06 {
    public static void main(String[] args) {
        //初始化数组
        int[]a = new int[]{1, 2, 3, 4};
        //打印原来的数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //反转数组元素
        for (int min = 0, max = a.length - 1; min < max; min++, max--) {
            int t;
            t = a[min];
            a[min] = a[max];
            a[max] = t;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
