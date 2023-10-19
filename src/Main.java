
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avlastningsstation avlastningsstation = new Avlastningsstation();
        boolean menuStillGoing = true;
        while (menuStillGoing) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n- Avlastningsstationen dumpa mera -\n [1] - Se parkerade lastbilar\n [2] - Registrera ny avlastande lastbil\n [3] - Avsluta");

            String menuchoice = scanner.nextLine();
            if (menuchoice.equals("1")) {
            avlastningsstation.printList();

            } else if (menuchoice.equals("2")) {

                System.out.println("Typ av lastbil:\n - [1]skåpbil\n - [2]lätt lastbil\n - [3]tung lastbil\n");

                String menuchoice2 = scanner.nextLine();
                switch (menuchoice2) {

                    case "1":
                        van.vanOption(scanner, avlastningsstation);

                        break;
                    case "2":
                        SmallTruck.SmallTruckOption(scanner, avlastningsstation);

                        break;
                    case "3":
                        HeavyTruck.HeavyTruckOption(scanner, avlastningsstation);

                        break;

                    default: System.out.println("Du angav inte ett giltigt menyval");
                }




            }
            else if (menuchoice.equals("3")){
                System.out.println("Menyn är klar, hejdå!");
                menuStillGoing = false;


            }

            else {System.out.println("Ange ett giltigt menyval!");}
        }


    }
}