package mediator_pattern;
/*
 * 抽象的同事类，构造方法中需要传递进来一个中介（是哪个中介做的具体事情）
 */
public class AbstractColleague {
	protected AbstractMediator mediator;
	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}

}
