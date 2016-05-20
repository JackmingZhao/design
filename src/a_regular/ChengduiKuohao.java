package a_regular;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ChengduiKuohao {

	public static void main(String[] args) {
		String s = "a+b*(c-((d-e)*h+i))/(f-g)";
		Pattern p = Pattern.compile("(?<!\\d)\\(");
		List<Char> list = new ArrayList<Char>();
		while(s != null && s.indexOf("(") != -1) {
			//���������ַ�����ȡ��ÿ�ζ��᷵��һ������֮��Ĵ���ֻҪ���л���(����Ϊ�գ�������ѭ��
			//s = getString(s, list);
			try {
				s = splitString(s, list);
			} catch (Exception e) {
				System.out.println("����������");
				break;
			}
		}
		for (Char c : list) {
			System.out.println(c.str.substring(c.startIndex, c.endIndex + 1));
		}
		//splitString(s);
	}
	
	// ÿ�ν�ȡ�Ĵ�������list��
	public static String splitString(String str, List<Char> list) throws Exception {
		char[] cs = str.toCharArray();
		Char ch = new Char();//��������Bean
		boolean isStart = false;// �����ж��ַ����Ŀ�ͷ�ǲ���(
		ch.str = str;// ����Ҫ��ȡ���ַ�����str
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if(c == '(') {
				// �����(����¼�Ǳ꣬����¼�ǵڼ��㣬����ѭ�����ҵ���֮��Ӧ��)��Ȼ����н�ȡ������list
				if(!isStart) {
					// �����ʼ����(���ŵĻ�����ֹ�����ŵĻ���(���Ž���һ���ĽǱ긲��
					ch.startIndex=i;
					isStart = true;
				}
				ch.layer++;
			} else if(c == ')' && ch.layer>0) {
				// �����)����¼�Ǳ꣬����������1��ֱ������0��˵���Ѿ�����˱������������ű���
				if(--ch.layer == 0) {
					ch.endIndex=i;
					list.add(ch);
					if(i != cs.length-1) {// ���û��ѭ������β��˵����߻��д�û�н��н������������н���
						String last = str.substring(i+1);// �ӱ��ε���һ���Ǳ꿪ʼ
						while(last!=null && last.indexOf("(")!=-1) {// ���ʣ�µĴ�û�������ˣ��Ͳ����ٽ��н�����
							last = splitString(last, list);
						}
					}
					break;// ����Ѿ�����β�ˣ�����ѭ��
				}
			}
		}
		// ÿ�ν�ȡ֮����ַ���������(��ͷ����)�������ַ������ڽ����´ν�ȡ��ʱ��Ӧ�ý�ͷ��β������ȥ����
		// ��֤�ж������ʱ��׼ȷ�ԣ��Լ����ٲ���Ҫ��ѭ������
		return str.substring(ch.startIndex + 1, ch.endIndex);
	}

	public static String getString(String str, List<Char> list) {
		char[] cs = str.toCharArray();
		boolean isStart = false;
		Char ch = new Char();
		ch.str = str;
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c == '(') {
				if (!isStart) {
					ch.startIndex = i;
					isStart = true;
				}
				ch.layer++;
			} else if (c == ')' && ch.layer > 0) {
				if (--ch.layer == 0) {
					ch.endIndex = i;
					list.add(ch);
					if (i != cs.length - 1) {
						String last = str.substring(i + 1);
						while (last != null && last.indexOf("(") != -1) {
							last = getString(last, list);
						}
					}
					break;
				}
			}
		}
		if (ch.endIndex != 0) {
			return str.substring(ch.startIndex + 1, ch.endIndex);
		}
		return null;
	}

}

class Char {
	int startIndex;// (���±�
	int endIndex;// )���±�
	int layer;// ��¼һ���������ţ�������Ϊ0ʱ���ſ��Խ��н�ȡ��һ��
	String str;// ���α���ֵĴ�
}