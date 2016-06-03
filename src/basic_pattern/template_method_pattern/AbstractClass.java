package basic_pattern.template_method_pattern;

public abstract class AbstractClass {
	
	protected abstract void doanything();
	protected abstract void dosomething();
	//判断是否运行doanything()方法(钩子方法Hook Method)
	protected boolean isRun() {
		System.out.println("abstract hook");
		return true;
	}
	
	public void templateMethod() {
		System.out.println("执行模板方法了......");
		if(this.isRun()) {
			this.doanything();
		}
		this.dosomething();
	}

}
