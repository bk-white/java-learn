package cn.test.day2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
数组的概念： 是一种容器，可以同时存放多个数据值。

数组的特点：
1.数组是一种引用数据类型
2.数组当中多个数据，类型必须统一
3.数组的长度在程序运行期间不可改变

数组初始化：在内存中创建一个数组，并向其中赋予一些默认值。

两种初始化方式：
1.动态初始化（指定长度）
2.静态初始化（指定内容）

动态初始化数组格式：
数据类型[] 数组名称 = new 数据类型[数组长度];

静态初始化数组格式：
数据类型[] 数组名称 = new 数据类型[]{元素1， 元素2...}

解析含义：
右侧new代表长江数组的动作
左右两边数据类型形同

使用建议：
如果不确定数组当中的具体内容用动态初始化，否则用静态初始化。
*/
public class shuzuTest01 {
    public static void main(String[] args) {
        int[] a = new int[3];
        //动态int数组,长度3
        String[] b = new String[]{"hello", "world" };
        //静态String数组，长度2
        System.out.println(b[0]);
    }

}
