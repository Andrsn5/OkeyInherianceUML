public class RealEstate {
    private String adress;
    private double area;

    public RealEstate(String adress,double area){
        this.adress=adress;
        this.area=area;
    }

    public double getArea() {
        return area;
    }

    public String getAdress() {
        return adress;
    }
    public String Description(){
        return "Property located at " + adress + " with an area of " + area + " square units.";
    }
}
