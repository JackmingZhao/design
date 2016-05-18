package visitor_pattern;

/**
 * �ɷ������Լ�����������Ҫʲô���͵ģ�����ʲô��ʽ������
 * @author lenovo
 *
 */
public class Visitor implements IVisitor {
	
	//���ž���Ĺ���ϵ����5
	private final static int MANAGER_COEFFICIENT = 5;
	//Ա���Ĺ���ϵ����2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	//��ͨԱ���Ĺ����ܺ�
	private int commonTotalSalary = 0;
	//���ž���Ĺ����ܺ�
	private int managerTotalSalary =0;

	@Override
	public void visit(CommonEmployee employee) {
		System.out.println(this.getCommonEmployee(employee));
	}

	@Override
	public void visit(Manager employee) {
		System.out.println(this.getManagerInfo(employee));
	}
	
	//��װ��������Ϣ
	private String getBasicInfo(Employee employee){
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�" + (employee.getSex() == Employee.FEMALE?"Ů":"��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}

	// ��װ����ͨԱ����Ϣ
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		this.calManagerSalary(commonEmployee.getSalary());
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "������" + commonEmployee.getJob() + "\t";
		return basicInfo + otherInfo;
	}
	
	//��װ�����ž������Ϣ
	private String getManagerInfo(Manager manager){
		this.calCommonSlary(manager.getSalary());
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "ҵ����"+manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}
	
	//���㾭��Ĺ���
	private void calManagerSalary(int salary) {
		this.managerTotalSalary=this.managerTotalSalary+salary*MANAGER_COEFFICIENT;
	}
	//������ͨԱ���Ĺ����ܺ�
	private void calCommonSlary(int salary){
		this.commonTotalSalary = this.commonTotalSalary + salary*COMMONEMPLOYEE_COEFFICIENT;
	}
	@Override
	public int getTotalSalary() {
		return this.commonTotalSalary + this.managerTotalSalary;
	}

}
