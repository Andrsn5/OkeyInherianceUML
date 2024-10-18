public class PurchcaseAgreement {
    private RealEstate property;
    private Buyer buyer;
    private Seller seller;
    public PurchcaseAgreement(RealEstate property, Buyer buyer, Seller seller){
        this.buyer=buyer;
        this.property=property;
        this.seller=seller;
    }
    public String agreementsDetails(){
        return "Purchcase Agreement\n" +"Property: " + property.Description() + "\n" + "Buyer:" + buyer.getName() + "\n" + "Seller" + seller.getName();
    }
}
