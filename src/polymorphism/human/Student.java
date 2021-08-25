package polymorphism.human;

public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	@Override
	public String getProfile() {
		String profile = "�N���" + super.age + "�ł��B";
		profile += "�w���ŁA�e�X�g�̓_����"+ this.score + "�ł��B";
		return profile;
	}
}
