package book;

public class SaveMoney {
    public static void main(String args[]) {
        int amount=8000;
        ConstructionBank bank1=new ConstructionBank();
        bank1.saveMoney=amount;
        bank1.year=8.236;
        bank1.setInterestRate(0.035);
        double interest1=bank1.computerInterest();
        BankOfDalian bank2=new BankOfDalian();
        bank2.saveMoney=amount;
        bank2.year=8.236;
        bank2.setInterestRate(0.035);
        double interest2=bank2.computerInterest();
        BankOfShangye bank3=new BankOfShangye();
        bank3.saveMoney=amount;
        bank3.year=8.236;
        bank3.setInterestRate(0.035);
        double interest3=bank3.computerInterest();
        System.out.printf("两个银行利息相差%f元\n",interest2-interest1);
    }
}
