public class AbstractionMain {
    public static void main(String[] args) {
        Bank bank1 = new HdfcBank();
        Bank bank2 = new IciciBank();
        Bank Bank3 = new CanaraBank();
        bank1.getBankName();
        bank1.displayDenominations();
        bank2.getBankName();
        bank2.displayDenominations();
        bank2.getBankName();
        bank2.displayDenominations();
    }
}
