package org.example.Conversioni;

public class Main {
	
	//TIPI Primitivi
	//Interi byte, short, int, long
	public byte numeroByte = 25; //8bit -128 a + 127
	
	public short numeroShort = 40; //16bit
	
	public int numeroInt = 10;  //32bit 
	
	public long numeroLong = 300000000000L; //64bit, richiede la L
	public long numeroLong1 = 300000000000l;
	
	//Dati in virgola mobile
	public double numeroDouble = 3.2; //64bit, precisione di 15-16 cifre
	public float numerofloat = 2.5f;  //32bit, precisione di 6-7 cifre, richiede la f
	
	//Dati boolean
	public boolean espressione1 = true;
	public boolean espressione2 = false;
	
	//Tipo char, singoli apici
	public char carattere = '!';
	
	//COSTANTE
	//Il valore non può essere modificato
	//Final = valore non è modificabile
	public final double PI_GRECO = 3.14;
	public final int NUMERO_LATI_QUADRATO = 4;
	
	//TIPO REFERENCE
	//String, per le sequeze di caratteri
	public String testo = "Ciao Mondo";
	
	//Commento su una riga, piccola annotazione
	
	/*
	 * Commento su più righe, per spiegare blocchi di codice
	 */
	
	/**
	 * Commento per generara la documentazione Java
	 * @param args parametro del metodo main
	 */
	public static void main(String[] args) {
		
		String messaggio = "Prova";
		messaggio = messaggio + " messaggio";
	
		System.out.println(messaggio);
		
		
		//WRAPPER
		//classi contenitore, astraggono il concetto di tipo primitivo
		//Byte, Short, Integer (int), Long, Float, Double, Character (char), Boolean
		//I tipi primitivi NON sono oggetti
		//Le classi Wrapper generano OGGETTI
		int x = 20;
		Integer y = 36;
		System.out.println(x + y.toString());
		
		//Da primitivo a wrapper
		Integer z = x;
		System.out.println(z);
		System.out.println(z.getClass().getName());
		//Da wrapper a primitivo
		int a = z;
		System.out.println(a);
		
		
		//Coversione implicita (Cast implicito)
		//int -> long
		//float -> double
		//char -> int
		//in automatico passa da un int a un double 
		//da un tipo di dato più ristretto (int 32bit) passa a uno più ampio (double 64bit)
		int numeroI = 612545;
		double numeroD = numeroI;
		System.out.println(numeroD);
		
		//Conversione esplicita, manuale
		//long -> int
		//int -> byte
		//da un tipo di dato più ampio (double 64bit) passa a uno più ristretto (int 32bit)
		double numeroD2 = 5000.6;
		//int numeroI2 = numeroD2; //da errore, operazione non consentita
		int numeroI2 = (int)numeroD2; //CAST, obbligatorio 
		System.out.println(numeroI2); //perdita di informazioni, di dati
		byte numeroB = (byte)numeroI2; //esce dall'intervallo del byte
		System.out.println(numeroB); //overflow
		
		
		System.out.println("----------");
		System.out.println("----------");
		System.out.println("----------");
		
		System.out.println("Numero posti: " + Studente.numeroPosti);
		Studente.numeroOre = Studente.numeroOre - 50;
		Studente s1 = new Studente();
		s1.nome = "Elia";
		s1.cognome = "Neri";
		s1.codiceFiscale = "ELNR08";
		s1.eta = 25;
		
		Studente s2 = new Studente("Leone", "Neri", "LNNR03", 18);
		System.out.println("Numero posti: " + Studente.numeroPosti);
		System.out.println("Lo studente " + s1.nome + " deve frequentare " + Studente.numeroOre + " ore." );
		System.out.println("Lo studente " + s2.nome + " deve frequentare " + Studente.numeroOre + " ore." );
		
		Studente s3 = new Studente("Paola", "Verdi", "PLVR10", 38);
		Studente s4 = new Studente("Giovanna", "Neri", "GVNR09", 28);
		Studente s5 = new Studente("Carmen", "Blu", "CRBL07", 30);
		System.out.println("Numero posti: " + Studente.numeroPosti);
		s3.presentati();
		s4.presentati();
		System.out.println(s4.salutare("Buongiorno"));
		System.out.println(s4.salutare("Buonasera"));
		System.out.println(s5.salutare("Ciao"));
		
		System.out.println("Differenza: " +  Studente.differenzaEta(s3.eta, s5.eta));
		System.out.println("Differenza: " +  Studente.differenzaEta(99, 56));
		
		System.out.println("Differenza: " +  s3.differenzaEta(s5));
		System.out.println("Differenza: " +  s3.differenzaEta(s4));
		System.out.println("Differenza: " +  s4.differenzaEta(s5));
	}

}
