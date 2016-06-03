package basic_pattern.responsibility_chain_pattern;

/**
 * 责任链最关键的抽象类，负责将消息传递下去，并进行业务处理
 * @author lenovo
 *
 */
public abstract class IHandler {
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	//能够处理的级别
	private int level = 0;
	//责任传递，下一个责任人是谁
	private IHandler nextHandler; 
	//每个类都需要说明一下自己能处理哪些请求
	public IHandler(int _level) {
		this.level=_level;
	}
	//处理古代女人的请求
	public final void handerlMessage(IWomen women) {
		if(women.getType() == this.level) {
			this.response(women);
		} else {
			if(this.nextHandler != null) {//说明有后续环节，把请求往后传
				this.nextHandler.handerlMessage(women);
			} else 
				System.out.println("---没地方请示了，按不同意处理---\n");
		}
	}
	
	//如果不是你这个处理级别就传递给下一个级别，如女儿出嫁了，问父亲我能否去逛街，父亲就会说，去问你丈夫
	public void setNest(IHandler handler) {
		this.nextHandler=handler;
	}
	
	protected abstract void response(IWomen women);

}
