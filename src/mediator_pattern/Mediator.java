package mediator_pattern;

/*
 * 具体的中介实现类
 */
public class Mediator extends AbstractMediator {

	/*
	 * 具体的执行方法，在这里进行业务的判断
	 */
	public void execute(String str, Object... objects) {
		if (str.equals("purchase.buy")) {// 采购
			this.buyComputer((Integer)objects[0]);
		} else if (str.equals("sale.sell")) {// 卖
			this.sellComputer((Integer)objects[0]);
		} else if (str.equals("sale.offsell")) {// 打折卖
			this.offSell();
		} else if (str.equals("stock.clear")) {// 清库存
			this.clearStock();
		}
	}

	// 采购电脑
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) { // 销售情况良好
			System.out.println("采购IBM电脑:" + number + "台");
			super.stock.increaseStock(number);
		} else { // 销售情况不好
			int buyNumber = number / 2; // 折半采购
			System.out.println("采购IBM电脑：" + buyNumber + "台");
			super.stock.increaseStock(buyNumber);
		}
	}

	// 销售电脑
	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) { // 库存数量不够销售
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decreaseStock(number);
	}

	// 折价销售电脑
	private void offSell() {
		System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
	}

	// 清仓处理
	private void clearStock() {
		// 要求清仓销售
		super.sale.offsell();
		// 要求采购人员不要采购
		super.purchase.refuseBuy();
	}

}
