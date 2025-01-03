package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void check(String[] keyword) {
		HashMap<String, String> dicMap = new HashMap<String, String>();

		dicMap.put("apple", "りんご");
		dicMap.put("peach", "桃");
		dicMap.put("banana", "バナナ");
		dicMap.put("lemon", "レモン");
		dicMap.put("pear", "梨");
		dicMap.put("kiwi", "キウイ");
		dicMap.put("strawberry", "いちご");
		dicMap.put("grape", "ぶどう");
		dicMap.put("muscat", "マスカット");
		dicMap.put("cherry", "さくらんぼ");

		for (String word : keyword) {
			String mean = dicMap.get(word);
			if (mean == null) {
				System.out.println(word + "は辞書に存在しません");
			} else {
				System.out.println(word + "の意味は" + mean);
			}
		}
	}
}
