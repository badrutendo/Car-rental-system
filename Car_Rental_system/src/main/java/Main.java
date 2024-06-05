import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rental_Agency rentalAgency = new Rental_Agency();

        while (true) {
            System.out.println("Car Rental System");
            System.out.println("1. Add Car");
            System.out.println("2. Add Customer");
            System.out.println("3. Rent Car");
            System.out.println("4. Return Car");
            System.out.println("5. List Available Cars");
            System.out.println("6. List Customers");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addCar(scanner, rentalAgency);
                    break;
                case 2:
                    addCustomer(scanner, rentalAgency);
                    break;
                case 3:
                    rentCar(scanner, rentalAgency);
                    break;
                case 4:
                    returnCar(scanner, rentalAgency);
                    break;
                case 5:
                    rentalAgency.listAvailableCars();
                    break;
                case 6:
                    rentalAgency.listCustomers();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    private static void addCar(Scanner scanner, Rental_Agency rentalAgency) {
        System.out.print("Enter license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter rental price per day: ");
        double rentalPricePerDay = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        Car car = new Car(licensePlate, make, model, year, rentalPricePerDay);
        rentalAgency.addCar(car);
        System.out.println("Car added: " + car);
    }

    private static void addCustomer(Scanner scanner, Rental_Agency rentalAgency) {
        System.out.print("Enter name ");
        String name = scanner.nextLine();
        System.out.print("driver license number");
        String driverLicenseNumber = scanner.nextLine();
        System.out.print("Enter contact number");
        String contactNumber = scanner.nextLine();
     
        Customer customer = new Customer(name, driverLicenseNumber, contactNumber);
        rentalAgency.addCustomer(customer);
        System.out.println("Customer added: " + customer);
    }

    private static void rentCar(Scanner scanner, Rental_Agency rentalAgency) {
        System.out.print("Enter license plate of the car to rent: ");
        String driverLicenseNumber = scanner.nextLine();
        System.out.print("Enter customer name ");
        String name = scanner.nextLine();
      
        if (rentalAgency.rentCar(driverLicenseNumber, name)) {
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Failed to rent car. Either the car is not available or the customer ID is invalid.");
        }
    }

    private static void returnCar(Scanner scanner, Rental_Agency rentalAgency) {
        System.out.print("Enter license plate of the car to return: ");
        String licensePlate = scanner.nextLine();

        if (rentalAgency.returnCar(licensePlate)) {
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Failed to return car. Either the car is not rented or the license plate is invalid.");
        }
    }
}
