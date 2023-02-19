public class StaticMethodImpl implements StaticMethod {

    public static void main(String[] args) {
        
        /* StaticMethodImpl staticMethodImpl = new StaticMethodImpl();
        staticMethodImpl.staticMethod();  */   // It would throw error since its only accessible with interface name.
        StaticMethod.staticMethod();
    }
    
}
