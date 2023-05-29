package solid.lsp;

public class Client {
    
    public static void main(String[] args) {
        System.out.println("*** A demo that follows the LSP. ***\n");
        
        PaymentHelper helper = new PaymentHelper();
        
        RegisteredUserPayment robin = new RegisteredUserPayment("Robin");
        RegisteredUserPayment jack = new RegisteredUserPayment("Jack");
        
        GuestUserPayment guestUser1 = new GuestUserPayment();
        
        helper.addPreviousPayment(robin);
        helper.addPreviousPayment(jack);
        
        helper.addNewPayment(robin);
        helper.addNewPayment(jack);
        helper.addNewPayment(guestUser1);
        
        helper.showPreviousPayments();
        helper.processNewPayments();
    }
}
