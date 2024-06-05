public class Customer {
    private String name;
    private String driverLicenseNumber;
    private String contactNumber;

    // Constructor
    public Customer(String name, String driverLicenseNumber, String contactNumber) {
        this.name = name;
        this.driverLicenseNumber = driverLicenseNumber;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
