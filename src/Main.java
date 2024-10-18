public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("Андрей Соловых","89515552735");
        Seller seller = new Seller("Петр Куралесин", "8950777555");

        ResidentialRealEstate residentialProperty = new ResidentialRealEstate("Moskovsky prospekt",120.5,14);
        CommersialRealEstate commersialProperty  = new CommersialRealEstate("Patriky",250,"apple store");
        PurchcaseAgreement purchcaseAgreement = new PurchcaseAgreement(residentialProperty,buyer,seller);

        System.out.println(residentialProperty.Description());
        System.out.println("---------------------");
        System.out.println(purchcaseAgreement.agreementsDetails());

    }
}