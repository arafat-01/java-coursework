package pets_project;

public class Dog extends Pet {

    private boolean isBig;

    public Dog (String n, boolean bg) {
        super (n);
        isBig = bg;
    }

    public void bark () {
        if (isBig) {
            System.out.println("WOOF!!!");
        } else {
            System.out.println("guf, guf.");
        }
    }

    public void eat () {
        if (isBig) {
            System.out.println("MUNCH, SLURP!!!");
        } else {
            System.out.println("chomp, chomp.");
        }
    }

    public String toString () {
        return "Dog named " + getName();
    }

}
