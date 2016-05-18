package iterator_pattern;

import java.util.ArrayList;

public class Project implements IProject {
	// ����һ��˽�е��б����е�ҵ�����ݶ�������
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	// ��Ŀ����
	private String name = "";
	// ��Ŀ���Ա����
	private int num = 0;
	// ��Ŀ����
	private int cost = 0;

	Project() {

	}

	public Project(String name, int num, int cost) {
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	// ������Ŀ
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name, num, cost));
	}

	// �õ���Ŀ����Ϣ
	public String getProjectInfo() {
		String info = "";
		// �����Ŀ������
		info = info + "��Ŀ�����ǣ�" + this.name;
		// �����Ŀ����
		info = info + "\t��Ŀ����: " + this.num;
		// ��Ŀ����
		info = info + "\t ��Ŀ���ã�" + this.cost;
		return info;
	}

	// ����һ����������
	public IProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}

}
