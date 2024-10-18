public class CommersialRealEstate extends RealEstate{
    private String businessType;
    public CommersialRealEstate(String adress, double area,String businessType) {
        super(adress, area);
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
