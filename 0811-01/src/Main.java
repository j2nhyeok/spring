import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String line = "This is a book.";
		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher(line);
		
		//System.out.println(m.lookingAt()); // 시작이 일치할 때 트루.
		boolean find = m.find();
		System.out.println(find);
		
		if(find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}
		

		
	}
}
