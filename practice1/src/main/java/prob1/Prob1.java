package prob1;

import java.util.Scanner;

public class prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int num;
		
		
		System.out.print("수를 입력하시오 : ");
		num = scanner.nextInt();
		
		if(num%3==0) System.out.println(num+"은 3의 배수입니다.");
		else System.out.println(num+"은 3의 배수가 아닙니다.");
		
		scanner.close();
	}
}