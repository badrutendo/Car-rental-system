import java.util.ArrayList;
import java.util.List;

public class Rental_Agency {

    private final List<Car> cars;
    private final List<Customer> customers;
    private final List<Rental_Transaction> transactions;

    // Constructor
    public Rental_Agency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Add a car to the inventory
    public void addCar(Car car) {
        cars.add(car);
    }

    // Add a customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Rent a car
    public boolean rentCar(String licensePlate, String name) {
        Car car = findCar(licensePlate);
        Customer customer = findCustomer(name);
        
        if (car != null && customer != null && !car.isRented()) {
            car.setRented(true);
            Rental_Transaction transaction = new Rental_Transaction(car, customer);
            transactions.add(transaction);
            return true;
        }
        return false;
    }

    // Find a car by license plate
    private Car findCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }

    // Find a customer by driver license number
    private Customer findCustomer(String driverLicenseNumber) {
        for (Customer customer : customers) {
            if (customer.getDriverLicenseNumber().equals(driverLicenseNumber)) {
                return customer;
            }
        }
        return null;
    }

    // Return a car
    public boolean returnCar(String licensePlate) {
        Car car = findCar(licensePlate);
        if (car != null && car.isRented()) {
            car.setRented(false);
            return true;
        }
        return false;
    }

    // Get a list of all cars
    public List<Car> getCars() {
        return cars;
    }

    // Get a list of all customers
    public List<Customer> getCustomers() {
        return customers;
    }

    // Get a list of all rental transactions
    public List<Rental_Transaction> getTransactions() {
        return transactions;
    }

    void listCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void listAvailableCars() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
