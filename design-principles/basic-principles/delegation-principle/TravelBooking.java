package DesignPrinciple;

public interface TravelBooking {

	// create one abstract method
	public void bookTicket();

}

// Next step is to create a class which will train ticket and then will create one more class which will live ticket.

class TrainTicket implements TravelBooking {

	// Now will override the methods

	@Override
	public void bookTicket() {

		System.out.println("Train ticket booked!");

	}
}

	// Now for the flight we will implements the same

	class FlightTicket implements TravelBooking {

		// Now will override the methods

		@Override
		public void bookTicket() {

			System.out.println("Flight ticket booked!");

		}

	}

	// Now the code is ready but we have not implemented delegation principle yet.
	// Now let's delegates this responsibility of booking the train ticket to
	// TicketBooking by agent by delegation.
	// So that in future if the booking logics need to be changed then it has to be
	// changed in class only.

	// We will create a class called TicketbookingByAgent which will also implements
	// TravelBooking because you also want to delegates
	// the responsibility of booking the tickets to this agent.

	class TicketBookingByAgent implements TravelBooking {

		TravelBooking t;

		public TicketBookingByAgent(TravelBooking t) {

			this.t = t;
		}

		@Override
		public void bookTicket() {

			t.bookTicket();
		}

	}

