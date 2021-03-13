package it.polito.tdp.libretto.model;

public class Voto implements Comparable <Voto> {
	String nomeCorso;
	int voto;
	String dataEsame;
	
	public Voto(String nomeCorso, int voto, String dataEsame) {
		
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.dataEsame = dataEsame;
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
