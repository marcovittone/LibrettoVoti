package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto implements Comparable <Voto> {
	private String nomeCorso;
	private int voto;
	private LocalDate dataEsame;
	
	public Voto(String nomeCorso, int voto, LocalDate dataEsame) {
		
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.dataEsame = dataEsame;
	}

	
	public String getNomeCorso() {
		return nomeCorso;
	}


	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public LocalDate getDataEsame() {
		return dataEsame;
	}


	public void setDataEsame(LocalDate dataEsame) {
		this.dataEsame = dataEsame;
	}


	@Override
	public String toString() {
		return "Esame di " + nomeCorso + ", superato con " + voto + ", sostenuto il " + dataEsame;
	}


	@Override
	public boolean equals(Object obj) {

		Voto v= (Voto) obj;
		
		if(this.nomeCorso.equals(v.nomeCorso) && this.voto == v.voto)
			return true;
		
		return false;
	}

	@Override
	public int compareTo(Voto v) {
		return this.nomeCorso.compareTo(v.nomeCorso);
	}

	
	
	
	
	
	
	

}
