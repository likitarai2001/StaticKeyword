public class SuperMarket {
    static String name;
    static int no_of_items = 0;
    static int sum = 0;

    static {
        name = "Star Bazaar";
    }

    static class Item{
        public void displayItems(){
            System.out.println("Item\t|\tPrice");
            System.out.println("Pen\t\t|\tRs. 10");
            System.out.println("Eraser\t|\tRs. 5");
        }
    }

    static void addItem(int price){
        no_of_items++;
        sum += price;
    }

    void printBill(){
        System.out.println("\nTotal Items: " + no_of_items);
        System.out.println("Total price: " + sum);
    }
}
