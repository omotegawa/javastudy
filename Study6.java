package javastudy;

import java.util.Scanner;

public class Study6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner s = new Scanner(System.in);
		 int total = 0;
		 int[] n = new int [5];
		 for(int i=0; i < n.length ; ++i) {
			 n[i] = s.nextInt();
			 total += n[i];
		 }
		 System.out.println(total);
		 
	}

}
