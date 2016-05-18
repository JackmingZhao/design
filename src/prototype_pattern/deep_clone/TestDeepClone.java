package prototype_pattern.deep_clone;

public class TestDeepClone {

	public static void main(String[] args) {
		PrototypeSe po = new PrototypeSe();
		po.setName("test1");
		NewPrototypeSe se = new NewPrototypeSe();
		se.setPrototype(po);

		NewPrototypeSe deepClone = (NewPrototypeSe) se.deepClone();
		deepClone.getPrototype().setName("test2");

		System.out.println("original name:" + se.getPrototype().getName());
		System.out.println("cloned name:" + deepClone.getPrototype().getName());
	}

}
