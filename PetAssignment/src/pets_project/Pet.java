package pets_project;

public class Pet {

    private String name;

    public Pet (String n) {
        name = n;
    }

    public String getName () {
        return name;
    }

    public void eat () {
        System.out.println("Nom, nom...");
    }

    public String toString () {
        return "Animal named " + name;
    }

}
