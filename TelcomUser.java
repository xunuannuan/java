package user;

import java.util.Date;
import java.util.Random;
import production.*;
public class TelcomUser implements User{
	private String phoneNumber;
	private String callTo;
	private StringBuffer commucationRecords;
	public TelcomUser(String phoneNumber){
		this.phoneNumber=phoneNumber;
		this.commucationRecords=new StringBuffer();
	}
	public void generateCommucationRecord(){
		int recordNum=new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++){
			long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
			long timeEnd=timeStart+60000+new Random().nextInt(600000);
			callTo=this.getCallToPhoneNumber();
			this.commucationRecords.append(this.phoneNumber+","+timeStart+","+timeEnd+","+this.callTo+";");
		}
	}
	public String getCallToPhoneNumber(){
			return "1765631"+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10));
	}
	public String accountFee(long timeStart,long timeEnd){
		double feePerMinute=0.2;
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return String.format("%.4f",feeTotal);
	}
	public void printDetails(){
		String allRecords=this.commucationRecords.toString();
		String []recordArray=allRecords.split(";");
		for(int i=0;i<recordArray.length;i++){
			String []recordField=recordArray[i].split(",");
			System.out.println("����:"+recordField[0]);
			System.out.println("����:"+recordField[3]);
			System.out.println("ͨ����ʼʱ��:"+new Date(Long.parseLong(recordField[1])));
			System.out.println("ͨ������ʱ��:"+new Date(Long.parseLong(recordField[2])));
			System.out.println("�Ʒ�:"+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))+"Ԫ");
		}
	}
}
