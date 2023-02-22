package Exercícios;

public class Ex_03 {
	
	public Ex_03() {
		super();
	}

	public static void main(String[] args) {
		
		int number = 123456;	
		
		int res = quantDigitos(number);
		System.out.println("A quantidade de dígitos == " +res);
		
	}
	
	public static int quantDigitos(int number) {
		
		//A condição de parada é quando não for possível mais dividir por 10.
		
		if(number == 0) {
			return 0;
		}
		
		//Para a contagem dos digítos, o número será dividido por 10, e, a cada divisão, retornará a função até atender a condição de parada. 
		//Inseri um incremento de 1 para somar a quantidade de vezes que houve divisão, que resulta a quantidade de dígitoss
		
		
		else {
			number = number / 10;
			return 1 + quantDigitos(number);
		}
		
	}
	
	
	

}
