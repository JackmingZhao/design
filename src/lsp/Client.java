package lsp;

import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		//Father f = new Father();
		Son f = new Son();
		HashMap map = new HashMap();
		f.doSomething(map);
	}

}
