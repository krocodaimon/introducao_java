package vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		String cachorros[] = {"Boxer","Pastor Alemão","Pinscher","Husky Siberiano","Corgi"};
        //Tipo nome_vetor [] = {valores 0, 1, 2, 3, 4}
        for(int indice = 0; indice < 5; indice++) {
            System.out.println((indice + 1) + "º elemento: " + cachorros[indice]);  
        }
	}

}
