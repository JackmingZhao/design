package senior_pattern.chuangjianlei_pattern.superman.builder;

public class Director {
	
	private static AdultSuperManBuilder adultBuilder = new AdultSuperManBuilder();
	private static ChildSuperManBuilder childBuilder = new ChildSuperManBuilder();
	
	public static SuperMan getAdultSuperMan() {
		return adultBuilder.getSuperMan();
	}
	
	public static SuperMan getChildSuperMan() {
		return childBuilder.getSuperMan();
	}

}
