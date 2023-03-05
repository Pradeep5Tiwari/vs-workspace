//package designprinciple.basicprinciple.delegationprinciple;

public class DelegationDemonstration {

	public static void main(String[] args) {

		TicketBookingByAgent agent = new TicketBookingByAgent(new FlightTicket());
		agent.bookTicket();

	}

}
