package homework5;

import java.util.Scanner;

public class GuGuDan2 {

	Scanner s = new Scanner(System.in);	
	
	void gugu2() {
		String input= null;
		
		
		System.out.println();
		System.out.println("###짝수단/홀수단 출력하기###");
		while(true) {
			System.out.print("E:짝수단, O:홀수단((Q:종료) >> ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("q")) break;
			if(!(input.equalsIgnoreCase("e")||input.equalsIgnoreCase("o"))) { System.out.println("제대로 입력해주세요."); continue; }
			
			int b=2;
			if(input.equalsIgnoreCase("o")) b=3;
				for(int i=1;i<10;i++) {
					for(int j=b;j<10;j+=2) {
						System.out.print(j+" * "+i+" = "+j*i+"\t");
					}System.out.println();
				}
		}
	}

}
