package cn.test.day2;

//遍历数组
public class shuzuTest04 {
    public static void main(String[] args) {
       //动态数组a
        int[]a = new int[5];
       for(int i = 0; i < 5; i++)
           System.out.println(a[i]);
           System.out.println("================");
       //静态数组b
        int[]b = new int[]{12, 13, 14, 15};
        for (int i = 0; i < 4; i++)
            System.out.println(b[i]);
        System.out.println("================");
        //用数组长度遍历
        int[]c = new int[]{12, 13, 14, 15, 16};
        for (int i = 0; i < c.length; i++)
            System.out.println(c[i]);
    }

}
