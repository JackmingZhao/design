package composite_pattern;

import java.util.ArrayList;

/*
 * 分支节点
 */
public class Branch extends Corp {

	// 构造函数是必需的
	public Branch(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}

	// 所有的下级
	ArrayList<Corp> subordinateList = new ArrayList<Corp>();

	// 添加一个下级，可能是叶子节点，也可能是分支节点
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}

	// 我的下级
	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}

}
