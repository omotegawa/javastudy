package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  Scanner s = new Scanner(System.in);
		  Random r = new Random();
		  int x = s.nextInt();
		  int y = r.nextInt(3);
		  
		  System.out.println(y);
		  if (x == y) {
			  System.out.println("正解");
		  }
		  else {
			  System.out.println("不正解");
		  }
		  
	}

}
