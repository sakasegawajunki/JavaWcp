
public class Chapter07 {
	public static void main(String[] args) {
		int distance = 12;
		if (distance <= 5) {
			System.out.println("�ƂĂ��߂��ł�");	
		} else if (distance <= 10) {
			System.out.println("�߂��ł�");
		}else if (distance <= 15) {
			System.out.println("�����ł�");
		}else {
			System.out.println("�ƂĂ������ł�");
		}		
		String color = "yellow"; // ��Ƃ���yellow�ŏ������B���̐F�ł��ǂ�
		switch(color) {
		case "red" :
			System.out.println("�ԐM���ł�");
			break;
		case "yellow" :
			System.out.println("���M���ł�");
			break;
		case "blue" :
			System.out.println("�M���ł�");
			break;
		default:
			System.out.println("�M���̐F�ł͂���܂���");
	}

   }
}
