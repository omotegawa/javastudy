package javastudy;

import java.util.Random;

public class Study8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		String name[] =new String[6];
		
		name[0]= "大吉";
		name[1]= "吉";
		name[2]= "中吉";
		name[3]= "小吉";
		name[4]= "末吉";
		name[5]= "凶";
		
		int y= r.nextInt(6);		
		System.out.println(name[y]);
		}
			
		

}

