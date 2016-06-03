package basic_pattern.responsibility_chain_pattern;

/**
 * 抽象古代女人对象
 * @author lenovo
 *
 */
public interface IWomen {
	//获取个人情况（未婚，已婚，丧夫）
	public int getType();
	//个人请求，是去逛街，约会，看电影？
	public String getRequest();

}
