package code1020;

public class Code04 {

	public static void main(String[] args) {
		Taxi people=new Taxi();
		Thread taxi=new Thread(people,"1��˾��");
		Thread taxi2=new Thread(people,"2��˾��");
		Thread taxi3=new Thread(people,"3��˾��");
		Thread taxi4=new Thread(people,"4��˾��");
		Thread taxi5=new Thread(people,"5��˾��");
		taxi.start();
		taxi2.start();
		taxi3.start();
		taxi4.start();
		taxi5.start();
	}
}
class Taxi implements Runnable{
	int num=100;
	boolean flag=false;
	public void run(){
		while(true){
			if(num>0&&flag==false){
				flag=true;
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th+"���ڽӵ�"+num+"����");
				num--;
				flag=false;
			}
		}
	}
}