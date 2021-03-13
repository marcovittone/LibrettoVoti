package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {

	LinkedList <Voto> voti = new LinkedList<Voto>();
	
	public boolean add (Voto v) {
		
		if(!this.voti.contains(v) && !this.esisteConflitto(v))
		{
			this.voti.add(v);
			return true;
		}
		
		return false;
		
	}
	
	
	public int quantoHaiPreso (String materia) {
		
		for(Voto v:this.voti)
		{
			if(materia.equals(v.nomeCorso))
				return v.voto;
		}
		
		return -1;
	}


	public boolean esisteConflitto(Voto voto) {
		
		for(Voto v:this.voti)
		{
			if(v.nomeCorso.equals(voto.nomeCorso) && v.voto!= voto.voto)
				return true;
		}
		return false;
	}


	public List<Voto> migliorami() {
		
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
}
