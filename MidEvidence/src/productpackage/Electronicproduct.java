
package productpackage;

public class Electronicproduct extends Product{

    private int warrantyPeriod;

    public Electronicproduct() {
    }

    public Electronicproduct(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Electronicproduct(int warrantyPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double getSalePrice() {
        
        if(warrantyPeriod > 1){
            return super.getRegularPrice() * 0.85;
        }
        return super.getRegularPrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
}
