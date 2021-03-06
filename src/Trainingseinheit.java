import java.util.Date;

public class Trainingseinheit {
      private int Dauer_des_Trainings;
      private Date Datum_und_Startzeit_des_Trainings;
      private Fitnessgeraet Welches_Fitnessgerät_verwendet_wurde;
      public int Kalorienverbrauch_pro_min;

    public Trainingseinheit(int dauer_des_Trainings, Date datum_und_Startzeit_des_Trainings,
                            Fitnessgeraet welches_Fitnessgerät_verwendet_wurde, int kalorienverbrauch_pro_min) {
        this.Dauer_des_Trainings = dauer_des_Trainings;
        this.Datum_und_Startzeit_des_Trainings = datum_und_Startzeit_des_Trainings;
        this.Welches_Fitnessgerät_verwendet_wurde = welches_Fitnessgerät_verwendet_wurde;
        this.Kalorienverbrauch_pro_min = kalorienverbrauch_pro_min;
    }
    public boolean zielErreicht(int kalorienZiel){
        int Total_kalorie_fuer_diese_training = this.Dauer_des_Trainings * this.Kalorienverbrauch_pro_min;
        if (Total_kalorie_fuer_diese_training >= kalorienZiel){
            return true;
        }else {
            return false;
        }
    } //liefert true, wenn das Training das in kalorienZiel festgelegte Ziel (zum Verbrennen der Kalorien) erreicht hat.
      //Dabei sollen die Dauer des Trainings und der durchschnittliche Kalorienverbrauch des Fitnessgeräts berücksichtigt werden.

    public int erforderlicheTrainingszeit (int kalorienZiel){
        return kalorienZiel / this.Kalorienverbrauch_pro_min;
    } //liefert die Anzahl der Minuten, die erforderlich sind, um die in kalorienZiel festgelegten Kalorien zu verbrennen


    public void trainieren (){
        this.Dauer_des_Trainings +=1;
    }  //erhöht die Trainingsdauer um 1 Minute


    public void trainieren (int minuten){
        this.Dauer_des_Trainings += minuten;
    } //erhöht die Trainingsdauer um 5 Minuten


    public int getDauer_des_Trainings(){
        return Dauer_des_Trainings;
    }


     /*
    Trainingseinheit: Eine Trainingseinheit speichert, welches Gerät wie lange verwendet wurde.
    Die Klasse repräsentiert eine Trainingseinheit mit einem Gerät.

    Die Klasse muss folgende Methoden besitzen:
    - Ein Konstruktor zum Festlegen des Fitnessgeräts
    - Ein Konstruktor zum Festlegen des Fitnessgeräts, Datums und Startzeit

     */
}
