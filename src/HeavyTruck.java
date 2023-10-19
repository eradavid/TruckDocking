import java.util.Scanner;

public class HeavyTruck  {


    private final int weight;

    private HeavyTruck(int weight) {

        this.weight = weight;}

    public String toString(){

        return "Tung lastbil [" + weight + "kg]";}


    public static void HeavyTruckOption(Scanner scanner, Avlastningsstation avlastningsstation){

        System.out.println("Vikt på tung lastbil: ");
        int weightOnHeavyTruck = scanner.nextInt();
        HeavyTruck HeavyTruck = new HeavyTruck(weightOnHeavyTruck);
        if (avlastningsstation.ParkeringE.isEmpty())
        {
            avlastningsstation.ParkeringE.add(HeavyTruck.toString());
            System.out.println("Tunga lastbilen är registrerad för kaj E, återvänd till huvudmeny");
        }
        else if (weightOnHeavyTruck < 9000 && avlastningsstation.ParkeringD.isEmpty()){
            avlastningsstation.ParkeringD.add(HeavyTruck.toString());
            System.out.println("Tunga lastbilen är registrerad för kaj D, återvänd till huvudmeny");
        }
        else System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");

    }

    }


