package springone2gx.flight

class FlightController {

    FlightService flightService

    def initialVersion() {
        def booking = new Booking('ABC1234', 'john.doe@example.com')
        flightService.bookAFlight(booking)

        render 'Thank you very much for your purchase! An email has sent with booking information'
    }
}
