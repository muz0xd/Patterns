package chain_of_responsibility;

class EmailErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handleMessage(Message message) {
        if(message.text.contains("email")) {
            if(message.text.contains("fax")) {
                System.out.println("-EmailErrorHandler fixed the email issue: " + message.text);
                System.out.println("-- Now FaxErrorHandler needs to cross verify it.");
                if(nextHandler != null) {
                    nextHandler.handleMessage(message);
                }
            }
            else {
                System.out.println("EmailErrorHandler processed the issue: " + message.text);
            }
        }
        else {
            if(nextHandler != null) {
                nextHandler.handleMessage(message);
            }
        }
    }

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
