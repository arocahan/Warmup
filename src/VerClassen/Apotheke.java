package VerClassen;

import VerClassen.Adresse;

public class Apotheke {
    private String name;
    private Adresse adresse;

    public Apotheke (String name, Adresse adresse){
        this.name = name;
        this.adresse = adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String getName(){
        return this.name;
    }
}
