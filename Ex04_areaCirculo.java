import java.util.Scanner;

public class Ex04_areaCirculo{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);

		System.out.print("Digite o raio do circulo: ");
		int raio = scan.nextInt();
		System.out.print("A area do circulo e: " + (raio*raio*3.14));
	}
}