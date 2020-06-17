package it.dstech.service;

public class Service {

	private String testo;

	public Service(String testo) {

		this.testo = testo;
	}

public int contaParole () {
String frase [] = testo.split(" ");
return frase.length;
  }

public int contaVocali () {
	String frase [] = testo.split(" ");

    int contatoreVocali = 0;
	for (int i = 0; i < frase.length; i++) {

        for (int j = 0; j < frase[i].length(); j++) { 

            if (frase[i].charAt(j) == 'a' || frase[i].charAt(j) == 'e' || frase[i].charAt(j) == 'i' || 
            		frase[i].charAt(j) == 'o' || frase[i].charAt(j) == 'u') {

                contatoreVocali++;
		} 
}
	} return contatoreVocali;
}
public int contaConsonanti () {
	String frase [] = testo.split(" ");

    int contatoreConsonanti = 0;
	for (int i = 0; i < frase.length; i++) {

        for (int j = 0; j < frase[i].length(); j++) { 

            if (frase[i].charAt(j) != 'a' && frase[i].charAt(j) != 'e' && frase[i].charAt(j) != 'i' && 
            		frase[i].charAt(j) != 'o' && frase[i].charAt(j) != 'u') {

            	contatoreConsonanti++;
		} 
}
	} return contatoreConsonanti;
}
}
