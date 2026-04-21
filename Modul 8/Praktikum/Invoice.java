package Praktikum;

public class Invoice implements Payable {
    public String ProductName;
    public Integer quantity;
    public Integer pricePeritem;

    public Invoice(String ProductName, Integer quantity, Integer pricePeritem){
        this.ProductName = ProductName;
        this.quantity = quantity;
        this.pricePeritem = pricePeritem;
    }
    @Override
    public int getPayableAmount() {
        return quantity * pricePeritem;
    }

    @Override
    public String toString() {
        return String.format("- %s (jumlah: %d) x Rp%,d = Rp%,d",
                ProductName, quantity, pricePeritem, getPayableAmount());
    }
}
