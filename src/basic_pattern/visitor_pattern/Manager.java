package basic_pattern.visitor_pattern;

/**
 * 经理实现类，被访问者实现类
 * 
 * @author lenovo
 *
 */
public class Manager extends Employee {
	// 这类人物的职责非常明确：业绩
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
