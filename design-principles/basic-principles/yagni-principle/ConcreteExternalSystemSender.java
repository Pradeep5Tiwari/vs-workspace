/* PART 2: This can be dangerous from two perspectives. First, you write unnecessary code and also make assumptions about further
destination systems. So you may require a huge refactor even if other destinations finally come to life.

"Never introduce an interface or abstract class for only one implementation. Create an abstraction only when you actually
need it." */

public class ConcreteExternalSystemSender extends ExternalSystemSender {
    @Override
    protected Records prepareDataToSend() {
        return new Records();
    }
}

