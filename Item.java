class Item {
    String itemName;
    double price;
    int sold;
    int stock;

    
    Item(String itemName, double price, int stock) {
        this.itemName = itemName;
        this.price = price;
        this.stock = stock;
        this.sold = 0;
    }

    
    void logDetails() {
        System.out.println("iPhone Model: " + itemName);
        System.out.println("Price: " + price +"pesos");
        System.out.println("Stock: " + stock);
        System.out.println("Sold: " + sold);
        System.out.println("---------------------");
    } 

    
    void buy() {
        if (stock > 0) {
            stock--;
            sold++;
            System.out.println("You Bought 1 " + itemName);
        } else {
            System.out.println("Sorry Maam/Sir, The Item is Out of stock!");
        }
    }

    
    void returnItem() {
        if (sold > 0) {
            stock++;
            sold--;
            System.out.println("You Returned 1 " + itemName);
        } else {
            System.out.println("No iPhone to return!");
        }
    }
}