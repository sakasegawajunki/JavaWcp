package classMethod.human;

public class Human03 {
    public String name;
    public int age;
    public String profession;

    public Human03() {
        this.name = "�R�c";
        this.age = 20;
        this.profession = "�v���O���}�[";
    }

    //String�^�̖߂�l��Ԃ������Ȃ��̃��\�b�h���`
    public String getProfile() {
        return "�N���" + this.age + "�A�E�Ƃ�" + this.profession;
    }

    //�߂�l��Ԃ��Ȃ��AString�^�̈�����1�Ƃ郁�\�b�h���`
    public void greet(String friend) {
        if (friend == null) { //String�^�̒l��null�̉\��������̂Ń`�F�b�N
            System.out.println("���A����F�B���킩��܂���I");
            return;
        }
        System.out.println(friend + "����A����ɂ��́I");
    }
}
