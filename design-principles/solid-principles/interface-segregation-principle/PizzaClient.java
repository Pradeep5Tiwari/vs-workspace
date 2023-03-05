/* Since we are implementing 'PizzaApplication' interface we are forced to implement all methods though we don't 
 * need! So to avoid this we need to segregate the interface to the specific ones.
*/
//package solid-principles.interface-segregation-principle;

public class PizzaClient implements PizzaApplication {         // This is a BAD practice. Don't implement it.

    @Override
    public void orderPizzaOnline() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void orderPizzaByWalkin() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void orderPizzaByTelephone() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void acceptPaymentOnline() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void acceptPaymentByCash() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void acceptPaymentAtDeleivery() {
        // TODO Auto-generated method stub
        
    }
    
    
}
