// ���������Animal
abstract class Animal { 
     // ������󷽷�shout()
	abstract void shout(); 
}
// ����Dog��̳г�����Animal
class Dog extends Animal {
     // ʵ�ֳ��󷽷�shout()
	void shout() {
		System.out.println("��������");
	}
}
// ���������
public class Example10 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����Dog���ʵ������
		dog.shout(); // ����dog�����ǵ�shout()����
	}
}
