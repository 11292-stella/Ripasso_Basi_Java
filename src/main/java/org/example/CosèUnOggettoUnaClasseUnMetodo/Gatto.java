package org.example.CosèUnOggettoUnaClasseUnMetodo;

//Il nome della classe per convenzione si scrive con la lettera maiuscola
//il nome del file java avrà il nome della classe
//Fornisce la struttura e le funzioni, attributi e metodi
public class Gatto {
	
	//lista di attributi che servono a descrivere gli oggetti di tipo Gatto
	public String nome;
	public int eta;
	public String razza;
	public String particolare;
	public boolean vaccino;

	//Costruttore vuoto
	//l'unico metodo cha ha lo stesso nome della classe
	public Gatto() {
		
	}
	
	//Costruttore parametrizzato
	//al suo interno andiamo a inserire dei parametri
	//this = parola chiave per evitare problemi di ambiguità
	public Gatto(String nome, int eta, String razza, String particolare, boolean vaccino) {
		this.nome = nome;
		this.eta = eta;
		this.razza = razza;
		this.particolare = particolare;
		this.vaccino = vaccino;
	}

	//Costruttore parametrizzato con un solo parametro
	public Gatto(String nome) {
		this.nome = nome;
	}
	
	//Costruttore parametrizzato con tre parametri
	public Gatto(String nome, int eta, String particolare) {
		this.nome = nome;
		this.eta = eta;
		this.particolare = particolare;
	}
	

	//Metodi
	//void = metodo senza ritorno
	public void miagola() {
		//istruzioni
		System.out.println(" sta miagolando");
	}
	
	//Metodo che mi restituisce un valore, una stringa
	public String cammina() {
		//istruzioni
		return " sta camminando";
	}
	
	//Metodo che restituisce un intero
	public int numeroZampe() {
		return 4;
	}
}
