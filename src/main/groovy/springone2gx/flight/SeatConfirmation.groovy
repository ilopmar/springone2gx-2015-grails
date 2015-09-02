package springone2gx.flight

import groovy.transform.Canonical

@Canonical
class SeatConfirmation {
    ChargedBooking chargedBooking
    Seat seat
}
