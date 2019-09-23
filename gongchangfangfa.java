package demo8;
/**
 * �����ӿ�
 *
 */
interface IFactory {
	Operation CreateOperation();
}
 
 
package demo8;
/**
 * ���幤��(Concrete Creator)��ɫ���ӷ��๤��
 *
 */
public class AddFactory implements IFactory {
	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}	
}
 
 
package demo8;
/**
 * ���幤��(Concrete Creator)��ɫ�������๤��
 *
 */
public class SubFactory implements IFactory {
	@Override
	public Operation CreateOperation() {		
		return new OperationSub();
	}
}
 
 
package demo8;
/**
 * ���幤��(Concrete Creator)��ɫ���˷��๤��
 *
 */
public class MulFactory implements IFactory {
	@Override
	public Operation CreateOperation() {		
		return new OperationMul();
	}
}
 
 
package demo8;
/**
 * ���幤��(Concrete Creator)��ɫ�������๤��
 *
 */
public class DivFactory implements IFactory {
	@Override
	public Operation CreateOperation() {		
		return new OperationDiv();
	}
}
 
 
package demo8;
/**
 * �����Ʒ(Product)��ɫ��������
 *
 */
public abstract class Operation {
	private double numberA = 0;
	private double numberB = 0;
 
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	public double getNumberA() {
		return numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public double getResult() {
		double result = 0;
		return result;
	}	
}
 
 
package demo8;
/**
 * �����Ʒ(Concrete Product)��ɫ���ӷ���
 *
 */
public class OperationAdd extends Operation {	
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() + super.getNumberB();
		return result;
	}
}
 
 
package demo8;
/**
 * �����Ʒ(Concrete Product)��ɫ��������
 *
 */
public class OperationSub extends Operation {	
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() - super.getNumberB();
		return result;
	}
}
 
 
package demo8;
/**
 * �����Ʒ(Concrete Product)��ɫ���˷���
 *
 */
public class OperationMul extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() * super.getNumberB();
		return result;
	}
}
 
 
package demo8;
/**
 * �����Ʒ(Concrete Product)��ɫ��������
 *
 */
public class OperationDiv extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		if (super.getNumberB() == 0)			
			throw new ArithmeticException("��������Ϊ0.");			
		result = super.getNumberA() / super.getNumberB();
		return result;
	}
}
 
 
package demo8;
/**
 * �ͻ���
 *
 */
public class Demo8 {
	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();		
		Operation oper = operFactory.CreateOperation();
		oper.setNumberA(10);
		oper.setNumberB(7);
		double result = oper.getResult();
		System.out.println(result);
	}
}