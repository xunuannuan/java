package demo1;
 
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
 
 
package demo1;
 
public class OperationAdd extends Operation {
	
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() + super.getNumberB();
		return result;
	}
}
 
package demo1;
 
public class OperationSub extends Operation {
	
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() - super.getNumberB();
		return result;
	}
}
 
package demo1;
 
public class OperationMul extends Operation {
 
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() * super.getNumberB();
		return result;
	}
}
 
 
package demo1;
 
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
 
 
package demo1;
 
public class OperationFactory {
	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch (operate) {
			case "+":
				oper = new OperationAdd();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OperationDiv();
				break;
		}
		return oper;
	}
 
}
 
 
package demo1;
 
public class Demo1 {
	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperate("/");
		oper.setNumberA(10);
		oper.setNumberB(7);
		double result = oper.getResult();
		System.out.println(result);
	}
}