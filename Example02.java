// ����Animal��
class Animal {		
    //���嶯��еķ���		
	void shout() {			  
		System.out.println("���﷢������");
	}
}
// ����Dog��̳ж�����
class Dog extends Animal {    
	// ���幷�еķ���
	void shout() {			 
		System.out.println("��������");
	}
}
// ���������
public class Example02 {	
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����Dog���ʵ������
		dog.shout();           // ����dog��д��shout()����
	}
}
