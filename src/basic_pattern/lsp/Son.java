package basic_pattern.lsp;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {
	
	public Collection doSomething(Map map) {
		System.out.println("子类被执行....");
		return map.values();
	}

}
