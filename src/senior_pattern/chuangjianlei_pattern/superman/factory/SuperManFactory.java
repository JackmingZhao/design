package senior_pattern.chuangjianlei_pattern.superman.factory;

public class SuperManFactory {
	
	public static ISuperMan createSuperMan(String type) {
		ISuperMan superman = null;
		if(type.equals("adult")) {
			superman = new AdultSuperman();
		} else if (type.equals("child")) {
			superman = new ChildSuperMan();
		}
		return superman;
	}

}
