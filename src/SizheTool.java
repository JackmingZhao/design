import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SizheTool {
	public static void main(String[] args) {
		try {
			System.out.println(jisuanStr("11.2+3.1*(423-(2+5.7*3.4)+5.6)-6.4/(15.5+24)"));
		} catch (Exception e) {
			System.out.println("���������ʽ��ʽ");
			e.printStackTrace();
		}
	}

	/**
	 * �����ʽ��ĸ���Ԫ�ز������Ӧ����λ��<br>
	 * 
	 * @param str
	 * @return
	 */
	public static List<String> splitStr(String string) throws Exception {
		List<String> listSplit = new ArrayList<String>();
		Matcher matcher = Pattern.compile("//-?//d+(//.//d+)?|[*/()]|//-").matcher(string);
		// �������ֳ�ÿ��Ԫ��
		while (matcher.find()) {
			// System.out.println(matcher.group(0));
			listSplit.add(matcher.group(0));
		}
		System.out.println("listSplit.size:"+listSplit.size());
		return listSplit;
	}

	/**
	 * ����<br>
	 * ���裺1�����������<br>
	 * Ȼ��ȡ��һ�������(���� ���㵱ǰ������������ʽ �����ڼ������²������� �Դ�����,ֱ��ѭ��ʹ�õ���������Ԫ�� 
	 * ������ϣ�����˳�����š��˳����Ӽ���
	 * 
	 * @param str
	 * @return
	 */
	public static double jisuanStr(String str) throws Exception {
		double returnDouble = 0;
		List<String> listSplit = splitStr(str);
		// ��ֺõ�Ԫ��
		List<Integer> zKuohaoIdxList = new ArrayList<Integer>();// ������,<�������꣬>
		if (Pattern.compile(".*//(|//).*").matcher(str).find()) {// ���������������
			String value = "";// �����ַ�ֵ
			int zIdx = 0;// ��һ����������zKuoHaoIdxList���±�
			// �˲�ѭ���������������������ʽ
			List<String> tempList = new ArrayList<String>();// ǰ��û�м����Ԫ��
			int removeL = 0;
			int tempListSize = 0;
			for (int i = 0; i < listSplit.size(); i++) {
				value = listSplit.get(i);
				tempList.add(value);
				tempListSize = tempList.size();
				if ("(".equals(value)) {// ������
					zKuohaoIdxList.add(tempListSize - 1);
				} else if (")".equals(value)) {// ���������žͼ�������һ�����ż����ʽ
					zIdx = zKuohaoIdxList.size() - 1;// �뵱ǰ��������������������
					int start = zKuohaoIdxList.get(zIdx);
					returnDouble = jisuan(tempList, start + 1, tempListSize - 1);
					// ��ʼλ��,������һ��������
					removeL = tempListSize - start;
					tempList = removeUseList(tempList, removeL);// �Ƴ���ʹ�õ�Ԫ��
					tempList.add(returnDouble + "");// �ոռ����ֵ��ӽ���
					zKuohaoIdxList.remove(zIdx);// ��������������
				}
			} // �����м�����
			returnDouble = jisuan(tempList, 0, tempList.size());
		} else {// û����������
			returnDouble = jisuan(listSplit, 0, listSplit.size());
		}
		return returnDouble;
	}

	/**
	 * * ����ɾ�����ù���Ԫ��
	 * 
	 * @param list
	 * @param removeLength
	 *            ����
	 * @return
	 */
	public static List<String> removeUseList(List<String> list, int removeLength) {
		int le = list.size() - removeLength;
		for (int i = list.size() - 1; i >= le; i--) {
			list.remove(i);
		}
		return list;
	}

	/**
	 * * ������ʽ
	 * 
	 * @param listSplit
	 * @param start
	 *            ������ʽ��ʼ��λ��
	 * @param end
	 *            ���Ž�����λ��
	 * @return
	 */
	public static double jisuan(List<String> listSplit, int start, int end)
			throws Exception {
		double returnValue = 0;
		String strValue = null;// ��ʱ����
		List<String> jjValueList = new ArrayList<String>();// ʣ�µļӼ�Ԫ��
		// ��������˳���
		for (int i = start; i < end; i++) {
			strValue = listSplit.get(i);
			if ("*".equals(strValue) || "/".equals(strValue)) {// �˳�
				strValue = jisuanValue("*".equals(strValue) ? "*" : "/", Double.parseDouble(jjValueList.get(jjValueList.size() - 1)), Double.parseDouble(listSplit.get(i + 1))) + "";
				jjValueList.remove(jjValueList.size() - 1);
				i++;
			}
			jjValueList.add(strValue);
		}

		// ��������Ӽ�
		for (int j = 0; j < jjValueList.size(); j++) {
			strValue = jjValueList.get(j);
			if ("-".equals(strValue) || "+".equals(strValue)) {
				returnValue = jisuanValue("-".equals(strValue) ? "-" : "+",
						returnValue, Double.parseDouble(jjValueList.get(j + 1)));
				j++;
			} else {
				returnValue += Double.parseDouble(jjValueList.get(j));
			}
		}
		return returnValue;
	}

	/**
	 * ����2������ļӼ��˳����� �磺2*5 ��2/5
	 * 
	 * @param type
	 *            �����
	 * @param start
	 *            ���൱������2
	 * @param end
	 *            ���� �൱������5
	 * @return
	 */
	public static double jisuanValue(String type, double start, double end)
			throws Exception {
		double d = 0;
		if ("-".equals(type)) {
			d = start - end;
		} else if ("+".equals(type)) {
			d = start + end;
		} else if ("*".equals(type)) {
			d = start * end;
		} else if ("/".equals(type)) {
			if (0 == start || 0 == end)
				d = 0;
			else
				d = start / end;
		}
		return d;
	}
}
