package springone2gx.flight

class SeatAvailabilityService {

    SeatConfirmation confirmSeat(ChargedBooking chargedBooking) {
        Seat seat = new Seat('1A')
        new SeatConfirmation(chargedBooking, seat)
    }
}