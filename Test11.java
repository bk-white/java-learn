/*
ѭ�����Ļ�����ɲ��֣�һ���Ϊ�ĸ����֣�

1.��ʼ����䣺��ѭ����ʼ���ִ�У�����ֻ��Ψһһ�Ρ�
2.�����жϣ������������ѭ�����У��������˳���
3��ѭ���壺�ظ�Ҫ�����������ݣ���������䡣
������䣺ÿ��ѭ��ֻ�ᶼҪ����ɨβ������

whileѭ����

��׼��ʽ��
while�������жϣ�{
	ѭ����
}

��չ��ʽ��
��ʼ����䣻
while�������жϣ�{
	ѭ����
	������䣻
}

do-whileѭ����׼��ʽ��
do{
	ѭ����
	�������;
}while(�����ж�);
*/

public class Test11{
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			System.out.println(i);
		}
		System.out.println("ֹͣ");
		whil();
		dow();
	}
	
	public static void whil(){
		int i = 1;//��ʼ�����
		while(i <= 3){//�����ж�
			System.out.println(i);//ѭ����
			i++;
		}
	}
	public static void dow(){
		int i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i <= 3);
	}
}