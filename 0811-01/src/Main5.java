import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
		//Pattern p = Pattern.compile("[a-zA-Z]");
		Pattern p = Pattern.compile("\\w+");     // 정규표현식에서 \w는 글자 하나. \w{3,7}하면 3자리에서 7자리 사이. {3, }생략하면 3글자 이상.
				
												// \w+는 한 자 이상. \w?는 0이거나 1 \w*는 0 이상.
		// \w 문자.
		// \d 숫자.
		// \s 공백.
	}
}
