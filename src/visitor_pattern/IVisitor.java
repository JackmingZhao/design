package visitor_pattern;

public interface IVisitor {
	
	//���صĺ�����ͨ����ͬ�������߽������𡣶�����Է��ʵ�Ա����ɫ
	public void visit(CommonEmployee employee);
	
	public void visit(Manager employee);
	//ͳ������Ա�������ܺ�
	public int getTotalSalary();

}
