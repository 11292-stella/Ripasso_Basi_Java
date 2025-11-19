package org.example.Conversioni;

//I nomi delle classi vanno sempre in maiuscolo e al singolare
public class Studente {

	// Attributi della classe che servono per descrivere gli studenti
	// iniziano con la lettere minuscola e se ci sono più parola queste cominciano
	// con la prima lettera in maiuscolo
	//Variabili di istanza, proprietà uniche di ogni istanza(di ogni oggetto)
	//cambiano il loro valore da un'oggetto all'altro
	String nome;
	String cognome;
	String codiceFiscale;
	int eta;
	
	//Variabili di classe, variabili statiche
	//valore condiviso da tutte le istanze (da tutti gli oggetti)
	//un unico valore per tutta la classe, ciascun oggetto Studente avrà lo stesso valore
	//per questa variabile
	public static int numeroOre = 250;
	public static int numeroPosti = 25;

	
	//INIZIALIZZATORI
	//un blocco di codice che permette di eseguire delle istruzioni
	
	//Inizializzatore statico
	//il blocco di codice viene eseguito una sola volta, al momento di caricamento della classe
	//viene eseguito quindi quando la classe viene utilizzata la prima volta
	static {
		System.out.println("Chiama l'inizializzatore della classe");
		System.out.println("Attenzione al numero di Studenti");
	}
	
	//Inizializzatore istanza
	//il blocco di codice viene eseguito ogni volta che un oggetto viene creato
	{
		//System.out.println("Chiama l'inizializzatore di istanza");
		//System.out.println("Il numero di posti disponibili scende di uno");
		numeroPosti = numeroPosti - 1;
		//contaStudenti = contaStudenti + 1;
	}
	
	
	// Costruttore vuoto
	public Studente() {

	}

	// Costruttore parametrizzato
	public Studente(String nome, String cognome, String codiceFiscale, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.eta = eta;
	}

	//public specifica il tipo di accesso
	//void il tipo di dato restituito (vuoto)
	//presentati è il nome del metodo
	//all'interno delle parentesi tonde possiamo inserire dei parametri 
	public void presentati() {
		System.out.println("Ciao, sono " + this.nome + " e ho " + this.eta + " anni");
	}

	//restituisce una stringa
	public String salutare(String saluto) {
		return saluto + " mi chiamo "+ this.nome + " e ho " + this.eta + " anni";
	}
	
	//DUE SOLUZIONI per calcolare la differenza di età
	//metodo statico, appartiene alla classe
	//calcola la differenza tra due interi
	//restituisce un intero e prende in ingresso due parametri
	public static int differenzaEta(int x, int y) {
		return x-y;
	}
	
	//metodo di istanza 
	//accetta un oggetto di tipo studente come parametro in ingresso
	// restituisce un intero e calcola la differenza di eta tra due studenti
	//uno è l'istanza sulla quale chiamiamo il metodo e 
	//l'altro è lo studente che passiamo come parametro
	public int differenzaEta(Studente stu) {
		//Math è una classe del package java.lang fornisce metodi per le operazioni matematiche
		//abs() metodo che restituisce il valore assoluto 
		return Math.abs(this.eta - stu.eta);
	}
}
