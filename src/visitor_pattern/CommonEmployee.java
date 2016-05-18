package visitor_pattern;

/**
 * ��ͨԱ��ʵ���࣬��������ʵ����
 * 
 * @author lenovo
 *
 */
public class CommonEmployee extends Employee {
	// �������ݣ���ǳ���Ҫ���Ժ��ְҵ�滮���ǿ�����
	// ���۲����Լ���ҵ�񷽷�
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	//��������߷���
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
