package csci235;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue <Integer> q = new LinkedListQueue<>();

        for (int i = 1;i <= 100;i += 10) q.push (i);
        q.pop ();
        System.out.println(q);

        q.clear ();
        System.out.println(q);

        q.push (-1);
        q.push (3);
        System.out.println (q.peek() + " " + q.size());
        q.pop ();
        q.pop ();

        if (q.empty ())
            System.out.println("Queue is empty!");
        else
            System.out.println("Queue is not empty!");

        q.push (1);
        System.out.println(q);
    }
}
