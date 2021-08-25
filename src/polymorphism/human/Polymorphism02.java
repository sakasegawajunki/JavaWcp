package polymorphism.human;

import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism02 {
	public static void main(String[] args) {
       Human human = new Student("����", 17, 70);
	
       Polymorphism02 polymorphism = new Polymorphism02();
       polymorphism.printName();
       polymorphism.printName("���{");
       polymorphism.printName("���{", "����");
       polymorphism.printName(human);
	}
	   public void printName() {
	        System.out.println("����ł��B");
	    }

	    public void printName(String name) {
	        System.out.println(name + "�ł��B");
	    }

	    public void printName(String name1, String name2) {
	        System.out.println(name1 + "��" + name2 + "�ł��B");
	    }

	    public void printName(Human human) {
	        System.out.println(human.getName() + "�ł��B");
	    }
}
