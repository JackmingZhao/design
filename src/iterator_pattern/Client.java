package iterator_pattern;

/**
 * ������ģʽ
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) {
		// ����һ��List��������е���Ŀ����
		IProject project = new Project();
		// ���������ս��Ŀ
		project.add("�����ս��Ŀ", 10, 100000);
		// ����Ťתʱ����Ŀ
		project.add("Ťתʱ����Ŀ", 100, 10000000);
		// ���ӳ��˸�����Ŀ
		project.add("���˸�����Ŀ", 10000, 1000000000);
		// ���100����Ŀ
		for (int i =1; i < 5; i++) {
			project.add("��" + i + "����Ŀ", i * 5, i * 1000000);
		}
		//����һ��ArrayList�������е����ݶ�ȡ��
		IProjectIterator projectIterator = project.iterator();
		while(projectIterator.hasNext()) {
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}

}
