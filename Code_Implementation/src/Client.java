public class Client implements Pay {
    private  int clientId;
    private  String clientName;
    private String clientAddress;
    private  PurchaseOrder purchaseOrder;

    //----------------------------------------------------------------

    public Client(){

    }


    public Client(int clientId, String clientName, String clientAddress , PurchaseOrder purchaseOrder) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.purchaseOrder=purchaseOrder;
    }

    //----------------------------------------------------------------


    public  int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public  PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @Override
    public void payTheInvoiceValue() {
        System.out.println("Invoice value is = " + purchaseOrder.getInvoiceValue());
    }

    //----------------------------------------------------------------


    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                '}';
    }

    //----------------------------------------------------------------
}
