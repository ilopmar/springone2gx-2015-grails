package springone2gx.flight

class FlightService {

    EmailService emailService

    void bookAFlight(Booking booking) {
        // Charge the booking and get the confirmation number
        def chargedBooking = new ChargedBooking(booking, 'CONFIRMATION-1234')

        // Assign a seat
        Seat seat = new Seat('1A')
        def seatConfirmation = new SeatConfirmation(chargedBooking, seat)

        // Send email
        emailService.sendEmailSeatConfirmation(seatConfirmation)
    }
}
