/*
switch����ʹ��ע�����
1�����case�����ֵ�������ظ�

2��switch�����С���ŵ���ֻ���������������ͣ�
�����������ͣ� byte/stort/char/int
������������:String�ַ�����enumö��

3��switch����ʽ���к���ǰ��˳���еߵ�������break��仹����ʡ�ԡ�
ƥ�䵽��һ��case�ʹ��Ǹ�λ������ִ��֪������break������
*/
public class Test10{
	public static void main(String[] args){
		int num = 1;
		switch(num){
			case 1:
				System.out.println("aaa");
				break;
			case 2:
				System.out.println("bbb");
				break;
			default:
				System.out.println("ccc");
				break��
		}
	}
}