package me.blue.il.hebrew.fix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

	public static String fixMessage(String msg) {
		if (!isHebrew(msg)) return msg;
		return fixFromWordsArray(msg.split(" "));
	}

	public static boolean isHebrew(String str) {
		if (str == null) return false;
		Pattern p = Pattern.compile("\\p{InHebrew}");
		Matcher m = p.matcher(str);
		return m.find();
	}
	
	public static String fixFromWordsArray(String[] words) {
		String result = "";
		for (int i = words.length - 1; i > -1; i--) {
			if (isHebrew(words[i])) {
				for (int j = words[i].length() - 1; j > -1; j--)
					result += words[i].charAt(j);
			} else {
				for (int j = 0; j < words[i].length(); j++)
					result += words[i].charAt(j);
			}
			result += " ";
		}
		return result.trim();
	}
	
}
