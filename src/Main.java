public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to " + SuperMarket.name);

        SuperMarket.Item item = new SuperMarket.Item();
        item.displayItems();

        SuperMarket.addItem(10);
        SuperMarket.addItem(5);

        SuperMarket super_market = new SuperMarket();
        super_market.printBill();
    }
}