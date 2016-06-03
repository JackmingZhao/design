package basic_pattern.decorator_pattern;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
	//����ȫ����߳ɼ�
	private void reportHighScore() {
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}
	//��������
	private void reportSort() {
		System.out.println("����������38��...");
	}
	
	@Override
	public void report() {
		this.reportHighScore();
		super.report();
		this.reportSort();
	}
	
}
