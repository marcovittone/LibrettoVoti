package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {

	List <Voto> voti;
	
	
	
	public Libretto() {
		
		this.voti=new LinkedList<Voto>();
	}
	
	
	public Libretto votiUguali(int voto) {
		
		Libretto l= new Libretto();
		
		for(Voto v: this.voti)
		{
			if(v.getVoto() == 25)
			{
				l.add(v);
			}
		}
		
		return l;
		
	}
	
	
	
	public boolean add (Voto v) {
		
		if(!this.voti.contains(v) && !this.esisteConflitto(v))
		{
			this.voti.add(v);
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * restituisce voto registrato dato il nome del corso, null se non si trova niente
	 * @param materia
	 * @return
	 */
	
	
	public Voto quantoHaiPreso (String materia) {
		
		for(Voto v:this.voti)
		{
			if(materia.equals(v.getNomeCorso()))
				return v;
		}
		
		return null;
	}


	public boolean esisteConflitto(Voto voto) {
		
		for(Voto v:this.voti)
		{
			if(v.getNomeCorso().equals(voto.getNomeCorso()) && v.getVoto()!= voto.getVoto())
				return true;
		}
		return false;
	}


	@Override
	public String toString() {

		String s="";
		for(Voto v: this.voti)
			s+=v.toString()+"\n";
		
		return s;
	}
	
	
	
	


	/*public List<Voto> migliorami() {
		
		LinkedList <Voto> l= new LinkedList<Voto>();
		for(Voto v: this.voti)
		{
			if(v.voto<24 || v.voto== 29)
				l.add(new Voto(v.nomeCorso,v.voto+1,v.dataEsame));
			else if(v.voto>=24 && v.voto<29)
				l.add(new Voto(v.nomeCorso,v.voto+2,v.dataEsame));
			else if(v.voto==30)
				l.add(new Voto(v.nomeCorso,v.voto,v.dataEsame));
		}
		return l;
	}
	
	
	*/
}
