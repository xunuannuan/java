class Single
{
	//�Լ�����һ������
	private static Single INSTANCE= new Single();
	private Single() {}     //˽�л����췽��
	public static Single getInstance(){      //�ṩ���ظö���ľ�̬����
		return INSTANCE;
	}
}
class danli
{
	public static void main(String[] args){
	Single s1=Single.getInstance();

                Single s2=Single.getInstance();
                System.out .println(s1==s2); 
                }
}
