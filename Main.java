public class Main {
    public static void main(String[] args) {
       
        Item iphone1 = new Item("iPhone 14 Pro", 74000, 3);
        iphone1.buy();
        iphone1.buy();
        iphone1.buy();
        iphone1.returnItem();
        iphone1.logDetails();

       
        Item iphone2 = new Item("iPhone 13", 57000, 3);
        iphone2.buy();
        iphone2.buy();
        iphone2.returnItem();
        iphone2.returnItem();
        iphone2.logDetails();

        
        Item iphone3 = new Item("iPhone 12", 30900, 5);
        iphone3.returnItem();
        iphone3.returnItem();
        iphone3.returnItem();
        iphone3.logDetails();

       
        Item iphone4 = new Item("iPhone 11", 24000, 1);
        iphone4.buy();
        iphone4.buy();
        iphone4.logDetails();
    }
}
