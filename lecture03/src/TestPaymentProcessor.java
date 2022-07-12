public class TestPaymentProcessor implements PaymentProcessor{
    @Override
    public String makePayment(int amountToPay) {
        return "テスト用の支払いプロセッサーで" + amountToPay + "円支払いました";
    }
}
