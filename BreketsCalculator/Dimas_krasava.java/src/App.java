import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite stroku so skobochkami ():");

        String input = scanner.nextLine();

        //peremennye dlya sk
        int openBrakets = 0;
        int closedBrakets = 0;
        int totalBrackets = 0;

        int aboba = 0;

        //cycle 
        while(aboba < input.length()) {
            char currentChar = input.charAt(aboba);
            if (currentChar == '(') {
                openBrakets++;
                totalBrackets++;
            } else if (currentChar == ')') {
                closedBrakets++;
                totalBrackets++;
            }
            aboba++;
        }

        //vivod
        System.out.println("Kilkist vidkritih skobochok: " + openBrakets);
        System.out.println("Kilkist zakritih skobochok: " + closedBrakets);
        System.out.println("vsygo kilkist skobochok: " + totalBrackets);

        if (openBrakets == closedBrakets) {
            System.out.println("Kilkist duzhok rivna.");
        } else {
            System.out.println("Kilkist duzhok ne rivna, bratik: " + Math.abs(openBrakets - closedBrakets));
        }

        scanner.close();
    }
}
