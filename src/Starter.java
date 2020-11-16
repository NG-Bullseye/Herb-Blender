import java.util.Scanner;

public class Starter {
    public Starter() {
        float w;
        float t;
        float g;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter percent of Weed");
        w=s.nextInt();
        System.out.println("Enter percent of Tabaco");
        t=s.nextInt();
        System.out.println("Enter weight of the Blend");
        g=s.nextInt();

        w=(w/100)*g;
        t=(t/100)*g;
        float k = g-w-t;
        System.out.println("Here is your blend");
        System.out.println("Weed: "+w);
        System.out.println("Tabaco: "+t);
        System.out.println("Herbs: "+k);
    }
    public static void main(String[] args){
        new Starter();
    }
}
