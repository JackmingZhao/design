package visitor_pattern;

/**
 * Ա���ĳ����࣬��������
 * @author lenovo
 *
 */
public abstract class Employee {
	public final static int MALE = 0; //0����������
	public final static int FEMALE = 1; //1������Ů��
	private int salary;
	private String name;
	private int sex;
	
	//���÷�����,��������߷��ʱ���
	public abstract void accept(IVisitor visitor);

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
