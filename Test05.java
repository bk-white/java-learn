/*
�루���ң� && ȫ������true������true
�򣨻��ߣ� || ������һ����true������true
�ǣ�ȡ���� �� ������true �����false�� ������false�����true

ע�����
1.�߼������ֻ������booleanֵ��
2.�롢����Ҫ���Ҹ�����һ��booleanֵ��ȡ��ֻҪ��Ψһһ��booleanֵ��
3.�롢���������������ж��������������д��

tips
����1 < x <4�������Ӧ�ò�������֣�Ȼ��ʹ�����������������
int x = 2;
1 < x && x < 4
*/

public class Test05{
	public static void main(String[] args){
		System.out.println(true && false); // false
		System.out.println(true || false); // true
		//��·
		int a =10;
		System.out.println(3 > 4 && ++a < 100);// ����Ѿ�false���ұ�û�н��� a=10
	}
	
}