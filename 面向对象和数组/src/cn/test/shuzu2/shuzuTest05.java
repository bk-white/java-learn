package cn.test.day2;

//数组最值
public class shuzuTest05 {
    public static void main(String[] args) {
       //初始化数组
        int[]a = new int[]{1, 3, 4, 7, 5};
        //第一号元素赋值
        int max = a[0];
        for(int i = 0; i < a.length; i++)
            //如果当前比较的元素小于max，则换下一个，否则将大的元素赋给max
            if(a[i] > max)
                max = a[i];
        System.out.println(max);

        //最小值
        int min = a[0];
        for(int i = 0; i < a.length; i++)
            if(a[i] < min)
                min = a[i];
        System.out.println(min);

    }
}
