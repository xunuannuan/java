class Person
{
	public Person () {
		System.out.println("�޲εĹ��췽���������ˡ���");
	}
	public Person (String name){
		this();       //�����޲εĹ��췽��
		System.out.println("�вεĹ��췽�������á���");
	}
}
public class feidanli
{
	public static void main (String[] args) {
		Person p=new Person("itcast");
	}
}