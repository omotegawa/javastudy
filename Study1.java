package javastudy;

public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 8;
		int r = 1;
		for(int n = 1 ; n <= m ; n ++) {
			r  = r * 2;
			System.out.print(r + " ");
		}
		
		System.out.println();
				
		double weight = 68.6;
		double height = 2.5;
		double BMI = weight / (height * height) ;
		if (BMI > 25) {
			System.out.println("肥満");
		}else if (18.5 < BMI) {
			System.out.println("標準");
		}else {
			System.out.println("低体重");
		}
		
	}

}
