package homework5;

import java.util.Scanner;

public class GuGuDan {

	Scanner s = new Scanner(System.in);	
	
	void gugu() {
		String input= null;
		
		
		System.out.println();
		System.out.println("###원하는 구구단 출력하기###");
		while(true) {
			System.out.print("출력하고 싶은 단(Q:종료) >> ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("q")) break;
			if(!input.matches("^[0-9]*$")||input.equals("")) { System.out.println("제대로 입력해주세요."); continue; }
			int num = Integer.parseInt(input);
			if(num>0&&num<10) {
				for(int i=1;i<10;i++) {
					if(i%2==0) System.out.println(num+" * "+i+" = "+num*i);
					else System.out.print(num+" * "+i+" = "+num*i+"\t");
				}
				System.out.println();
			}
			else System.out.println("==> 잘못입력");
		}
	}
}
