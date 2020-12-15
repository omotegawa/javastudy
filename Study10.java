package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int win =0;
		int lose = 0;
		System.out.println("じゃんけんしましょう");
		System.out.println("グーは１、チョキは２、パーは３を押してください");
		while(win <= 3 || lose <= 3) {			

			int x = s.nextInt();
			int y = r.nextInt(3)+1;
			
			System.out.println("あなたは" + x + "を出しました");
			System.out.println("コンピューターは" + y + "を出しました");
			if((x ==1 && y == 1)||(x == 2 && y == 2)||(x == 3 && y == 3) ) {
					System.out.println("あいこでした");
				}else if ((x ==1 && y == 2)||(x == 2 && y == 3)||(x == 3 && y == 1)) {
					System.out.println("あなたは勝ちました");
					win ++;
				}else if ((x ==1 && y == 3)||(x == 2 && y == 1)||(x == 3 && y == 2)) {
					System.out.println("あなたは負けました");
					lose ++ ;
				}
			System.out.println("あなたの勝数は" + win + "です");
			System.out.println("コンピューターの勝数は" + lose + "です");
		}
			if(win == 3) {
				System.out.println("あなたの勝ちです");
				System.out.println("おめでとう！！！");
				System.out.println("おみくじ結果");
				int q = r.nextInt(6)+1;
				if (q == 1) {
					System.out.println("大吉");
				}else if (q == 2) {
					System.out.println("吉");
				}else if (q == 3) {
					System.out.println("中吉");
				}else if (q == 4) {
					System.out.println("小吉");
				}else if (q == 5) {
					System.out.println("末吉");
					
				}else {
					System.out.println("凶");
				}			
			}else if(lose == 3) {
				System.out.println("あなたの負けです");
				System.out.println("次は頑張ってください");
			}
		}
	

}
