import java.time.LocalDateTime;

public class MachineFeatures {

    public ATM createATM(Location location, CurrencyComposition composition) {
        return new ATM("ASWER123", location, composition);
    }

    public void updateATMLocation(ATM atm, Location location) {
        atm.setLocation(location);
    }

    public void updateATMComposition(ATM atm, CurrencyComposition composition) {
        atm.setCurrencyComposition(composition);
    }

    public void seeComposition(CurrencyComposition composition) {
        System.out.println("ATM Composition is: ");
        System.out.println("_________________________________________");
        System.out.println("1. 500 notes: " + composition.getFiveHunderedNote());
        System.out.println("2. 200 notes: " + composition.getTwoHunderedNote());
        System.out.println("3. 100 notes: " + composition.getOneHunderedNote());
        System.out.println("4. 50 notes: " + composition.getFiftyNote());
        System.out.println("5. 10 notes: " + composition.getTenNote());
        System.out.println("____________________________________________");
    }

    public void checkUserBalance(User user) {
        System.out.println("Your balance is: " + user.getBalance());
    }

    public void withdraw (int amount, User user, ATM atm) {
        if (amount > user.getBalance()) {
            Transaction transaction = new Transaction(12334L, LocalDateTime.now(), amount, Verdict.FAILURE, TransactionType.FAILED, atm.getLocation());
            atm.getTransactions().add(transaction);
            System.out.println("In sufficient Funds");
            return;
        }

        if (amount > atm.getBalance()) {
            Transaction transaction = new Transaction(12335L, LocalDateTime.now(), amount, Verdict.OUT_OF_MONEY, TransactionType.FAILED, atm.getLocation());
            atm.getTransactions().add(transaction);
            System.out.println("Sorry! we are out of Funds");
            return;
        }

        Transaction transaction = new Transaction(12336L, LocalDateTime.now(), amount, Verdict.SUCESS, TransactionType.DEBIT, atm.getLocation());
        atm.getTransactions().add(transaction);

        updateCompositionNotes(atm, amount);
        System.out.println("Account is debited with " + amount);
        user.setBalance(user.getBalance() - amount);
        checkUserBalance(user);

    }

    private void updateCompositionNotes(ATM atm, int amount) {
        // 500, 200, 100, 50,10

        CurrencyComposition composition = atm.getCurrencyComposition();
        int fiveHunderedNotes = amount/500;
        if (composition.getFiveHunderedNote() >= fiveHunderedNotes) {
            amount = amount - fiveHunderedNotes*500;
            composition.setFiveHundredNotes(fiveHunderedNotes);
        }

        int twoHundredNotes =  amount/200;
        if (composition.getTwoHunderedNote() >= twoHundredNotes) {
            amount = amount - twoHundredNotes*200;
            composition.setTwoHundredNotes(twoHundredNotes);
        }

        int oneHundredNotes = amount/100;
        if (composition.getOneHunderedNote() >= oneHundredNotes) {
            amount = amount - oneHundredNotes*100;
            composition.setOneHundredNotes(oneHundredNotes);
        }

        int fiftyNotes = amount/50;
        if (composition.getFiftyNote() >= fiftyNotes) {
            amount = amount - fiftyNotes*50;
        }

        int tenNotes = amount/10;
        if (composition.getTenNote() >= tenNotes) {
            amount = amount - tenNotes*10;
            composition.setTenNotes(tenNotes);
        }

        updateATMComposition(atm, composition);
        seeComposition(composition);

    }

}
