package DZ4_Z2;
import java.util.LinkedList;
public class Progran {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(ll, getRandomNumber()); 
        }
        System.out.println(ll);

        System.out.println(dequeue(ll)); 
        System.out.println(ll);

        System.out.println(first(ll)); 
        System.out.println(ll); 
    }

    public static void enqueue(LinkedList<Integer> ll, int num) {
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) { 
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) { 
        int num = ll.get(0);
        return num;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
