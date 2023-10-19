import java.util.Scanner;

public class van  {


    private final int weight;

    private van(int weight) {


        this.weight = weight;
    }
    public String toString(){

        return "Skåpbil [" + weight + "kg]";
    }


    public static void vanOption(Scanner scanner, Avlastningsstation avlastningsstation){


        if (avlastningsstation.ParkeringA.isEmpty())
        {   System.out.println("Vikt på skåpbil: ");
            int weightOnVan = scanner.nextInt();
            van van = new van(weightOnVan);
            avlastningsstation.ParkeringA.add(van.toString());
            System.out.println("Skåpbilen är registrerad för kaj A, återvänd till huvudmeny");
        }
        else if (avlastningsstation.ParkeringB.isEmpty()){
            System.out.println("Vikt på skåpbil: ");
            int weightOnVan = scanner.nextInt();
            van van = new van(weightOnVan);
            avlastningsstation.ParkeringB.add(van.toString());
            System.out.println("Skåpbilen är registrerad för kaj B, återvänd till huvudmeny");
        }

        else System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");


    }


    }



