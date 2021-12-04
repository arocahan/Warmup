import java.util.Date;

public class TrainingseinheitMitZiel extends Trainingseinheit{
    public TrainingseinheitMitZiel(int dauer_des_Trainings, Date datum_und_Startzeit_des_Trainings, Fitnessgeraet welches_Fitnessgerät_verwendet_wurde, int kalorienverbrauch_pro_min) {
        super(dauer_des_Trainings, datum_und_Startzeit_des_Trainings, welches_Fitnessgerät_verwendet_wurde, kalorienverbrauch_pro_min);
    }
}
