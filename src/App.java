import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Uppg del 1
        Scanner tangentbord = new Scanner(System.in);
        int passagerare = 0;
        int val = 0;
        while (val!=5){
            System.out.println("       ");
            System.out.println("Meny: \n 1. Nollställ antalet passagerare. \n 2. Öka antalet passagerare med ett. \n 3. Minska antalet passagerar med ett. \n 4. Skriv ut antalet passagerare. \n 5. Avsluta");
            System.out.print("Inmata siffran för det alternativet du vill välja här: ");
            val = tangentbord.nextInt();
            tangentbord.nextLine();
            switch (val){
                case 1:
                System.out.println("Antalet passagerare har ändrats till 0");
                passagerare = 0;
                val = 0;
                break;
                case 2:
                System.out.println("Antalet passagerare har ökats med ett från "+passagerare+" till "+(passagerare+1));
                passagerare++;
                val = 0;
                break;
                case 3:
                System.out.println("Antalet passagerare har minskats med ett från "+passagerare+" till "+(passagerare-1));
                passagerare--;
                val = 0;
                break;
                case 4:
                System.out.println("Antalet passagerare just nu är "+passagerare);
                val = 0;
                break;
            }
            if (val<1 || val>5) {
                System.out.println("Du har gjort en felaktig inmatning, du måste inmata en siffra som motsvarar det alternativ i menyn som du vill ska utföras.");
                val = 0;
            }
        }
        if (val==5){
            System.out.println("Programmet avslutades. Om du vill återgå till menyn, var god och starta då om programmet.");
        }
        tangentbord.close();
    }
}
