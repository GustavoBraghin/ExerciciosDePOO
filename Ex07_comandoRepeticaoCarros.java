public class Ex07_comandoRepeticaoCarros{
	public static void main(String[] args){

		for (int i=0; i<5; i++){
			System.out.println(i);
		}

		String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};

		for (String i : carros){ //forma de ler o vetor sem se preocupar com o seu tamanho
			System.out.println(i);
		}

		for (int i=0; i<5; i++){
			if(i==4){
				break;
			}
			System.out.println(i);
		}
	}
}