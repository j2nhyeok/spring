package person;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonValidator {
	// 이름, 성 10자
	// 나이 정수
	// 이메일 고유 50자
	public PersonValidator() {
	}

	public Map<String, String> isValidName(String name) {

		Map<String, String> map = new HashMap<>();
		if (name != null) {
			int length = name.length();
			if (length == 0 || length > 10) {
				map.put("nameLength", "이름의 글자수는 1 ~10 까지");
			}

			if (name.contains(" ")) {
				map.put("nameSpace", "공백 포함 불가");
			}

			Pattern p = Pattern.compile("[가-힣A-Za-z]{1,10}");
			Matcher m = p.matcher(name);

			if (!m.matches()) {

				map.put("nameChar", "이름은 한글 또는 영문자임");
			} 
		}else {
			map.put("nameNull", "이름 입력하셈");
		}
		return map;

	}

	public Map<String, String> isValidAge(int age) {
		Map<String, String> map = new HashMap<>();

		if (String.valueOf(age) != null) {
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(String.valueOf(age));

			if (!m.matches()) {
				map.put("ageFormat", "나이는 숫자만 허용 됩니다.");

			} else {
				int num = age;

				if (num < 15 || num > 99) {
					map.put("ageRange", "나이의 범위는 15 ~99세 까지");
				}
			}
		} else {
			map.put("ageNull", "나이를 입력해");
		}

		return map;
	}

}
