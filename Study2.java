package javastudy;

public class Study2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number1 =20;
		int number2 =20;
		if (number1<number2 ){
			System.out.println(number2);
		}else if(number1>number2){
			System.out.println(number1);
		}
		
		if(number1 != number2 ) {
			System.out.println("違う値です");
		}
		
		int age = 38;
		if(age < 20) {
			System.out.println("未成年");
		}else if (age < 30) {
			System.out.println("２０代");
		}else if (age < 40) {
			System.out.println("３０代");
		}else {
			System.out.println("４０代以上 ");
		}
		
		 
		for (int number=1; number<=9 ; number ++ ) {
			System.out.print(7* number + " ");
		}
		
		int point1= 60;
		int point2= 39;
		int sum= point1 + point2;
		
		System.out.println(sum);
	
		if(point1 < 40) {
			System.out.println("追試");
		}else if(point2 < 40) {
			System.out.println("追試");
		}else if(sum >= 160) {
			System.out.println("優");
		}else if(139 < sum) {
			System.out.println("良");
		}else if(99 < sum) {
			System.out.println("可");
		}else {
			System.out.println("追試");
		}
			
		int i= 6;
		if (i % 2 == 0 && i > 0) {
			System.out.println("正の偶数");
		}else if ( i % 2 == 1) {
			System.out.println("正の奇数");
		}else if ( i % 2 == 0 ) {
			System.out.println("負の偶数");
		}else {
			System.out.println("負の奇数");
		}
		
		
	}

}
