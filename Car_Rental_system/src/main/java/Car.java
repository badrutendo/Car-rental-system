public class Car {
    private String licensePlate;
    private String model;
    private String make;
    private int year;
    private double rentalPricePerDay;
    private boolean isRented;

    // Constructor
    public Car(String licensePlate, String model, String make, int year, double rentalPricePerDay) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.make = make;
        this.year = year;
        this.isRented = false;
    }

    // Getters and Setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }
  
    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public double getrentalPriceperDay(){
        return rentalPricePerDay;
    }
    public void setrentalPricePerDay(double rentalPricePerDay){
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }
}
