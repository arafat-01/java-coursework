package pets_project;

public class Cat extends Pet {

    public Cat (String n) {
        super (n);
    }

    public void meow () {
        System.out.println("mew...");
    }

    public void eat () {
        System.out.println("slurp, slurp");
    }

    public String toString () {
        return "Cat named " + getName();
    }

}
