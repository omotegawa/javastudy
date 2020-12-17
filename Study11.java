package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		Scanner s = new Scanner(System.in);
//		数字をランダムで作成する
		int answer =  r.nextInt(100)+1;
		System.out.println(answer);
//		ゲームの説明
		System.out.println("これから数字当てゲームをしてもらいます");
		System.out.println("１から１００までで好きな数字を入れてください");
		System.out.println("高いときはhigh");
		System.out.println("低いときはlowを表示します");
		System.out.println("８回目までに当ててください");
		System.out.println("当てないと負けです");
		System.out.println("では始めます");
		System.out.println("１回目");
//		数字を入力する
		int  user_answer =  s.nextInt();
		for(int challenge = 1 ; challenge < 9 ; challenge ++) {			
			if (answer > user_answer) {
				System.out.println("low");
				System.out.println(challenge +"回目" );
				user_answer =  s.nextInt();
			}else if (answer < user_answer) {
				System.out.println("high");
				System.out.println(challenge +"回目" );
				user_answer =  s.nextInt();
			}else if (answer == user_answer){
				System.out.println("正解です");
				break;
			}
		}
		
	}		
		
	}

