package org.example.CosèUnOggettoUnaClasseUnMetodo;



public class Main {

	public static void main(String[] args) {

		// commento su una riga

		// int = tipo di dato per i numeri interi, Tipo primitivo
		// numero = il nome della variabile, è un identificativo
		// 10 = valore
		int numero = 10; // dichiarazione + assegnazione

		int numero2; // dichiarazione
		//scrivere altro codice...
		numero2 = 100; // assegnazione
		
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero2 + " " + numero);
		
		//double = tipo di dato in bitgola mobile, Tipo primitivo
		double numeroConVirgola = 11.2;
		
		//char = rappresenta i singoli caratteri codificati secondo lo schema Unicode
		char carattere = 'c';
		
		//String = per le sequenze di caratteri e con le doppie virgolette
		//String va con la prima lettera maiuscola è una classe
		//NON è un tipo primitivo
		String stringa = "Messaggio di prova";
		
		//boolean = due valori logici, true e false, vero e falso
		boolean valoreBooleano = true;
		
		System.out.println(numeroConVirgola);
		System.out.println(carattere);
		System.out.println(stringa);
		System.out.println(valoreBooleano);
		
		//----------------
		System.out.println("--------------");
		
		//Creo un oggetto di tipo Gatto
		//NomeClasse nomeOggetto = new NomeClasse();
		Gatto gatto1 = new Gatto();
		System.out.println("Il gatto si chiama " + gatto1.nome);
		gatto1.nome = "Aron";
		gatto1.eta = 5;
		gatto1.razza = "Siamese";
		gatto1.particolare = "giocherellone";
		gatto1.vaccino = true;
		System.out.println("Il gatto si chiama " + gatto1.nome);

		System.out.println("--------------");
		Gatto gatto2 = new Gatto("Giotto", 2, "Persiano", "Furbetto", true);
		Gatto gatto3 = new Gatto("Micia", 3, "Randagio");
		
		System.out.println("Il gatto: " + gatto3.nome + " ha " + gatto3.eta + 
				" anni, segni particolari: " + gatto3.particolare);
		
		System.out.println("--------------");
		gatto2.miagola();
		System.out.println(gatto2.cammina());
		
		String stringaGatto = gatto2.cammina();
		System.out.println(gatto2.nome + stringaGatto);
		int numeroZampe = gatto2.numeroZampe();
		System.out.println(gatto2.nome + " ha " + numeroZampe + " zampe");
		
		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println(differenza(10,8));
		System.out.println(differenza(25,5));
		System.out.println(differenza(36,8));
		System.out.println("Il risultato è " + differenza(10,8));
		System.out.println(differenza(10,8) + 5);
		
	}
	
	//Metodo che calcola la differenza tra due numeri
	public static int differenza(int a, int b) {
		int risultato = a - b;
		return risultato;
	}

}
