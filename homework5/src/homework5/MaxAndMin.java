package homework5;

import java.util.Scanner;

public class MaxAndMin {

	Scanner s = new Scanner(System.in);	
	
	void maxmin() {
		int max=0;
		int min=0;
		String input= null;
		
		
		System.out.println();
		System.out.println("###최대값/최소값구하기###");
		while(true) {
			System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("q")) { System.out.println("가장큰 수는 "+max+"이고, 작은수는 "+min+"입니다."); break; }
			if(!input.matches("^[0-9]*$")||input.equals("")) { System.out.println("제대로 입력해주세요."); continue; }
			int num = Integer.parseInt(input);
			if(num>0&&num<100) {
				if(max==0&&min==0) { max=num; min=num; }
				
				if(num>max) max=num;
				else if(num<min) min=num;
			}
			else { System.out.println("0~100사이의 숫자를 입력하세요!"); }
		}
	}
}
