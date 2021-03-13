package it.polito.tdp.libretto.model;

import java.util.*;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto l= new Libretto();
		
		l.add(new Voto("Informatica", 30, "15/02/2019"));
		l.add(new Voto("Analisi", 26, "03/02/2020"));
		l.add(new Voto("Programmazione a oggetti", 30, "29/01/2021"));
		l.add(new Voto("Fisica", 21, "18/06/2020"));
		Voto s= new Voto("Chimica", 25, "09/09/2020");
		l.add(s);
		l.add(new Voto("Economia", 30, "02/09/1998"));
		l.add(new Voto("Diritto privato", 30, "05/02/2021"));
		l.add(new Voto("Ricerca operativa", 30, "31/08/2020"));
		l.add(new Voto("Basi dati", 25, "07/02/2020"));
		l.add(new Voto("Statistica", 29, "30/01/2020"));
		
		System.out.println("Corsi il cui voto est 25:");
		
		for(Voto v: l.voti)
		{
			if(v.voto == 25)
			{
				System.out.println(v.nomeCorso);
			}
		}
		
		
		System.out.println("Voto dell'esame di analisi");
		System.out.println(l.quantoHaiPreso("Analisi"));
		
		
		System.out.println("Contieni esame chimica?");
		if(l.voti.contains(s))
			System.out.println("yes");
		else
			System.out.println("no");
		
		System.out.println("Esiste conflitto con esame analisi?");
		
		if(l.esisteConflitto(new Voto("Analisi",26,"03/02/2020")))
		{
			System.out.println("conflitto");
		}
		else
			System.out.println("no conflitto");
		
		//Libretto ll = new Libretto();
		
		Libretto migliore = new Libretto(); 
		migliore.voti.addAll(l.migliorami());
		
		for(int i= 0; i<l.voti.size() ;i++)
		{
			System.out.println(l.voti.get(i).nomeCorso+" originale: "+l.voti.get(i).voto+"    "+" migliorato: "+migliore.voti.get(i).voto);
			//System.out.print("\n");
		}
		
		System.out.println("stampa libretto ordine alfabetico di esame");
		
		LinkedList<Voto> order = new LinkedList<Voto>(l.voti);
		Collections.sort(order);
		
		
		for(Voto v: order)
			System.out.println(v.nomeCorso);
		
		LinkedList<Voto> order2 = new LinkedList<Voto>(l.voti);
		
		Collections.sort(order2, new ComparatorePerVoto());;
		
		for(Voto v: order2)
			System.out.println(v.voto);
		
		
		Iterator <Voto> i= l.voti.iterator();
		
		do {
			if(i.next().voto<24)
			{
				i.remove();
			}
		} while(i.hasNext());
		
		
		for(Voto v: l.voti)
		{
			{
				System.out.println(v.nomeCorso);
			}
		}
		
		

	}

}
