package classMethod.human;

public class Human04 {
	static public int humanCount = 0;
	public String name;
	public static final String GREETING = "����ɂ���";
	
	public Human04(String name) {
		this.name = name;
		Human04.humanCount++;
	}
    static public void staticMethodPrint() {
        // static���\�b�h����C���X�^���X�ϐ��͎g�p�ł��Ȃ��i�R���p�C���G���[�j
        // System.out.println("���O�́A" + name);
        // static�ϐ���humanCount��\��
        System.out.println("�l�̐���" + Human04.humanCount);
    }

    public void instanceMethodPrint() {
        // �C���X�^���X�ϐ���name��\��
        System.out.println("���O��" + name);
    }	
}
