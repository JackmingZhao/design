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
			//迭代进行字符串截取，每次都会返回一个处理之后的串，只要串中还有(或者为空，就跳出循环
			//s = getString(s, list);
			try {
				s = splitString(s, list);
			} catch (Exception e) {
				System.out.println("方程有问题");
				break;
			}
		}
		for (Char c : list) {
			System.out.println(c.str.substring(c.startIndex, c.endIndex + 1));
		}
		//splitString(s);
	}
	
	// 每次截取的串都放入list中
	public static String splitString(String str, List<Char> list) throws Exception {
		char[] cs = str.toCharArray();
		Char ch = new Char();//括号内容Bean
		boolean isStart = false;// 用于判断字符串的开头是不是(
		ch.str = str;// 本次要截取的字符串是str
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if(c == '(') {
				// 如果是(，记录角标，并记录是第几层，继续循环，找到与之对应的)，然后进行截取并存入list
				if(!isStart) {
					// 如果开始就是(括号的话，防止紧接着的还是(括号将第一个的角标覆盖
					ch.startIndex=i;
					isStart = true;
				}
				ch.layer++;
			} else if(c == ')' && ch.layer>0) {
				// 如果是)，记录角标，并将层数减1，直至等于0，说明已经完成了本次最外层的括号比配
				if(--ch.layer == 0) {
					ch.endIndex=i;
					list.add(ch);
					if(i != cs.length-1) {// 如果没有循环到结尾，说明后边还有串没有进行解析，继续进行解析
						String last = str.substring(i+1);// 从本次的下一个角标开始
						while(last!=null && last.indexOf("(")!=-1) {// 如果剩下的串没有括号了，就不必再进行解析了
							last = splitString(last, list);
						}
					}
					break;// 如果已经到结尾了，跳出循环
				}
			}
		}
		// 每次截取之后的字符串都是以(开头，以)结束的字符串，在进行下次截取的时候，应该将头和尾的括号去掉，
		// 保证有多层括号时的准确性，以及减少不必要的循环次数
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
	int startIndex;// (的下标
	int endIndex;// )的下标
	int layer;// 记录一共几层括号，当层数为0时，才可以进行截取第一层
	String str;// 本次被拆分的串
}