package solid.lsp_without;

class Client {
    
    public static void main(String[] args) {
        System.out.println("***A demo without LSP***\n");
        PaymentHelper helper = new PaymentHelper();
        
        RegisteredUserPayment robinPayment = new RegisteredUserPayment("Robin");
        RegisteredUserPayment jackPayment = new RegisteredUserPayment("Jack");
        
        helper.addUserPayment(robinPayment);
        helper.addUserPayment(jackPayment);
        
        helper.showPreviousPayments();
        helper.processNewPayments();
    }

}
