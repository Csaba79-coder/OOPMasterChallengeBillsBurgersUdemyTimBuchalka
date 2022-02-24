import model.Hamburger;

public class BillsBurger {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        // double price = hamburger.getPrice(); // --> 3.56
        double price = hamburger.itemizeHamburger(); // --> Basic hamburger on a White roll and price is: 3.56
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is " + price); // instead of price: hamburger.itemizeHamburger() <-- if I do not want to store it in variable!
    }
}
