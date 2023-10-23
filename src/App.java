import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Skriv in ditt användarnamn: ");
        String user = tb.nextLine();
        System.out.println("Skriv in ditt lösenord: ");
        String lösen = tb.nextLine();

        if (user=="root" && lösen=="passwd"){
            System.out.println("Välkommen");
        }
        else{
            System.out.println("Fel lösenord eller användarnamn");
        }

    }
}
