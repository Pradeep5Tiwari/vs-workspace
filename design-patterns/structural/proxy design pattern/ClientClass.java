public class ClientClass {
    public static void main(String[] args) {
        Subject proxy = new ProxyClass(); // Here reference is of Subject interface and memory is given for Proxy class
        proxy.myMethod();                // not the real class - SubjectImplementation.
                                        // Here at runtime the call go to the proxy class method and checks
                          // authentication and if it's authenticated then only it will call the Real
                          // SubjectImplementation class method - e.g super.myMethod();
    }
}
