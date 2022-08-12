import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	public static void main(String[] args) {
		String line = "1 HE2llo. 3 wor4ld! 5";
		
		Pattern p =  Pattern.compile("[0-9]"); // 대괄호에 문자에 대한 범위를 설정할 수 있다.
		
		Matcher m = p.matcher(line);
		
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		
	}

}
