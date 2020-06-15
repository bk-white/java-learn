public class Test08{
	public static void main(String[] args){
		int num = 13;
		
		if(num % 2 == 0){//如果能够整除2，说明是偶数}
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
		one();
		two();
	}
	
	public static void one(){
		int x = 10;
		int y;
		if(x >= 3){
			y = 2 * x + 1;
		}else if(-1 < x && x < 3){
			y = 2 * x;
		}else{
			y = 2 * x - 1;
		}
		System.out.println("结果是：" + y);
	}
	
	public static void two(){
		int score = 98;
		if(score >= 90 && score <= 100){
			System.out.println("优秀");
		}else if(score >= 80 && score <= 90){
			System.out.println("好");
		}else if(score >= 70 && score <= 80){
			System.out.println("良");
		}else if(score >= 60 && score <= 70){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
	}
}