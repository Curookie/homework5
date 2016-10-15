package homework5;

import java.util.Scanner;

public class SumOfNumbers {

	Scanner s = new Scanner(System.in);	
	 
	void sum() {
		
		String input = null;
		while (true) { 
			System.out.println();
			System.out.println("###1부터 입력한 수까지 더하기###"); 
			System.out.print("마지막 수를 입력(Q:종료) >> ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("q")) break;
			if(!input.matches("^[0-9]*$")||input.equals("")) { System.out.println("제대로 입력해주세요!"); continue;} 
			int num = Integer.parseInt(input);
			int sum = 0;
			
			for(int i=1; i<=num; i++) {
				sum += i;
			}
			
			System.out.println("총 합은 "+sum+"입니다.");
		}
	}
}
