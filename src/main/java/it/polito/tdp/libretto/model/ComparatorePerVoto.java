package it.polito.tdp.libretto.model;

import java.util.Comparator;

public class ComparatorePerVoto implements Comparator<Voto> {

	@Override
	public int compare(Voto v, Voto vv) {
		
		return vv.voto-v.voto;
	}

}
