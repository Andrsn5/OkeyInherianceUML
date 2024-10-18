public class RealEstate {
    public static final String currency = "$";
    private String adress;
    private double area;
    private double money;

    public RealEstate(String adress,double area, double money){
        this.adress=adress;
        this.area=area;
        this.money=money;
    }

    public double getArea() {
        return area;
    }

    public String getAdress() {
        return adress;
    }
    public String Description(){
        return "Property located at " + adress + " with an area of " + area + " square units. " + "Price " + money + currency + ". Avg Price " + CalculatorRealEstate.AvgRealEstate(area,money) +". ";
    }
}
