package demo8;
/**
 * 工厂接口
 *
 */
interface IFactory {
	Operation CreateOperation();
}
 
 
package demo8;
/**
 * 具体工厂(Concrete Creator)角色：加法类工厂
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
 * 具体工厂(Concrete Creator)角色：减法类工厂
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
 * 具体工厂(Concrete Creator)角色：乘法类工厂
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
 * 具体工厂(Concrete Creator)角色：除法类工厂
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
 * 抽象产品(Product)角色：运算类
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
 * 具体产品(Concrete Product)角色：加法类
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
 * 具体产品(Concrete Product)角色：减法类
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
 * 具体产品(Concrete Product)角色：乘法类
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
 * 具体产品(Concrete Product)角色：除法类
 *
 */
public class OperationDiv extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		if (super.getNumberB() == 0)			
			throw new ArithmeticException("除数不能为0.");			
		result = super.getNumberA() / super.getNumberB();
		return result;
	}
}
 
 
package demo8;
/**
 * 客户端
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