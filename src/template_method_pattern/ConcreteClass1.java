package template_method_pattern;

public class ConcreteClass1 extends AbstractClass {
	private boolean isRun = true;

	@Override
	protected void doanything() {
		System.out.println("模板实现类1doanything()方法.......");
	}

	@Override
	protected void dosomething() {
		System.out.println("模板实现类1dosomething()方法.......");
	}
	
	@Override
	protected boolean isRun() {
		System.out.println("concrete1 hook");
		return this.isRun;
	}
	
	public void setIsRun(boolean isRun) {
		this.isRun=isRun;
	}

}
