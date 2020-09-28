package pets_project;

public class ToygerCat extends Cat {

    private double jumpingHeight;

    public ToygerCat (String n, double jh) {
        super (n);
        jumpingHeight = jh;
    }

    public void jump (double h) {
        if (jumpingHeight >= h) {
            System.out.println("It's easy, meow!");
        } else {
            System.out.println("I can't, meow...");
        }
    }

    public void eat () {
        if (jumpingHeight > 2.0) {
            System.out.println("Flewh, flewh...");
        } else {
            System.out.println("feegh, feegh...");
        }
    }

    public String toString () {
        return "Toyger Cat named " + getName();
    }

}
