// ������Animal�ӿ�
interface Animal {
	int ID = 1;       // ����ȫ�ֳ���
	void breathe();  // ������󷽷�breathe()
	void run();      // ������󷽷�run()
}

// Dog��ʵ����Animal�ӿ�
class Dog implements Animal {
	//ʵ��breathe()����
	public void breathe() {
		System.out.println("���ں���");
	}
	//ʵ��run()����
	public void run() {
		System.out.println("������");
	} 
}
// ���������
public class Example11 {
	public static void main(String args[]) {
		Dog dog = new Dog(); //����Dog���ʵ������
		dog.breathe();        //����Dog���breathe()����
		dog.run();             //����Dog���run()����
	}
}
