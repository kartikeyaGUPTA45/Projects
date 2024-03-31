package item;

public class ItemShelf {
// Item-> ItemType, price, code, soldOut
    private int itemCode;
    private Item item;
    private boolean soldOut;
    private int quantity;

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public boolean isSoldOut() {
        return this.soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
