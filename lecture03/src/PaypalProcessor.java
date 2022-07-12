public class PaypalProcessor implements PaymentProcessor{
    @Override
    public String makePayment(int amountToPay) {
        return "Paypalで" + amountToPay + "円支払いました。";
    }
}
