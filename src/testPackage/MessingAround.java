package testPackage;

public class MessingAround {
    String testDefault;
    public String testPublic;
    protected String testProtected;
    private String tetsPrivate;

    public MessingAround (String testDefault, String testPublic, String testProtected, String testPrivate){
        this.testDefault = testDefault;
        this.testPublic = testPublic;
        this.testProtected = testProtected;
        this.tetsPrivate = testPrivate;
    }
}

