// ����ӿ�Anmal
interface Animal {    
	void shout();     // �������shout()����
}
// ����Cat��ʵ��Animal�ӿ�
class Cat implements Animal {
// ʵ��shout()����
	public void shout() {
		System.out.println("��������");
	}
}
// ����Dog��ʵ��Animal�ӿ�
class Dog implements Animal {
     // ʵ��shout()����
	public void shout() {
		System.out.println("��������");
	}
}
// ���������
public class Example13 {
	public static void main(String[] args) {
		Animal an1 = new Cat(); // ����Cat����,ʹ��Animal���͵ı���an1����
		Animal an2 = new Dog(); // ����Dog����,ʹ��Animal���͵ı���an2����
		animalShout(an1);        // ����animalShout()��������an1��Ϊ��������
		animalShout(an2);        // ����animalShout()��������an2��Ϊ��������
	}
     // ���徲̬��animalShout()����������һ��Animal���͵Ĳ���
	public static void animalShout(Animal an) {
		an.shout();               // ����ʵ�ʲ�����shout()����
	}
}
