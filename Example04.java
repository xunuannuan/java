// ����Animal��
class Animal {
	// ����Animal���вεĹ��췽��
	public Animal(String name) { 
		System.out.println("����һֻ" + name);
	}
}
// ����Dog��̳�Animal��
class Dog extends Animal {
	public Dog() {
		super("ɳƤ��");          // ���ø����вεĹ��췽��
	}
}
// ���������
public class Example04 {
	public static void main(String[] args) {
		Dog dog = new Dog();   // ʵ��������Dog����
	}
}
