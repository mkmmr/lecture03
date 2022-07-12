public class Main {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaypalProcessor();
        String paymentResult = paymentProcessor.makePayment(1000);
        System.out.println("支払い結果：" + paymentResult);

        PaymentProcessor paymentProcessor2 = new RaiseTechPayProcessor();
        String paymentResult2 = paymentProcessor2.makePayment(500);
        System.out.println("支払い結果：" + paymentResult2);

        PaymentProcessor paymentProcessor3 = new TestPaymentProcessor();
        String paymentResult3 = paymentProcessor3.makePayment(200);
        System.out.println("支払い結果：" + paymentResult3);

    }
}
