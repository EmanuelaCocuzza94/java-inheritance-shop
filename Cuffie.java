package org.lessons.java.shop;

/*Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.*/

public class Cuffie extends Prodotto{
	
	private String colore;
	private String tipologia;

	public Cuffie(String nome, String marca, double prezzo, double iva, String colore, String tipologia) {
		super(nome, marca, prezzo, iva);
		// TODO Auto-generated constructor stub
		this.colore = colore;
		this.tipologia= tipologia;
	}
	
	private String getColore() {
		return this.colore;
	}
	
	private String getTipologia() {
		return this.tipologia;
	}
	
	@Override
    public String toString() {
        return "ProdottoCuffie{" + '\n' +
                "nome='" + this.getNome() + '\'' + '\n' +
                "marca='" + this.getMarca() + '\'' + '\n' +
                "colore='" + this.getColore() + '\'' + '\n' +
                "tipologia='" + this.getTipologia() + '\'' + '\n' +
                "iva='" + this.getIva() + '\'' + '\n' +
                "codice='" + this.getCodice() + '\'' + '\n' +
                "prezzo=" + this.getPrezzo() + '\n' + '}';
    }

}
