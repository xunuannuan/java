public class Example20 {                      
	public static void main(String[] args) {
		int result = divide(4, 0);     // ����divide()����
		System.out.println(result);    
	}
    //����ķ���ʵ���������������
	public static int divide(int x, int y) { 
		int result = x / y;            // ����һ������result��¼����������Ľ��
		return result;                  // ���������
	}
}
