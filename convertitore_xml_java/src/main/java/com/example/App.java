package com.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        root r = new root();
        aula a = new aula();
        studenti s = new studenti();
        element e1 = new element();
        element e2 = new element();

        r.setAnnoDiInizio(2018);
        a.setNome("14CE");
        r.setClasse("5B");
        r.setSpecializzazione("IA");
        ArrayList<element> elementi = new ArrayList<>();
        elementi.add(e1);
        elementi.add(e2);
        e1.setCognome("Bianchi");
        e1.setNome("Tommaso");
        e1.setAnnoDiNascita("2003");
        e2.setCognome("Hu");
        e2.setNome("Tommaso");
        e2.setAnnoDiNascita("2004");
        s.setElement(elementi);

        System.out.println("La classe " + r.getClasse() + " " + r.getSpecializzazione() + " si trova nell'aula " + a.getNome()
        + " ed è composta dai seguenti studenti: " + "\nCognome: " + s.getElement().get(0).getCognome() + "\nNome: " + s.getElement().get(0).getNome()
        + "\nAnno di nascita: " + s.getElement().get(0).getAnnoDiNascita() + "\nCognome: " + s.getElement().get(1).getCognome() + "\nNome: " + s.getElement().get(1).getNome()
        + "\nAnno di nascita: " + s.getElement().get(1).getAnnoDiNascita());
    }
}
