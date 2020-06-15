


public class Test12{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1; i <= 100; i++)
			if(i % 2 == 0)
				sum = sum + i;
		System.out.println(sum);
		con();
	}
	
	public static void con(){
		int sum = 0;
		for(int i = 1; i <= 5; i++)
			if(i == 3)
				continue;//跳过当前循环,不要3
		System.out.println(sum);
	}
	
	public static void hour(){
		
		for(int hour = 0; hour < 24; hour++){
			for(int m = 1; m <= 59; m++){
				System.out.println(hour + "小时" + m + "分钟");
			}
		}
	}
}