package pets_project;

public class PetTest {

    public static void main(String[] args) {
        Dog rex = new Dog ("Rex", true);
        Husky teddy = new Husky("Teddy", true);

        Cat lucy = new Cat ("Lucy");
        ToygerCat simba = new ToygerCat("Simba", 1.5);
        ToygerCat cleo = new ToygerCat("Cleo", 10.0);

        Bird baby = new Bird("Baby", 0.5);
        Bird sunshine = new Bird("Sunshine", 12.0);
        Cockatoo charlie = new Cockatoo("Charlie", 7.0, 15.0);

        System.out.println(rex);
        rex.bark();
        rex.eat();

        System.out.println(teddy);
        teddy.bark();
        teddy.eat();
        teddy.solveMath(99);

        System.out.println(lucy);
        lucy.meow();
        lucy.eat();

        System.out.println(simba);
        simba.jump(5.0);
        simba.eat();

        System.out.println(cleo);
        cleo.jump(5.5);
        cleo.eat();

        System.out.println(baby);
        baby.fly();

        System.out.println(sunshine);
        sunshine.fly();
        sunshine.eat();

        System.out.println(charlie);
        charlie.fly();
        charlie.sing();

    }

}
