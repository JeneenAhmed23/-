public class H_W2 {

    public static void main(String[] args) {
            /*Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance variable balance has private visibility. Why is the following implementation of the PredatoryCreditCard.charge method flawed?
public boolean charge(double price) {
boolean isSuccess = super.charge(price);
if (!isSuccess)
charge(5); // the penalty
return isSuccess;
}*/
        /*العيب انه سيدخل في دواره لا نهائيه والسبب ان كل مرة يعود الى نفس الداله والتلافي الخطأنستدعي دالة super.charge(5)*/
    }
}
