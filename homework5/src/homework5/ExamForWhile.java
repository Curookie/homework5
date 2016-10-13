package homework5;

import java.util.Scanner;

public class ExamForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}

class SumOfNumbers {
	void sum() {
		Scanner s = new Scanner(System.in);
		System.out.print("마지막 수를 입력(Q:종료) >> ");
		int num = s.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("총 합은 "+sum+"입니다.");
	}
}

class MaxAndMin {
	
}

class SumAndAvg {
	
}

class GuGuDan {
	
}

class GuGuDan2 {
	
}