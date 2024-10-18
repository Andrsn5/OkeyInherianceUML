public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("Андрей Соловых","89515552735");
        Seller seller = new Seller("Петр Куралесин", "8950777555");

        ResidentialRealEstate residentialProperty = new ResidentialRealEstate("Moskovsky prospekt",120.5,140,14);
        CommersialRealEstate commersialProperty  = new CommersialRealEstate("Patriky",250,600,"apple store");
        PurchcaseAgreement residentAgreement = new PurchcaseAgreement(residentialProperty,buyer,seller);
        PurchcaseAgreement commersialAgreement = new PurchcaseAgreement(commersialProperty,buyer,seller);


        System.out.println(PurchcaseAgreement.agreementNumber());
        System.out.println(residentAgreement.agreementsDetails());
        System.out.println(commersialAgreement.agreementsDetails());


    }
}