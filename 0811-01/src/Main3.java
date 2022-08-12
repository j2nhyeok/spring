import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "123 he234llo. 39 wor48ld! 57";

		Pattern p = Pattern.compile("[0-9]{2,3}"); // 대괄호에 문자에 대한 범위를 설정할 수 있다. {}에는 몇개로 묶여져있?
													//{2,3}은 두자리 숫자에서 3자리 숫자 사이

		Matcher m = p.matcher(line);

		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
	}

}
