package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	private static final String[] CHOICES = { "r", "s", "p" };
	private static final Map<String, String> HAND_MAP = new HashMap<>() {
		{
			put("r", "グー");
			put("s", "チョキ");
			put("p", "パー");
		}
	};

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myChoice;

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			myChoice = scanner.nextLine().toLowerCase();
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				break;
			}
			System.out.println("入力が正しくありません。もう一度入力してください。");
		}

		return myChoice;
	}

	public String getRandom() {
		int randomIndex = (int) Math.floor(Math.random() * 3);
		return CHOICES[randomIndex];
	}

	public void playGame(String myChoice, String opponentChoice) {
		System.out.println("自分の手は" + HAND_MAP.get(myChoice) + ",対戦相手の手は" + HAND_MAP.get(opponentChoice));

		if (myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
				(myChoice.equals("s") && opponentChoice.equals("p")) ||
				(myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}