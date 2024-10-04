package org.lessons.java.shop;

/*Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.*/

public class Televisore extends Prodotto {
	
	private double dimensione; 
	private boolean is_smart; 

	public Televisore (int codice, String nome, String marca, double prezzo, double iva, double dimensione, boolean is_smart) {
		super(codice, nome, marca, prezzo, iva);
		// TODO Auto-generated constructor stub
		this.dimensione = dimensione;
		this.is_smart = is_smart;
		
	}
	
	private double getDimensione() {
		return this.dimensione;
	}
	
	private boolean getSmart() {
		return this.is_smart;
	}
	
	@Override
    public String toString() {
        return "ProdottoTelevisore{" + '\n' +
                "nome='" + this.getNome() + '\'' + '\n' +
                "marca='" + this.getMarca() + '\'' + '\n' +
                "dimensione='" + this.getDimensione() + '\'' + '\n' +
                "smart='" + this.getSmart() + '\'' + '\n' +
                "iva='" + this.getIva() + '\'' + '\n' +
                "prezzo=" + this.getPrezzo() + '\n' + '}';
    }

}
