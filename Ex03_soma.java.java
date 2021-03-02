import java.util.Scanner;

public class Ex03_Soma{
	public static int calc(int a, int b){
		int x;
		x = a+b;
		return x;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite uma valor para ser somado por 2: ");
		int a = scan.nextInt();
        	System.out.print("x = " + (calc(a,2)));
    }
}