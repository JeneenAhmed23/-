public class Q2 {
    /*Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance variable balance has private visibility.
Why is the following implementation of the PredatoryCreditCard.charge method flawed? public boolean charge(double price) {
boolean isSuccess = super.charge(price);
if (!isSuccess)
super.charge(5); // the penalty
return isSuccess;
}
In either case, you*/
    /*litime  وهنا سيظهر عيب اخر في بعض المرات لن يضيف من متجاوزي القانون ال 5 دولار اذا كان balance  قريبه جدا من   */
}
