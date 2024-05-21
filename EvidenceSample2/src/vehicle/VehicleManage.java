
package vehicle;

public abstract class VehicleManage {
    // registrationNumber (String), brand (String), and year (int). Include abstract methods start() and stop().
        
    private String registrationNumber;
    private String brand;
    private int year;

    public VehicleManage() {
    }

    public VehicleManage(String registrationNumber, String brand, int year) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.year = year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public abstract void start();
    
    public abstract void stop();
}
