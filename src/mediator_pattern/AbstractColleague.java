package mediator_pattern;
/*
 * �����ͬ���࣬���췽������Ҫ���ݽ���һ���н飨���ĸ��н����ľ������飩
 */
public class AbstractColleague {
	protected AbstractMediator mediator;
	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}

}
