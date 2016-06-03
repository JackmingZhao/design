package basic_pattern.state_pattern;

/**
 * 具体的状态变化引起的功能变化，电梯们敞门状态
 * 
 * 电梯敞门状态时，只能进行开门功能或关门功能
 * @author lenovo
 *
 */
public class OpenningState extends LiftState {

	@Override
	public void open() {
		//实际中这里是具体的业务处理，这个状态就是由这个功能引起的
		System.out.println("电梯门开启...");
	}

	//过渡的状态
	@Override
	public void close() {
		//状态修改
		super.context.setLiftState(Context.closeingState);
		//动作委托为CloseState来执行
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
