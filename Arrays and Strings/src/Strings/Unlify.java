package Strings;

public class Unlify {

	public static void main(String[] args) {
		System.out.println(replaceAll("Mr John Smith ".toCharArray(), 13));
		System.out.println(replaceAll("Mr Benedict Cumberbatch  ".toCharArray(), 23));
	}

	private static String replaceAll(char[] str, int trueLenght) {
		int whiteSpace = 0, newLength = 0, i = 0;
		for (i = 0; i < trueLenght; i++) {
			if(' ' == str[i])
				whiteSpace++;
		}
		newLength = trueLenght + whiteSpace * 2;
		if (trueLenght < str.length) str[trueLenght] = '\0';
		char[] ch = new char[newLength];
		for (i = trueLenght - 1; i >= 0; i--) {
			if(' ' == str[i]) {
				ch[newLength - 1] = '0';
				ch[newLength - 2] = '2';
				ch[newLength - 3] = '%';
				newLength -= 3;
			}else {
				ch[newLength - 1] = str[i];
				newLength--;
			}
		}
		return String.valueOf(ch);
		
//		return str.trim().replaceAll("\\s", "%20");  // String is immutable so that is wrong i created new string and return it
	}

}
