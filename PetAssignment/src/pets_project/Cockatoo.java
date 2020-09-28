package pets_project;

public class Cockatoo extends Bird {

    private double voiceVolume;

    public Cockatoo (String n, double sz, double vl) {
        super (n, sz);
        voiceVolume = vl;
    }

    public void sing () {
        if (voiceVolume > 5.0) {
            System.out.println("COCKATOOOO! COCKATOOOO!");
        } else {
            System.out.println("cough, cough...");
        }
    }

}
