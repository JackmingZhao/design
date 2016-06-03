package basic_pattern.template_method_pattern;

public class ConcreteClass2 extends AbstractClass {

	@Override
	protected void doanything() {
		System.out.println("模板实现类2doanything()方法.......");
	}

	@Override
	protected void dosomething() {
		System.out.println("模板实现类2dosomething()方法.......");
	}

}
