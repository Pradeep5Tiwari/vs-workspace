/* PART 1: Let's say that we have to implement a functionality to send some data to an external destination. For now, it 
is just one destination. Usually, good developers will think that additional destinations will eventually be the case for 
the application, so it's worth introducing some kind of abstraction. Let's take a look at following pieces of code: */

public abstract class ExternalSystemSender {
    public void send() {
        Records toSend = prepareDataToSend();
        commonMethodToSend(toSend);
    }

    private void commonMethodToSend(Records data) {
        //Sending logic
    }

    protected abstract Records prepareDataToSend();
}
