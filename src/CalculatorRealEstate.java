public class CalculatorRealEstate {
    public static double AvgRealEstate(double area, double price){
        return Math.round((area/price)*100)/100.0;
    }
}
