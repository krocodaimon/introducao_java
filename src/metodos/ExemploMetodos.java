package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		int resultado = somar (2,5);
		System.out.println("O primeiro resultado é " + resultado);
		
		System.out.println("O segundo resultado é" + somar (8,3));
		
		falar ("Bom dia!");
		falar ("Dia de sol");
		
		ExemploMetodoExterno.mensagem();
		
	}
	//Método com retorno e com parametros
	public static int somar (int x, int y) {
		return x+y;
		
	}
	//Método sem retorno e com parametros
	public static void falar (String mensagem) {
		System.out.println(mensagem);
	}

}
