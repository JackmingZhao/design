package senior_pattern.chuangjianlei_pattern.superman.builder;

public class Client {
	
	public static void main(String[] args) {
		SuperMan adultSuperMan = Director.getChildSuperMan();
		System.out.println(adultSuperMan.getSpecialTalent());
	}

}
