package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		// 太郎のインスタンスを生成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setGivenName();
		taro.execIntroduce();

		// 一郎のインスタンスを生成
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setGivenName();
		ichiro.execIntroduce();

		// 花子のインスタンスを生成
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName();
		hanako.execIntroduce();
	}
}