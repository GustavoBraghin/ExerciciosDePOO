import java.util.Scanner;
import java.lang.Math;

public class Ex09_bhaskara{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor 'a': ");
		double a = scan.nextDouble();

		System.out.println("Digite o segundo valor 'b': ");
		double b = scan.nextDouble();

		System.out.println("Digite o terceiro valor 'c': ");
		double c = scan.nextDouble();
		
		double delta = Math.sqrt((b*b) - (4*a*c));

		double r1 = (((b*-1) + delta)/(2*a));
		double r2 = (((b*-1) - delta)/(2*a));
		
		if(delta < 0 || a==0){
			System.out.println("Impossivel calcular");
		}else{
			System.out.println("R1 = "+r1);
			System.out.println("R2 = "+r2);
		}
	}
}
		
		

		