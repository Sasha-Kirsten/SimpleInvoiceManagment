public class Q1Main {
    public static void main(String[] args) {

        Invoice myObj = new Invoice(101, "lion", 20, 6.9, true);

        Invoice myObj2 = new Invoice(321, "eagle", 69, 4.2, true);

        System.out.println(myObj.toString());

        System.out.println(myObj2.toString());




        

        // // Declare 2 new instances of Invoice
        // Invoice invoice1 = new Invoice(1, "Item 1", 5, 9.99);
        // Invoice invoice2 = new Invoice(2, "Item 2", 3, 19.99);

        // // Print out their contents using the toString method
        // System.out.println(invoice1.toString());
        // System.out.println(invoice2.toString());

        // // Set both invoices to paid
        // invoice1.setPaid(true);
        // invoice2.setPaid(true);

        // // Print out their updated contents using the toString method
        // System.out.println(invoice1.toString());
        // System.out.println(invoice2.toString());

    }
}
