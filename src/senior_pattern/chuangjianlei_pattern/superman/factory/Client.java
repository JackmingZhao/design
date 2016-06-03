package senior_pattern.chuangjianlei_pattern.superman.factory;

public class Client {

	public static void main(String[] args) {
		ISuperMan superMan = SuperManFactory.createSuperMan("child");
		superMan.specialTalent();
	}

}
