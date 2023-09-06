import java.util.List;

public class Factory implements Pay {
    private String name;
    private String address;
    private static float invoiceValue;
    private List<Product> products1;
    private List<Employee> employees;

    //----------------------------------------------------------------

    public Factory(String name, String address, List<Product> products1, List<Employee> employees) {

        float calaulate = 0;
        for (int i = 0; i < products1.size(); i++) {
            calaulate += products1.get(i).getPrice();


        }
        this.name = name;
        this.address = address;
        this.products1 = products1;
        this.employees = employees;
        this.invoiceValue=calaulate;


    }


    //----------------------------------------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static float getInvoiceValue() {
        return invoiceValue;
    }

    public void setInvoiceValue(float invoiceValue) {
        this.invoiceValue = invoiceValue;
    }


    public List<Product> getProducts() {
        return products1;
    }

    public void setProducts(List<Product> products) {
        this.products1 = products;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void payTheInvoiceValue() {
        System.out.println("Invoice value is = " + getInvoiceValue());
    }

    //----------------------------------------------------------------


    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", invoiceValue=" + invoiceValue +
                ", products=" + products1 +
                ", employees=" + employees +
                '}';
    }


    //----------------------------------------------------------------
}
