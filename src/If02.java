
public class If02 {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + " ��5�����ł��B");
		}else if (number < 10) {
			System.out.println(number + " ��5�ȏ�A10�����ł��B");
		}else if (number < 15) {
			System.out.println(number + " ��10�ȏ�A15�����ł��B");
		}else {
			System.out.println(number + " ��15�����ł͂���܂���B");
		}
	}
}
