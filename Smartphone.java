package org.lessons.java.shop;

import java.util.Random;

/*Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.*/

public class Smartphone extends Prodotto {
	
	private int codiceImei;
	private String memoria;

	public Smartphone (String nome, String marca, double prezzo, double iva, String memoria) {
		super(nome, marca, prezzo, iva);
		// TODO Auto-generated constructor stub
		this.setCodiceImei();
		this.memoria = memoria; 
	}
	
	private int getCodiceImei() {
		return this.codiceImei;
	}
	
	private void setCodiceImei() {
		Random ran = new Random();
		this.codiceImei = ran.nextInt(10000);
	}
	
	private String getMemoria() {
		return this.memoria;
	}
	
	
	
	@Override
    public String toString() {
        return "ProdottoSmartphone{" + '\n' +
                "nome='" + this.getNome() + '\'' + '\n' +
                "marca='" + this.getMarca() + '\'' + '\n' +
                "memoria='" + this.getMemoria() + '\'' + '\n' +
                "codiceimei='" + this.getCodiceImei() + '\'' + '\n' +
                "iva='" + this.getIva() + '\'' + '\n' +
                "codice='" + this.getCodice() + '\'' + '\n' +
                "prezzo=" + this.getPrezzo() + '\n' + '}';
    }
	
	
	
	

}
