package composite_pattern;

import java.util.ArrayList;

/*
 * ��֧�ڵ�
 */
public class Branch extends Corp {

	// ���캯���Ǳ����
	public Branch(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}

	// ���е��¼�
	ArrayList<Corp> subordinateList = new ArrayList<Corp>();

	// ���һ���¼���������Ҷ�ӽڵ㣬Ҳ�����Ƿ�֧�ڵ�
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}

	// �ҵ��¼�
	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}

}
