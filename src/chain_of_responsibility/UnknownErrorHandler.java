package chain_of_responsibility;

class UnknownErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handleMessage(Message message) {
        if(!(message.text.contains("fax")|| message.text.contains("email"))) {
            System.out.println("An unknown error ocurs. Consult expert immediately.");
        }
        else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
