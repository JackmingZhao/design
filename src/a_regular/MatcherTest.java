package a_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatcherTest {
	
	public static void main(String[] args) {
		String expstr = "1+2*(2-((2-3)*4+3)=)/(2-1+)";
		//Pattern p = Pattern.compile("(?<!\\d)\\(");
		Pattern p = Pattern.compile("(?<![\\+\\-])\\)");
		Matcher m = p.matcher(expstr);
		for(;;) {
			if(m.find())
				System.out.println(m.group());
		}
	}
	
	public void interpreterString(String expstr) {
		
	}
}
