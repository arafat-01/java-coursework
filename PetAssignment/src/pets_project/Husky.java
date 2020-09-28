package pets_project;

public class Husky extends Dog {

    public Husky (String n, boolean bg) {
        super (n, bg);
    }

    public void solveMath (int a) {
        System.out.println(a+1);
    }

    public void eat() {
        System.out.println("Ahm, ahm...");
    }

    public String toString () {
        return "Husky dog named " + getName();
    }

}
