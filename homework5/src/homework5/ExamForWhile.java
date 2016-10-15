package homework5;

import java.util.ArrayList;
import java.util.Scanner;

import sun.print.resources.serviceui;

public class ExamForWhile {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);	
		
		int menu=0;
		
		while(menu!=6) {
			System.out.println("=========================");
			System.out.println("1. 1부터 입력한 수까지 더하기");
			System.out.println("2. 최댓값/ 최솟값 구하기");
			System.out.println("3. 입력받은 숫자의 합계와 평균구하기");
			System.out.println("4. 원하는 구구단 출력하기");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 종료하기");
			System.out.print("원하는 메뉴는 >> ");
			String input = s.nextLine();
			if(input.equalsIgnoreCase("q")) break;
			if(!input.matches("^[1-6]{1}$")) { System.out.println("제대로 입력하세요!"); continue; }
			menu= Integer.parseInt(input);
			
			switch (menu) {
				case 1:
					new SumOfNumbers().sum();
					break;
				case 2:
					new MaxAndMin().maxmin();
					break;
				case 3:
					new SumAndAvg().sumavg();
					break;
				case 4:
					new GuGuDan().gugu();
					break;
				case 5:
					new GuGuDan2().gugu2();
					break;
			}
		}
	}
}

