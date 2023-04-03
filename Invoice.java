public class Invoice {

        int id;
        // private int id;

        String description;
        // private String description;

        int quantity;
        // private int quantity;

        double unitPrice;
        // private double unitPrice;

        boolean paid = false;
        // private boolean paid;

        Invoice(int identification, String descr, int numOfProduct, double PricePerUnit, boolean paidThePrice){

            id = identification;

            description = descr;

            quantity = numOfProduct;

            unitPrice = PricePerUnit;

            paid = paidThePrice;
        }

        // public Invoice(int id, String description, int quantity, double unitPrice) {
        //     this.id = id;
        //     this.description = description;
        //     this.quantity = quantity;
        //     this.unitPrice = unitPrice;
        //     this.paid = false;
        // }


        //@Override
        public String toString() {
            return "InvoiceItem" +
                    "id=" + id +
                    ", description='" + description + '\'' +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    ", paid=" + paid;
        }

        public boolean getPaid() {
            return paid;
        }

        public void setUnitPrice(double unitPrice) {
            this.paid = paid;
        }

}
