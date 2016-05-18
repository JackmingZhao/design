package visitor_pattern;

public interface IVisitor {
	
	//重载的函数，通过不同被访问者进行区别。定义可以访问的员工角色
	public void visit(CommonEmployee employee);
	
	public void visit(Manager employee);
	//统计所有员工工资总和
	public int getTotalSalary();

}
