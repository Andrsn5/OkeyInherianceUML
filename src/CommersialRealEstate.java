public class CommersialRealEstate extends RealEstate{
    private String businessType;
    public CommersialRealEstate(String adress, double area,double money, String businessType) {
        super(adress, area,money);
        this.businessType=businessType;
    }

    public String getBusinessType() {
        return businessType;
    }

    @Override
    public String Description() {
        return super.Description() + "This commersial property is suitable for " + businessType + ".";
    }
}
