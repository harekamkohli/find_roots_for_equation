package lab_7;
import java.util.*;

class QE{
	private double a=1,b=1,c=1;
	
	public QE() {}
	
	public QE(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double getA(int a) {
		this.a=a;
		return a;
	}
	
	public double getB(int b) {
		this.b =b;
		return b;
	}
	
	public double getC(int c) {
		this.c =c;
		return c;
	}

	public double getdiscriminant() {
		double z= b*b- 4*a*c;
		return z;
	}
	
	public double getroot1() {
		double root1= (-b-(Math.pow(b*b- 4*a*c,0.5)))/(2*a);
		return root1;
	}
	
	public double getroot2() {
		double root2= (-b+(Math.pow(b*b- 4*a*c,0.5)))/(2*a);
		return root2;
	}
	
}
public class lab722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the a, b ,and c for equation: (ax*x+ bx+ c).");
		double a1 = input.nextDouble();
		double b1= input.nextDouble();
		double c1= input.nextDouble();
		
		QE equation = new QE(a1,b1,c1);
		
		//double x=getdiscriminant();

		if(equation.getdiscriminant()==0) {
			System.out.println(equation.getroot1());
		}
		else if(equation.getdiscriminant()>0) {
			System.out.println("Its two roots are:");
			System.out.println("1st root is: "+ equation.getroot1()+ " and 2nd root is:"+ equation.getroot2());
		}
		else {
			System.out.println("no roots.");
		}
	}

}
