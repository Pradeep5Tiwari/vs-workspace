/* Below we have an interface called 'PizzaApplication' which have alot of service requirment interface methods and all of 
 * the order service and payment service is define within this same one interface.
 * Now If I am having a client called 'PizzaClient; class which want to order pizza but while ordering pizza the client has 
 * choice to order only via online mode and payment can be done only in online mode. Then what about other moder of 
 * of ordering pizzza and payment? I am forced to implement all of the methods of ordering pizza and payment. 
  */

//package solid-principles.interface-segregation-principle;

public interface PizzaApplication {

    // Service requirement for ordering pizza 
    public void orderPizzaOnline();
    public void orderPizzaByWalkin();
    public void orderPizzaByTelephone();

    // Service requirement for payment system
    public void acceptPaymentOnline();
    public void acceptPaymentByCash();
    public void acceptPaymentAtDeleivery();
}

