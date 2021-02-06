package cn.test.day2;
/*
数组可以作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的是数组的地址值

希望一个方法中多个结果返回可以使用数组
 */
public class shuzuTest07 {

    public static void main(String[] args) {

        int[]a = {1, 2, 3, 4}; //定义数组a并赋值
        printA(a);// 调用方法printA中的a的地址值
        printA(a);

        //printB(21,23);
        double[]B  = printB(21,23); //将B数组的地址值赋值给B数组
        System.out.println(B[0]);
        System.out.println(B[1]);
    }

    //测试创建printA方法
    public static void printA(int[]a){
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    //返回多个结果用数组
    public static double[] printB(int a, int b){
        int sum;
        double avg;
        sum = a + b;
        avg = sum / 2;
        double[]B =  new double[]{sum, avg};
        return B;
    }
}
