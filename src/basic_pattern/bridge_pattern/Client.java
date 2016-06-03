package basic_pattern.bridge_pattern;

public class Client {

	public static void main(String[] args) {
		House house = new House();
		System.out.println("-------���ز���˾���������е�-------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println();
		Product product = new IPod();
		Mp4 mp4 = new Mp4();
		System.out.println("-------��װ��˾���������е�-------");
		ShanzaiCorp shanCorp = new ShanzaiCorp(mp4);
		shanCorp.makeMoney();
	}
	
}
