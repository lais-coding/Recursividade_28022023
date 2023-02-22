package Exercícios;

public class Ex_04 {
	
	public Ex_04() {
		super();
	}
	
	public static void main (String args[]) {
		
		String palavra = "Salada de batata"; //Entrada com a palavra
		int tamanho = palavra.length(); //Armazena o tamanho da String
			
		String palavrainvertida = Inverter(palavra, tamanho);
		System.out.println("Palavra invertida = " +palavrainvertida);
	
	}

	public static String Inverter(String palavra, int tamanho) {
	
		//A condição de parada da função está baseada no tamanho da palavra, quando for igual a 0, é porque não há mais caracteres.
		
		if(tamanho == 0) {
			return "";
		}
		
		
		//Condição de recursiva
		
		else {
			
			tamanho = tamanho - 1; //Subtrai 1 do tamanho para iniciar a leitura da String e também é o 'contador' do programa
			int i = tamanho; //A função retornará o caractere da String baseado na posição 'i'
			String palavrainv = palavra.substring(i);
			String guardar = palavrainv; //Essa string guardará o caractere retornado na substring
			palavra = palavra.substring(0, i); //Para diminuir a palavra, passa pela função substring de novo, recebendo sempre como posição inicial 0 e a posição final 'i';	
			return (guardar+ Inverter(palavra, tamanho)); //E então, a função retornará concatenando os caracteres.
			
		
		}
		
		
		
	}
	
	
}
