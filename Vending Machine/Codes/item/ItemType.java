package item;

public enum ItemType {
    OREO("OREO"), // i = 0,8
    JUICE("JUICE"), // i =1,9
    COKE("COKE"), // i =2 
    SODA("SODA"), // i = 3
    CHIPS("CHIPS"), // i = 4
    CHOCOLATE("CHOCOLATE"), // i =5
    CANDY("CANDY"), // i =6
    GUM("GUM"); // i=7

    private final String type;
    ItemType (String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
