package homework5;

import java.util.Scanner;

public class SumAndAvg {

	Scanner s = new Scanner(System.in);	
	
	void sumavg() {
		int sum=0;
		double avg=0.00;
		int count=0;
		String input= null;
		
		
		System.out.println();
		System.out.println("###입력받은숫자의 합계와 평균구하기###");
		while(true) {
			System.out.print("숫자를 입력(Q:종료) >> ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("q")) { System.out.println("합계는 "+sum+"이고, 평균은 "+avg+"입니다."); break; }
			if(!input.matches("^[0-9]*$")||input.equals("")) { System.out.println("제대로 입력해주세요."); continue; }
			int num = Integer.parseInt(input);
			sum+=num;
			avg=Double.parseDouble(String.format("%.2f", (double)sum/++count));
		}
	}
}
