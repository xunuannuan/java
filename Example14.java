// ����Animal�ӿ�
interface Animal {    
	void shout(); // ������󷽷�shout()
}
// ����Cat��ʵ��Animal�ӿ�
class Cat implements Animal {   
     // ʵ�ֳ��󷽷�shout()
	public void shout() {			  
		System.out.println("��������");
	}
     // ����sleep()����
	void sleep() {
		System.out.println("è˯������");
	}
}
// ��������� 
public class Example14 {
	public static void main(String[] args) {
         Cat cat = new Cat(); // ����Cat���ʵ������
		animalShout(cat);    // ����animalShout()��������cat��Ϊ��������
	}
     // ���徲̬����animalShout()������һ��Animal���͵Ĳ���
	public static void animalShout(Animal animal) {
		animal.shout();  // ���ô������animal��shout()����
		animal.sleep();  // ���ô������animal��sleep()����
	}
}
