package pets_project;

public class Bird extends Pet {

    private double size;

    public Bird (String n, double sz) {
        super (n);
        size = sz;
    }

    public void fly () {
        if (size > 3.0) {
            System.out.println("feeeh, feeeh, feeeh");
        } else {
            System.out.println("fliph, fliph, fliph");
        }
    }

    public void eat () {
        System.out.println("Chirp, chirp...");
    }

    public String toString () {
        return "Bird named " + getName();
    }

}
