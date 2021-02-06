package cn.test.mxdx3;

import java.util.Arrays;

public class mxdx {
    public static void main(String[] args) {
        int[]a = {10, 20, 30, 40, 50};

        //要求打印格式为【10，20，30，40，50】
        //使用面向过程每一步细节都要亲力亲为。
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            //如果输出的是最后一个元素
            if(i == a.length - 1)
                System.out.print(a[i] + "]");
            //否则
            else
                System.out.print(a[i] + ",");
        }

        //格式：Arrays.toString(数组名称)
        //使用面向对象
        //找到一个jdk给我们提供好的Arrays类
        //其中有一个toString方法，就能把数组变成想要格式的字符串
        System.out.println(Arrays.toString(a));
    }
}
