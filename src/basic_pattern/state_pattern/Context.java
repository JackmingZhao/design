package basic_pattern.state_pattern;

/**
 * �����ķ�װ�࣬��װ����״̬�仯����Ĺ��ܱ仯
 * 
 * @author lenovo
 *
 */
public class Context {
	// ��������еĿ���״̬
	public final static OpenningState openningState = new OpenningState();
	public final static ClosingState closeingState = new ClosingState();
	public final static RunningState runningState = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();
	// ����һ����ǰ״̬
	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		// �ѵ�ǰ�Ļ���֪ͨ������ʵ������
		this.liftState.setContext(this);
	}

	public void open() {
		this.liftState.open();
	}

	public void close() {
		this.liftState.close();
	}

	public void run() {
		this.liftState.run();
	}

	public void stop() {
		this.liftState.stop();
	}
}
