// ����Animal��ӿ�
interface Animal {    
	void shout(); // ������󷽷�shout()
}
// ����Cat��ʵ��Animal�ӿ�
class Cat implements Animal {    
     // ʵ��shout()����
	public void shout() {			  
		System.out.println("��������");
	}
     // ����sleep()����
	void sleep() {
		System.out.println("è˯������");
	}
}
// ����Dog��ʵ��Animal�ӿ�
class Dog implements Animal {
     // ʵ��shout()����
	public void shout() {			   
		System.out.println("��������");
	}
}
// ����������
public class Example15 {
	public static void main(String[] args) {
          Dog dog =new Dog(); // ����Dog���͵�ʵ������
		animalShout(dog);    // ����animalShout()��������dog��Ϊ��������
	}
     // ���徲̬����animalShout(),����һ��Animal���͵Ĳ���
	public static void animalShout(Animal animal) {
			Cat cat=(Cat)animal;   // ��Animal����ǿ��ת����Cat����       
			cat.sleep();            // ����cat��sleep()����
			cat.shout();            // ����cat��shout()����
	}
}
