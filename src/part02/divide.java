package part02;

public class divide {

	public static int calc(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			System.out.println("0으로 나눌 수 없음");
			return a;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calc(6, 3));
	}

}
