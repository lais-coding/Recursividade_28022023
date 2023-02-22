package Exercícios;

public class Ex_02 {

	public Ex_02() {
		super();
	}
	
	public static void main(String[] args) {
		
		int [] vetor = {-5, -4, 20, -2, -1, 0, 1, 2, -9};
		int tamanho = vetor.length;
		
		int resultado = quantNegativos(vetor, tamanho);
		System.out.println("A quantidade de negativos no vetor == " +resultado);
		

	}

	public static int quantNegativos(int[] vetor, int tamanho) {
		
		int cont=0;
		
		if(tamanho == 0) {
			return 0;
		}
		
		else {
			
			if(vetor[tamanho-1] < 0) {
				cont = cont + 1;
			}
			
			tamanho = tamanho - 1;
			return cont + quantNegativos(vetor, tamanho);
			
		}
		
		
		
	}
	
	
	
	
}
