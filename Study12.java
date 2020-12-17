package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		Scanner s = new Scanner(System.in);
//		答えの数字を作る
		int[] answer=new int[3];
		for(int i = 0 ; i < answer.length ; i ++) {
			answer[i] = r.nextInt(10);
			while(answer[0]==answer[1]) {
				answer[1] = r.nextInt(10);
			}
			while((answer[0]==answer[2])||(answer[1]==answer[2])) {
				answer[2] = r.nextInt(10);
			}
		}
		
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		
//		ルール説明
		System.out.println("これから数字当てゲームをします");
		System.out.println("数字と桁があっていればヒット");
		System.out.println("数字のみあっていればブローを表示します");
		System.out.println("３桁当てることができたら終了です");
		System.out.println("それでは始めます");
		System.out.println("一回目の挑戦です");
		System.out.println("好きな数字を３回打ってください");
//		数字を入力
		int hit = 0;
		int blow = 0;
		int chalenge = 1;
		int[] user_answer= new int [3];	
			for(int n = 0 ; n < user_answer.length ;n ++) {
				System.out.println(n + "回目");
				user_answer[n] = s.nextInt();
			}
//		答えを求める
		while(true) {
			hit = 0;
			blow = 0;
			for( int i = 0; i < 3 ; i++) {
				for(int n = 0 ; n < 3 ; n ++) {
						if(answer[i]==user_answer[n]) {
							if(i == n) {								
								hit ++;
							}else {							
								blow ++ ;
							}																				
					}
				}
			}
			if(hit == 3) {
				System.out.println("正解");
				break;	
			}else {
				System.out.println("hit" + hit + "blow" + blow);
				System.out.println("もう一度!");
				chalenge ++;
				System.out.println(chalenge + "回目の挑戦です");
				for(int n = 0 ; n < user_answer.length ;n ++) {
					System.out.println(n + "回目");
					user_answer[n] = s.nextInt();
				}
			}	
		}
	}		
}

		
		
	

