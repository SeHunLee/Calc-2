import java.util.Scanner;

public class OperClass {

	
	int num1;
	int num2;
	
	//AddClass ac;
	SubClass ac; 
	
	//Hab ac;
	//변해야 되는
	NumVo nc; //고정
	
	//생성자
	public OperClass() {
		System.out.println("계산기 프로그램");
		nc = new NumVo();
	}
	
	public void inputOp() {
		System.out.println("무슨 계산 ? 1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈");
		
	}
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		nc.setNum1(sc.nextInt());
		System.out.println("두번째 숫자 입력 : ");
		nc.setNum2(sc.nextInt());
		Sysyem.out.println("세번째숫자없나요")
	}

	public void printResult() {
		ac.clac(num1, num2);
	}
}
