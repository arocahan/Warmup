import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TrainingseinheitTest {

    String [] Brust = new String[2];
    Muskelgruppe gruppeBrust = new Muskelgruppe(Brust, 2);
    Date date = new Date();
    Fitnessgeraet Crosstrainer = new Fitnessgeraet("Crosstrainer", "Cardio", gruppeBrust, 30, 500);
    Trainingseinheit Montag = new Trainingseinheit(10, date, Crosstrainer,10 );

    @Test
    public void zielErreicht() {
        assertEquals(true, Montag.zielErreicht(100));
    }

    @Test
    public void trainieren() {
    }

    @Test
    public void testTrainieren() {
    }
}