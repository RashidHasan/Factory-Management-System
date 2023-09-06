import java.util.List;

public class PurchaseOrder {
    private int id;
    private static float invoiceValue;
    private Client client;
    private static List<Product> products;

    public PurchaseOrder(){

    }

    public PurchaseOrder(int id, Client client, List<Product> products) {
        float total = 0;

        for (int i = 0; i < products.size(); i++) {
            total+= products.get(i).getPrice();


        }



        this.id = id;
        this.client = client;
        this.products = products;
        this.invoiceValue=total;

    }

    public static float getInvoiceValue() {
        return invoiceValue;
    }

    public void setInvoiceValue(float invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public void addProducts(Product p4){
        products.add(p4);
        //To do
        //For loop
        float total = 0;

        for (int i = 0; i < products.size(); i++) {
            total+= products.get(i).getPrice();


        }

        invoiceValue=total;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", client=" + client +
                ", products=" + products +
                '}';
    }
}
