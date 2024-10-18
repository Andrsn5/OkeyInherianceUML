public class ResidentialRealEstate extends RealEstate{
    private int numberOfBedrooms;
    public ResidentialRealEstate(String adress, double area,double money,int numberOfBedrooms) {
        super(adress,area,money);
        this.numberOfBedrooms=numberOfBedrooms;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    @Override
    public String Description() {
        return super.Description() + "This resident property has " + numberOfBedrooms + " number of bedrooms";
    }
}
