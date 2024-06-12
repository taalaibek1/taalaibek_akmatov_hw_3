import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 names: ");
        ArrayList<String> namesA = new ArrayList<>();
        ArrayList<String> namesB = new ArrayList<>();
        ArrayList<String> namesC = new ArrayList<>();



        for(int i=0; i<5; i++){
            String scanA = scanner.next();
            System.out.println("You have written names for list A : " + scanA );
            namesA.add(scanA);

        }
        System.out.println("First list:" + "\n" +namesA);


        for(int i = 0;i<5; i++){
            String scanB = scanner.next();
            System.out.println("You have written names for list B : " + scanB );
            namesB.add(scanB);
        }
        System.out.println("Second list:" + "\n" +namesB);

namesC.add(namesA.get(0));
namesC.add(namesB.get(4));
        namesC.add(namesA.get(1));
        namesC.add(namesB.get(3));
        namesC.add(namesA.get(2));
        namesC.add(namesB.get(2));
        namesC.add(namesA.get(3));
        namesC.add(namesB.get(1));
        namesC.add(namesA.get(4));
        namesC.add(namesB.get(0));

        System.out.println("Third List:\n"+namesC);

        namesC.sort(Comparator.comparing(String::length));
        System.out.println("Sorted list:\n" + namesC);


    }
}
