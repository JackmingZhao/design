package template_method_pattern;

public class Client {
	
	public static void main(String[] args) {
		ConcreteClass1 clazz1 = new ConcreteClass1();
		clazz1.setIsRun(false);
		clazz1.templateMethod();
		System.out.println("-------------------------------------");
		ConcreteClass2 clazz2 = new ConcreteClass2();
		clazz2.templateMethod();
	}

}
