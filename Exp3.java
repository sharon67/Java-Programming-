
class SavingsAccount
{
    static float annualInterestRate;
    private float savingsBalance;
    public SavingsAccount(float annualInterestRate,float savingsBalance){
        this.annualInterestRate=annualInterestRate;
        this.savingsBalance=savingsBalance;
    }
    void setSavingsBalance(float savingsBalance){
        this.savingsBalance=savingsBalance;
    }
    float getSavingsBalance(){
        return savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double mint=(savingsBalance*annualInterestRate)/12;
        savingsBalance+=mint;
    }
    public static void modifyInterestRate(float annualInterestRate){
        annualInterestRate=annualInterestRate;
    }
}
public class Exp3 {
    public static void main(String args[]){
    	SavingsAccount saver1=new SavingsAccount(4.0f,2000.00f);
    	saver1.calculateMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());
        SavingsAccount saver2=new SavingsAccount(4.0f,3000.00f);
        saver2.calculateMonthlyInterest();
        System.out.println(saver2.getSavingsBalance());
        saver1.modifyInterestRate(5f);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(5f);
        saver2.calculateMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());
        System.out.println(saver2.getSavingsBalance());
    }
}


