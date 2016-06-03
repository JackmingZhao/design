package basic_pattern.bridge_pattern;

public class HouseCorp extends Corp {
	
	public HouseCorp(House house) {
		super(house);
	}

	// 房地产公司很High了，赚钱，计算利润
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

}
