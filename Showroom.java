import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter year: ");
        int year = 0;
        while (true) {
            String yearStr = sc.nextLine();
            try {
                year = Integer.parseInt(yearStr);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid year. Enter numeric year: ");
            }
        }
        System.out.print("Enter fuel type: ");
        String fuelType = sc.nextLine();

        Car car = new Car(brand, model, year, fuelType);
        System.out.println();
        System.out.println("Car Details:");
        car.displayDetails();
        sc.close();
    }
}
