import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        List<Product> products1= new ArrayList<>();
        Product p2 = new Product(122,"Toy", (float) 20.2);
        Product p3 = new Product(122,"Toy", (float) 20.2);
        Product p4 = new Product(122,"Toy", (float) 20.2);
        Product p5 = new Product(122,"Toy", (float) 20.2);
        Product p6 = new Product(122,"Toy", (float) 20.2);
        Product p7 = new Product(122,"Toy", (float) 20.2);
        products.add(p2);
        products.add(p3);
       // products.add(p4);
        products1.add(p2);
        products1.add(p3);
        products1.add(p4);
        products1.add(p5);
        products1.add(p6);
        products1.add(p7);




        List<Employee> e1 = new ArrayList<>();


        Factory f1 = new Factory("XRD","Amman",products1,e1);

        f1.payTheInvoiceValue();

        System.out.println("------------------------------------------------------------");

        Worker w1 =new Worker("Observer","os@gmail.com", (float) 450.3,77263263,"Factory","Morning",true);
        w1.getEmployeeSalary();
        Manager m1 = new Manager("Rashed","rq@gmail.com", 650.20f,76215161,"IT",2,"XRD Projects");
        m1.getEmployeeSalary();
        Accountant a1 = new Accountant("Nasser","Nh@gmail.com", (float) 570.55,79367222);
        a1.getEmployeeSalary();

        System.out.println("------------------------------------------------------------");

        PurchaseOrder po = new PurchaseOrder(344,new Client(131,"Omar","Amman",new PurchaseOrder()),products);
        System.out.println(po);
        po.addProducts(p4);


        Client c1 = new Client(234,"Zaid","Amman",new PurchaseOrder());
        c1.payTheInvoiceValue();





    }
}
