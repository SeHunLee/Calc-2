import java.util.Scanner;

public class OperClass {

	
	int num1;
	int num2;
	
	//AddClass ac;
	SubClass ac; 
	
	//Hab ac;
	//���ؾ� �Ǵ�
	NumVo nc; //����
	
	//������
	public OperClass() {
		System.out.println("���� ���α׷�");
		nc = new NumVo();
	}
	
	public void inputOp() {
		System.out.println("���� ��� ? 1. ���� 2. ���� 3. ���� 4. ������");
		
	}
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		nc.setNum1(sc.nextInt());
		System.out.println("�ι�° ���� �Է� : ");
		nc.setNum2(sc.nextInt());
	}

	public void printResult() {
		ac.clac(num1, num2);
	}
}
