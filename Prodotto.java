package org.lessons.java.shop;

/*Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, 
i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.*/

public class Prodotto {
	
	private int codice;
	protected String nome;
	protected String marca;
	protected double prezzo;
	protected double iva;
	
	Prodotto(int codice, String nome, String marca, double prezzo, double iva){
		this.codice = codice;
		this.nome = nome;
		this.marca = marca; 
		this.prezzo = prezzo;
		this.iva = iva;
	}

	
	public int getCodice(){
		 return this.codice;
	}
	
	public String getNome(){
		 return this.nome;
	}
	
	public String getMarca() {
		 return this.marca;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public double getIva() {
		return this.iva;
	}
	
	public void setNome(String inputNome) {
		 this.nome = inputNome;
	}
	
	public void setMarca(String inputMarca) {
		 this.nome = inputMarca;
	}

	public void setPrezzo(String inputPrezzo) {
		 this.nome = inputPrezzo;
	}
	
	public void setIva(String inputIva) {
		 this.nome = inputIva;
	}
	

	
}
