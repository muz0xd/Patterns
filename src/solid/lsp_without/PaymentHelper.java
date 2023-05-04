package solid.lsp_without;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {
    
    List<Payment> payments = new ArrayList<>();
    
    public void addUserPayment (Payment userPayment) {
        payments.add(userPayment);
    }
    
    public void showPreviousPayments() {
        for (Payment payment : payments) {
            payment.previousPaymenntInfo();
            System.out.println("-------");
        }
    }
    
    public void processNewPayments() {
        for (Payment payment : payments) {
            payment.newPayment();
            System.out.println("-------");
        }
    }
}
