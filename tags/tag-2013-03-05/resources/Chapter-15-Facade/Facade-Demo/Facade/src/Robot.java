public class Robot {

	public void turnOn() {
		System.out.println("��������� �� �����");
	}

	public void turnOff() {
		System.out.println("���������� �� �����");
	}

	public void move(String material, String source, String destination) {
		System.out.println("����������� �� " + material + " �� " + source
				+ " � " + destination);
	}
}
