package template_method_pattern;

public class ConcreteClass1 extends AbstractClass {
	private boolean isRun = true;

	@Override
	protected void doanything() {
		System.out.println("ģ��ʵ����1doanything()����.......");
	}

	@Override
	protected void dosomething() {
		System.out.println("ģ��ʵ����1dosomething()����.......");
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
