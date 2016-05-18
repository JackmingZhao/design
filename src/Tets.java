import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Tets {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(?<=^.{3})(.*?)(?=@)");

		// matcher
		Matcher m = p.matcher("ace.wang.100@gmail.com");

		// replace
		String newstring = m.replaceAll("***");
		System.out.println(newstring);
		
		p = Pattern.compile("(?<=\\d)(?=(\\d{3})+$)");
		m = p.matcher("1234567899");
		String tring = m.replaceAll(",");
		System.out.println(tring);
	}

}
