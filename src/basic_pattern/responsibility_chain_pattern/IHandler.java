package basic_pattern.responsibility_chain_pattern;

/**
 * ��������ؼ��ĳ����࣬������Ϣ������ȥ��������ҵ����
 * @author lenovo
 *
 */
public abstract class IHandler {
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	//�ܹ�����ļ���
	private int level = 0;
	//���δ��ݣ���һ����������˭
	private IHandler nextHandler; 
	//ÿ���඼��Ҫ˵��һ���Լ��ܴ�����Щ����
	public IHandler(int _level) {
		this.level=_level;
	}
	//����Ŵ�Ů�˵�����
	public final void handerlMessage(IWomen women) {
		if(women.getType() == this.level) {
			this.response(women);
		} else {
			if(this.nextHandler != null) {//˵���к������ڣ�����������
				this.nextHandler.handerlMessage(women);
			} else 
				System.out.println("---û�ط���ʾ�ˣ�����ͬ�⴦��---\n");
		}
	}
	
	//������������������ʹ��ݸ���һ��������Ů�������ˣ��ʸ������ܷ�ȥ��֣����׾ͻ�˵��ȥ�����ɷ�
	public void setNest(IHandler handler) {
		this.nextHandler=handler;
	}
	
	protected abstract void response(IWomen women);

}
