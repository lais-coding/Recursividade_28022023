package Exercícios;

public class Ex_01 {

	public Ex_01(){
		super();
	}
	
	public static void main(String[] args) {
	
		int numero;
		
		numero = 5;
		
		int fat = Fatorial(numero);
		System.out.println("O FATORIAL DE " +numero+ " == "+fat);
		
	}

	
	public static int Fatorial (int numero) {
		
		//Essa é a condição de parada da função, pois por convenção matemática, é a multiplicação dos antecessores de um número maior do que zero
		
		if (numero == 0) {
			return 1;  
		} 
		
		
		//Enquanto a condição de parada ainda não for atendida, a função será executada novamente, subtraindo 1 do número passado como parâmetro.
		
		else {
			return numero * Fatorial (numero-1);
		}
		
		
		
	}
	
}
