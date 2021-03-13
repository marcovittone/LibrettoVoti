package it.polito.tdp.libretto.model;

import java.time.LocalDate;
import java.util.*;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto l= new Libretto();
		
		l.add(new Voto("Informatica", 30, LocalDate.of(2019, 2, 15)));
		l.add(new Voto("Analisi", 26, LocalDate.of(2019, 2, 3)));
		l.add(new Voto("Programmazione a oggetti", 30, LocalDate.of(2021, 1, 29)));
		l.add(new Voto("Fisica", 21, LocalDate.of(2020, 6, 18)));
		Voto s= new Voto("Chimica", 25, LocalDate.of(2020, 9, 9));
		l.add(s);
		l.add(new Voto("Economia", 30,LocalDate.of(1998, 9, 2)));
		l.add(new Voto("Diritto privato", 30,LocalDate.of(2020, 2, 5)));
		l.add(new Voto("Ricerca operativa", 30, LocalDate.of(2020, 8, 31)));
		l.add(new Voto("Basi dati", 25, LocalDate.of(2020, 2, 3)));
		l.add(new Voto("Statistica", 29, LocalDate.of(2020, 1, 30)));
		
		System.out.println("Corsi il cui voto est 25:");
		
		System.out.println(l.votiUguali(25));
		
		
		System.out.println("Voto dell'esame di analisi");
		System.out.println(l.quantoHaiPreso("Analisi"));
		
		
		/*
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
		}*/
		
		

	}

}
