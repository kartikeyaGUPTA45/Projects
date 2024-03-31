import coin.Coin;
import item.*;
import vendingmachine.*;

public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("Fill the inventory");
        fillInventory(vendingMachine);

        System.out.println("Display the Inventory");
        displayInventory(vendingMachine);

        VendingMachineState vendingMachineState = vendingMachine.getVendingMachineState();

        vendingMachineState.insertCoin(vendingMachine, Coin.FIFTY);
        vendingMachineState.insertCoin(vendingMachine,Coin.TWENTY);
        // TODO: if coin other than the enum, return message -> "Invalid coin"
        // TODO: Other than 1 quantity of an item
    

        vendingMachineState.chooseProduct(vendingMachine, 102);

        displayInventory(vendingMachine);

    }


    private static void fillInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelfSlots = vendingMachine.getInventory().getInventory();
        for(int i=0;i<itemShelfSlots.length;i++) {
            Item item = new Item();
            if (i == 0 || i == 8) {
                item.setItemType(ItemType.OREO);
                item.setPrice(30);
            } else if (i == 1 || i == 9) {
                item.setItemType(ItemType.JUICE);
                item.setPrice(40);
            } else if (i == 2) {
                item.setItemType(ItemType.COKE);
                item.setPrice(45); 
            } else if (i == 3) {
                item.setItemType(ItemType.SODA);
                item.setPrice(20); 
            } else if (i == 4) {
                item.setItemType(ItemType.CHIPS);
                item.setPrice(20); 
            } else if (i == 5) {
                item.setItemType(ItemType.CHOCOLATE);
                item.setPrice(60); 
            } else if (i == 6) {
                item.setItemType(ItemType.CANDY);
                item.setPrice(5); 
            } else if (i == 7) {
                item.setItemType(ItemType.GUM);
                item.setPrice(5); 
            }
            itemShelfSlots[i].setItem(item);
            itemShelfSlots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelfSlots = vendingMachine.getInventory().getInventory();
        for(ItemShelf shelf: itemShelfSlots) {
            System.out.println("Item Code: " + shelf.getItemCode() + " Item: " + shelf.getItem().getType() +" Price: " + shelf.getItem().getPrice() + 
            " isAvailable:" + !shelf.isSoldOut());
        }
    }        
}
