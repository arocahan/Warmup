import VerClassen.Adresse;
import VerClassen.Apotheke;
import VerClassen.Springer;
import testPackage.MessingAround;
import testPackage.MessingAroundWithSubclasses;

import java.util.Date;

public class APP {

    /*
    Die App soll Fitnessgeräte, Trainingspläne und erreichte Ziele verwalten können.

            App: In dieser Klasse legen Sie die main-Methode an. In der main-Methode können Sie dann den
    weiteren Programmablauf regeln, z.B. Objekte von anderen Klassen erzeugen und Methoden
    aufrufen.


    Anforderungen an die main-Methode in der Klasse App:
    Erzeugen Sie zwei Fitnessgeräte und legen Sie für diese alle erforderlichen Daten fest (Sie dürfen sich
            Daten ausdenken). Rufen Sie alle Methoden der Klassen Fitnessgerät, Trainingseinheit
    und Muskelgruppe beispielhaft für Objektinstanzen dieser Klassen auf.
    Erzeugen Sie ein weiteres Objekt der Klasse Trainingseinheit. Rufen Sie für dieses Objekt in
    einer while-Schleife solange die Methode trainieren(5) auf, bis ein gewünschtes
    Trainingsziel von 800 Kalorien erreicht ist. Es wird also immer in 5-Minuten-Intervallen trainiert bis
    mindestens 800 Kalorien erreicht sind. Geben Sie danach die tatsächlich verbrauchten Kalorien aus.


     */

    public static void main(String[]args){

            Adresse melisaSoftaAdresse = new Adresse("Seestrasse", 1, 8703, "Erlenbach");
            Adresse pfauenApoAdresse = new Adresse("Rämistrasse", 38, 8001, "Zürich");

            Springer melisaSofta = new Springer("Anett Bors", melisaSoftaAdresse, true);
            Apotheke pfauenApo = new Apotheke("Pfauen Apotheke AG", pfauenApoAdresse);

            System.out.println(pfauenApo.getName());

            MessingAround test = new MessingAround("ArianDefault", "HectorPublic", "RaymelProtected", "NanoPrivate");
            System.out.println(test.testPublic);

            MessingAroundWithSubclasses Subtest = new MessingAroundWithSubclasses("ArianDefault", "HectorPublicSub", "RaymelProtected", "NanoPrivate");
            System.out.println(Subtest.testPublic);

 //----------------------------------Aufgabe_1---------------------------------------------------
        //Die Muskelgruppe „Brust“ aus „großer Brustmuskel“ und „kleiner Brustmuskel“.
        //Die Muskelgruppe „Arme“ besteht aus „Bizeps“ „Brachialis“ und „Trizep“.

        String [] Brust = new String[2];
        Brust[0] = "großer Brustmuskel";
        Brust[1] = "kleiner Brustmuskel";
        String [] Arme = new String[0];
        String [] FullBody = new String[0];

        Muskelgruppe gruppeBrust = new Muskelgruppe(Brust, 2);
        Muskelgruppe gruppeArme = new Muskelgruppe(Arme, 2);
        Muskelgruppe gruppeFullBody = new Muskelgruppe(FullBody, 10);

        System.out.println(gruppeBrust.enthält("großer Brustmuskel"));

        Fitnessgeraet Crosstrainer = new Fitnessgeraet("Crosstrainer", "Cardio", gruppeBrust, 30, 500);
        Fitnessgeraet Lastzug = new Fitnessgeraet("Lastzug", "Krafttraining", gruppeArme, 30, 500);
        Fitnessgeraet Rudermaschine = new Fitnessgeraet("Rudermaschine", "Cardio", gruppeFullBody, 60, 1300);

        Date date = new Date();
        Trainingseinheit Montag = new Trainingseinheit(10, date, Crosstrainer,10 );
        System.out.println(Montag.zielErreicht(101));
        System.out.println(Montag.erforderlicheTrainingszeit(110));
        System.out.println(Montag.getDauer_des_Trainings());
        Montag.trainieren(11);
        System.out.println(Montag.getDauer_des_Trainings());
        Montag.trainieren();
        System.out.println(Montag.getDauer_des_Trainings());
        System.out.println(Crosstrainer.unterstuetzt(gruppeArme));

        //----------------------------------Aufgabe_1---------------------------------------------------

/*

        Klasse TrainingseinheitMitZiel: Diese Klasse erweitert die existierende Klasse
        Trainingseinheit und implementiert das Interface Trainingsziel. Für eine
        Trainingseinheit kann somit festgelegt werden, wie hoch der Kalorienverbrauch sein soll.



        1. Definieren Sie das Interface und die beiden Klassen.
        2. Legen Sie in der App-Klasse mindestens ein Objekt von Trainingseinheit und ein Objekt von TrainingseinheitMitZiel an.
        3. Erzeugen Sie ein Objekte der Klasse TrainingsProgramm. Fügen Sie diesem Trainingsprogramm die bislang erstellten Trainingseinheiten hinzu.
        4. Skizzieren auf einem Blatt Papier, wie die Klassen zusammenhängen und wie die erzeugten Objekte zusammenhängen.
           Sie können eine informelle Notation wählen, z.B. einfach Kreise für die Objekte zeichnen.

                Methoden für das Interface Trainingsziel
        - setKalorienZiel (int kalorienZiel)  setzt das Trainingsziel in Kalorien
        - int getKalorienZiel ()  liefert das gesetzte Trainingsziel in Kalorien
        - double getZielerreichungsgrad ()  liefert den Zielerreichungsgrad, also welcher Anteil der angestrebten Kalorien schon erreicht ist.

        Beispiel: Wenn das Trainingsziel 800 Kalorien sind und bereits 600 Kalorien verbraucht wurden,
        dann ist der Zielerreichungsgrad 0.75 = Berechnungsbeispiel: erreichteKalorien / kalorienZiel = 600/800 = 0.75
        Weiter auf der nächsten Seite. Anforderungen an die Klasse TrainingseinheitMitZiel
        Die Klasse erweitert die Klasse Trainingseinheit und implementiert das Interface Trainingsziel.
        Die Klasse muss die Methoden des Interfaces sinnvoll implementieren. Hierzu müssen entsprechende
        Eigenschaften festgelegt werden.
                Die Klasse muss folgenden Konstruktor besitzen:
        TrainingseinheitMitZiel(int dauer , int tag, int monat, int jahr,
        int hh, int mm, Fitnessgeraet fitnessgeraet,
        int kalorienZiel)
        Einen ähnlichen Konstruktor gibt es bereits in der Oberklasse Trainingseinheit. Nutzen Sie den
        Konstruktor der Oberklasse, um Codeverdoppelung zu vermeiden.
                Die Klasse muss folgende Methode überschreiben:
        void trainieren (int minuten)  erhöht genauso wie in der Oberklasse die
        Trainingsdauer um die angegebene Anzahl minuten. Zusätzlich gibt diese neu implementierte
        Methode auf der Konsole einmalig „Hurra“ aus, wenn durch das weitere Training das gesetzte
        kalorienZiel erreicht wurde.
                Wichtig: Verwenden Sie in der überschriebenen Methode die vorhandene Funktionalität der
        Oberklasse, indem Sie mit super auf die Methode der Oberklasse (Super – Class) zugreifen.
                Anforderungen an die Klasse Trainingsprogramm:
        Die Klasse verwaltet mehrere Trainingseinheiten.
                Die Klasse muss folgende Eigenschaft besitzen:
        - Eine ArrayList mit allen Trainingseinheiten
        - Das Kalorienziel, das mit diesem Trainingsprogramm erreicht werden soll
        Die Klasse muss folgende Methoden definieren:
        - addTrainingseinheit (Trainingseinheit trainingseinheit)  fügt
        eine weitere Trainingseinheit dem Trainingsprogramm hinzu. Es kann sich um eine normale
        Trainingseinheit oder eine TrainingseinheitMitZiel handeln.
                Die Klasse muss zudem das Interface Trainingsziel implementieren und alle Methoden sinnvoll
        festlegen. Hierzu sind ggf. zusätzliche Eigenschaften nötig.
                Beachten Sie, dass bei der Methode getZielerreichungsgrad () der gesamte
        Kalorienverbrauch aller Trainingseinheiten berücksichtig werden muss! Den Kalorienverbrauch einer
        Trainingseinheit können Sie berechnen, da für jede Trainingseinheit die Dauer und das verwendete
        Fitnessgerät bekannt sind.




 */


        }
    }

