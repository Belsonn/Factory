import java.util.Scanner;

public class BottleChange {

    public static void main(String[] args)
    {
        BottleFactory bottleFactory = new BottleFactory();

        Bottle bottle = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of drink you choose(w-water,c-cola,s-sprite)");

        if(scanner.hasNextLine())
        {
            String typeOfBottle = scanner.nextLine();

            bottle = bottleFactory.createABottle(typeOfBottle);
        }

        if(bottle != null)
        {
            bottle.drink();
        }

  }
}
