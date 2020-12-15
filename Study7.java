package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  Random r = new Random();
		  Scanner s = new Scanner(System.in);
		  int y = r.nextInt(10)+1;
		  int b = r.nextInt(10)+1;
		  
		  
		  int sum = y + b;
		  
		  System.out.println("ランダムで出てくる２つの数字が１１以上だと思ったら１を、未満だと思ったら２を入力してください");
		 
		  int x = s.nextInt();
		 if (x == 1) {
			 if(sum >= 11) {
				 System.out.println("あたり");
			 }else {
				 System.out.println("ハズレ");
			 }
		 }else if(x == 2){
			 if(sum <= 10) {
				 System.out.println("あたり");
			 }else {
				 System.out.println("ハズレ");
			 } 
		 }
		 System.out.println("1つ目の数字は" + y + "でした");
		 System.out.println("2つ目の数字は" + b + "でした");
		 System.out.println("合計の数字は" + sum + "でした");
		 
		  
	}
	
		

}
