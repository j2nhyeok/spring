import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.catalina.connector.InputBuffer;

public class Main4 {
	public static void main(String[] args) throws IOException {
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";
		
		
//		Pattern p = Pattern.compile("[A-Z]{9}");
//		Matcher m1 = p.matcher(line2);
//		System.out.println(m1.matches()); // matches는 뭘까? 해당 정규 표현식이랑 비교하는 문자열이랑 표현이 일치할 때 true.
//											// 소문자 9자라서 true????
		
//		Pattern p = Pattern.compile("[0-9a-z]{6}");
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());
		
		
		// 아이디는 영소문자와 숫자로 이루어져야 하고,최소 6자 최대 10자임.(영문자로 시작해야 합니다.)
//		Pattern p = Pattern.compile("[a-z][a-z0-9]{5,9}");
//		System.out.println("아이디를 입력하세요.");
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String id = bf.readLine();
//		
//		Matcher m = p.matcher(id);
//		
//		if(m.matches()) {
//			System.out.println("굿");
//		}else {
//			
//			System.out.println("낫 굿");
//		}
		
		
		
		
		
		
		String regex = "(010)-([0-9]{4})-([0-9]{4})";
		String line = "010-1234-567899999";
		
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(line);
		
		m1.find();
		System.out.println(m1.end(0));
//		System.out.println(p1.matcher("010-1234-5678").matches());
//		System.out.println(p1.matcher("010-2345-5678").matches());
//		System.out.println(p1.matcher("010-5734-5678").matches());
//		System.out.println(p1.matcher("010-1234-2341").matches());
//		System.out.println(p1.matcher("010-ewr3-5678").matches());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
