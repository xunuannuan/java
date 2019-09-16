class Single
{
	//自己创建一个对象
	private static Single INSTANCE= new Single();
	private Single() {}     //私有化创造方法
	public static Single getInstance(){      //提供返回该对象的静态方法
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
