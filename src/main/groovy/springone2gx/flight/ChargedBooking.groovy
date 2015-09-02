package springone2gx.flight

import groovy.transform.Canonical

@Canonical
class ChargedBooking {
    Booking booking
    String confirmationNumber
}
