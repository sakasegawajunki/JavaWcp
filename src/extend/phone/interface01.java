package extend.phone;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class interface01 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

        System.out.println("�d�b�ԍ��͍ő�" + MobilePhone.MAX_NUMBER_DIGITS + "���ł��B");
        mobilePhone.call("99-8888-7777");
        interface01.classTakePicture(mobilePhone);
    }

    public static void classTakePicture(Camera camera) {
        camera.takePicture();
    }
}