package Model;

public class Accompaniedservice {
    private String  Servicenameincluded = "massage,karake,fool,water,Rent a moving vehicle";
    private String unit;
    private float price;

    public Accompaniedservice() {
    }
    public Accompaniedservice(String servicenameincluded, String unit, float price) {
        Servicenameincluded = servicenameincluded;
        this.unit = unit;
        this.price = price;
    }

    public String getServicenameincluded() {
        return Servicenameincluded;
    }

    public void setServicenameincluded(String servicenameincluded) {
        Servicenameincluded = servicenameincluded;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Servicenameincluded"+this.getServicenameincluded()+
                "unit"+this.getUnit()+
                "price"+this.getPrice();
    }
}
