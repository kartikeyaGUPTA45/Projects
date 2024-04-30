public class User {
    private String userName;
    private int pin;
    private String accountNumber;
    private int cvv;
    private double balance;
    private int monthOfExpiry;
    private int yearOfExpiry;

    public User(String userName, int pin, String accountNumber, int cvv, double balance, int monthOfExpiry, int yearOfExpiry) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.cvv = cvv;
        this.monthOfExpiry = monthOfExpiry;
        this.pin = pin;
        this.userName = userName;
        this.yearOfExpiry = yearOfExpiry;
    }


    public String getUserName() {
        return this.userName;
    }

    public int getPin() {
        return this.pin;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getCvv() {
        return this.cvv;
    }

    public int getMonthOfExpiry() {
        return this.monthOfExpiry;
    }

    public int getYearOfExpiry() {
        return this.yearOfExpiry;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPin(int pin) {
         this.pin = pin;
    }

    public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
    }

    public void setCvv(int cvv) {
         this.cvv = cvv;
    }

    public void setMonthOfExpiry(int monthOfExpiry) {
         this.monthOfExpiry = monthOfExpiry;
    }

    public void setYearOfExpiry(int yearOfExpiry) {
         this.yearOfExpiry = yearOfExpiry;
    }

    public void setBalance(double balance) {
         this.balance = balance;
    }

}
