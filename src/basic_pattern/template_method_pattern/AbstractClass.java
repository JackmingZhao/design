package basic_pattern.template_method_pattern;

public abstract class AbstractClass {
	
	protected abstract void doanything();
	protected abstract void dosomething();
	//�ж��Ƿ�����doanything()����(���ӷ���Hook Method)
	protected boolean isRun() {
		System.out.println("abstract hook");
		return true;
	}
	
	public void templateMethod() {
		System.out.println("ִ��ģ�巽����......");
		if(this.isRun()) {
			this.doanything();
		}
		this.dosomething();
	}

}
