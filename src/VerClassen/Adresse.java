package VerClassen;

public class Adresse {
    private String strasse;
    private int nummer;
    private int plz;
    private String ort;

    public Adresse(String strasse, int nummer, int plz, String ort) {
        this.strasse = strasse;
        this.nummer = nummer;
        this.plz = plz;
        this.ort = ort;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getNummer() {
        return nummer;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }
}
