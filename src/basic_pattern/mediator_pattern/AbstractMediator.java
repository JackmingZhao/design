package basic_pattern.mediator_pattern;

/*
 * 抽象的中介类通过构造函数或其他方式将业务所需对象传递进来
 * 并制定一个抽象的执行方法，交给子类去完成执行的业务逻辑
 */
public abstract class AbstractMediator {

	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	// 构造函数
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	// 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
	public abstract void execute(String str, Object... objects);

}
