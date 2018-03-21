/**
 *
 * @author xekid78
 *
 */
public class Cngifprocess {

	public static void main(String[] args) {
		Multiply mul = new Multiply();
		mul.method3("掛け算");
		mul.method2();

	}

}

interface Calc2 {
	public String STR = "足し算";
	public int A = 7;
	public int B = 8;

	void method1();
	void method2();
	void method3(String s);
}

class Add2 implements Calc2 {
	public void method1() {
        System.out.println(STR + "をします");
    }

	public void method3(String str) {
        System.out.println(str + "をします");
    }

    public void method2() {
        System.out.println(A + " + " + B + " は " + (A + B) + " です。");
    }
}

class Multiply implements Calc2{
	public void method1() {
        System.out.println(STR + "をします");
    }

    public void method3(String str) {
        System.out.println(str + "をします");
    }
    public void method2() {
    	System.out.println(A + " x " + B + " は " + (A * B) + " です。");
    }

}
