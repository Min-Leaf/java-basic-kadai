package kadai_015;

public class Car_Chapter15 {
	// フィールド：1速から5速のギアを表す
	private int gear = 1;
	// ギアチェンジ後の速度を表す
	private int speed = 10;

	// メゾット：ギアの値により速度を変える
	public void gearChange(int afterGear) {
		switch (afterGear) {
		case 1 -> {
			gear = 1;
			speed = 10;
		}
		case 2 -> {
			gear = 2;
			speed = 20;
		}
		case 3 -> {
			gear = 3;
			speed = 30;
		}
		case 4 -> {
			gear = 4;
			speed = 40;
		}
		case 5 -> {
			gear = 5;
			speed = 50;
		}
		default -> {
			gear = 1;
			speed = 10;
		}
		}
	}

	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.printf("ギア1から%dに切り替えました\n", gear);
		System.out.printf("速度は時速%dkmです\n", speed);
	}
}