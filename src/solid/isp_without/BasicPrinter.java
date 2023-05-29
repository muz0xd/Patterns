package solid.isp_without;

class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Basic printer prints a document.");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }

}
