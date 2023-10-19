import java.util.Scanner;

public class SmallTruck  {


    private final int weight;

    private SmallTruck(int weight) {

        this.weight = weight;
    }
    public String toString(){

        return "Lätt lastbil [" + weight + "kg]";
    }


    public static void SmallTruckOption(Scanner scanner, Avlastningsstation avlastningsstation){

        System.out.println("Vikt på lätt lastbil: ");
        int weightOnSmallTruck = scanner.nextInt();
        SmallTruck SmallTruck = new SmallTruck(weightOnSmallTruck);
        if (avlastningsstation.ParkeringC.isEmpty())
        {
            avlastningsstation.ParkeringC.add(SmallTruck.toString());
            System.out.println("Lätta lastbilen är registrerad för kaj C, återvänd till huvudmeny");
        }
        else if (avlastningsstation.ParkeringD.isEmpty()){
            avlastningsstation.ParkeringD.add(SmallTruck.toString());
            System.out.println("Lätta lastbilen är registrerad för kaj D, återvänd till huvudmeny");
        }
        else if (weightOnSmallTruck < 5000 && avlastningsstation.ParkeringA.isEmpty()){
            avlastningsstation.ParkeringA.add(SmallTruck.toString());
            System.out.println("Lätta lastbilen är registrerad för kaj A, återvänd till huvudmeny");
        }
        else System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");

    }


}
