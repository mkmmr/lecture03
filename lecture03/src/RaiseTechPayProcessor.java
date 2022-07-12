public class RaiseTechPayProcessor implements PaymentProcessor{
    @Override
    public String makePayment(int amountToPay) {
        return "RaiseTechPayの支払いプロセッサーで" + amountToPay + "円支払いました";
    }
}
