package VerClassen;

import testPackage.MessingAround;

public class Springer {
    private String name;
    private Adresse adresse;
    private boolean bewilligung;

    public Springer (String name, Adresse adresse, boolean bewilligung){
        this.name = name;
        this.adresse =  adresse;
        this.bewilligung = bewilligung;
    }

     public void setName(String name){
        this.name = name;
     }

     public String getName(){
        return name;
     }

     public void setAdresse(Adresse adresse){
        this.adresse = adresse;
     }

     public Adresse getAdresse(){
        return adresse;
     }

     public void setBewilligung(){
        this.bewilligung = bewilligung;
     }

     public boolean isBewilligung(){
        return bewilligung;
     }

}
