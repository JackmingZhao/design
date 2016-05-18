package visitor_pattern;

/**
 * 普通员工实现类，被访问者实现类
 * 
 * @author lenovo
 *
 */
public class CommonEmployee extends Employee {
	// 工作内容，这非常重要，以后的职业规划就是靠它了
	// 被观察者自己的业务方法
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	//允许访问者访问
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
