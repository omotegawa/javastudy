package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		while(true) {			
		System.out.println("じゃんけんしましょう");
		System.out.println("グーは0、チョキは1、パーは2を押してください");
				
		int x = s.nextInt();
		String[] n = new String[3];
		 n[0] = "グー";
		 n[1] = "チョキ";
		 n[2] = "パー";
		int y = r.nextInt(3);
		
		
		System.out.println("あなたは" + n[x] + "を出しました");
		System.out.println("コンピューターは" + n[y]+ "を出しました");
		if(x == y) {
			System.out.println("あいこでした");
			System.out.println("もう一度です");
		}else if ((x ==0 && y == 1)||(x == 1 && y == 2)||(x == 2 && y == 0)) {
			System.out.println("あなたは勝ちました");
			break;
		}else if ((x ==0 && y == 2)||(x == 1 && y == 0)||(x == 2 && y == 1)) {
			System.out.println("あなたは負けました");
			break;
		}
		}
		
	}

}
