// ����Student��
class Student {
	final String name; // ʹ��final�ؼ�������name����
     // ����introduce()��������ӡѧ����Ϣ
	public void introduce() {
		System.out.println("����һ��ѧ�����ҽ�" + name);
	}
}
// ���������
public class Example09 {
	public static void main(String[] args) {
		Student stu = new Student();	// ����Student���ʵ������					
		stu.introduce();  // ����Student��introduce()����
	}
}
