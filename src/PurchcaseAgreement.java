public class PurchcaseAgreement {
    private static int number=0;
    private RealEstate property;
    private Buyer buyer;
    private Seller seller;
    public PurchcaseAgreement(RealEstate property, Buyer buyer, Seller seller){
        this.buyer=buyer;
        this.property=property;
        this.seller=seller;
    }
    public String agreementsDetails(){
        return "Number agreement " + agreementNumber() + " .Purchcase Agreement\n" +"Property: " + property.Description() + "\n" + "Buyer:" + buyer.getName() + "\n" + "Seller: " + seller.getName();
    }
    public static int agreementNumber(){
        return number++;
    }
    static {
        System.out.println("Congratulations!!! You first client !!! You get 50% discount !!!");
    }
}
