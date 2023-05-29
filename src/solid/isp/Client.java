package solid.isp;

public class Client {
    public static void main(String[] args) {
        System.out.println("***A demo that follows ISP***");
        
        Printer printer = new BasicPrinter();
        printer.printDocument();
        printer = new AdvancedPrinter();
        printer.printDocument();
        FaxDevice faxDevise = new AdvancedPrinter();
        faxDevise.sendFax();
    }
}
