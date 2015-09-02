package springone2gx.flight

class EmailService {

    void sendEmailSeatConfirmation(SeatConfirmation seatConfirmation) {
        ChargedBooking chargedBooking = seatConfirmation.chargedBooking
        Booking booking = chargedBooking.booking
        String emailBody = "Your booking on flight ${booking.flightId} has been confirmed. " +
            "You have seat number ${seatConfirmation.seat.seatNumber}"

        def email = new Email(booking.customerEmail, emailBody)

        this.sendEmail(email)
    }

    private void sendEmail(Email email) {
        Thread.sleep(4000)
        println "Sending email -> ${email}"
    }
}
