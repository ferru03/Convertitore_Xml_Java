package com.example;

public class root { 
	public int annoDiInizio;
	public aula aula;
	public String classe;
	public int numeroFinestre;
	public String specializzazione;
	public studenti studenti;

    public root(){
        
    }

    public int getAnnoDiInizio() {
        return annoDiInizio;
    }

    public void setAnnoDiInizio (int value){
        this.annoDiInizio = value; 
    }

    public aula getAula() {
        return aula;
    }
    public void setAula(String value){
        this.aula.setNome(value);
    }

    public String getClasse() {
        return classe;
    }
    public void setClasse(String value){
        this.classe = value;
    }

    public int getNumeroFinestre() {
        return numeroFinestre;
    }

    public void setNumeroFinestre(int value) {
        this.numeroFinestre = value;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String value) {
        this.specializzazione = value;
    }

    public studenti getStudenti() {
        return studenti;
    }

    public void setStudenti(studenti value) {
        this.studenti = value;
    }
}
