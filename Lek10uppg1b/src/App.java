import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Välj ett nummer:");
        String valdatal = scan.nextLine();
        
        int tal = Integer.parseInt(valdatal);
        
        if(tal > 10) {
            System.out.println("Talet " + tal + " är större än 10");
        } else {
            System.out.println("Talet är lika med eller mindre än 10");
        }
        
        scan.close();
    }
}
