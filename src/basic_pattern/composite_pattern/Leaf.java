package basic_pattern.composite_pattern;

/*
 * 叶子节点
 */
public class Leaf extends Corp {

	// 就写一个构造函数，这个是必需的
	public Leaf(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}

}
