package javastudy;

public class Study14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String BMI = bmi(1.6,90);
		System.out.println(BMI);
	}
	static String bmi(double height ,double  weight) {
		double bmi = weight / (height * height);
		String x = "";
		if(bmi > 25) {
			 x ="肥満";
		}else if(bmi > 18.5) {
			 x = "標準";
		}else {
			 x = "低体重";
		}
		return x;
	}
}
