import java.util.Scanner;

/**
 * Created by nilajapatankar on 7/16/14.
 */
public class Broker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give specifications for your house:");
        IHouse house = new SimpleHouse();

        System.out.println("Do you need garden? (y/n): ");
        String needGarden = sc.nextLine();
        System.out.println("Do you need multiple floors? (y/n): ");
        String needMultipleFloors = sc.nextLine();
        System.out.println("Do you need terrace? (y/n): ");
        String needTerrace = sc.nextLine();

        if(needGarden.equalsIgnoreCase("y")) {
            HouseWithGarden houseWithGarden = new HouseWithGarden(house);
            house = houseWithGarden;
        }

        if(needMultipleFloors.equalsIgnoreCase("y")) {
            HouseWithMultipleFloors houseWithMultipleFloors = new HouseWithMultipleFloors(house);
            house = houseWithMultipleFloors;
        }

        if(needTerrace.equalsIgnoreCase("y")) {
            HouseWithTerrace houseWithTerrace = new HouseWithTerrace(house);
            house = houseWithTerrace;
        }

        System.out.println("Rent of your home will be : "+house.GetPrice());
    }
}