package classMethod.human;

import classMethod.human.Human04;

public class ClassMethod04 {
    public static void main(String[] args) {
        // Human04�C���X�^���X�𐶐�����ƁA�R���X�g���N�^���̏��������s�����
        Human04 yamada = new Human04("�R�c");

        // �ÓI�����o�[�́A�C���X�^���X���������ɒ��ڎg�p�ł���
        Human04.staticMethodPrint();

        // static�ȃN���X�萔���C���X�^���X�𐶐������ɎQ�Ƃł���
        System.out.println(Human04.GREETING);

        // �C���X�^���X�����o�[�͒��ڎg�p�ł��Ȃ��i�R���p�C���G���[�ɂȂ�j
        // Human04.instanceMethodPrint();
        // System.out.println(Human04.name);

        // �C���X�^���X�����o�[�̓C���X�^���X�������Ă���g�p����
        yamada.instanceMethodPrint();
    }
}