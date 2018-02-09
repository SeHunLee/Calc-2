
public class SubClass implements Hab {

	public void clac(NumVo nc) {
		System.out.println("빼기 연산");
		int num1 = nc.getNum1();
		int num2 = nc.getNum2();
		System.out.println();
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
}
