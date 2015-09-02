package springone2gx.flight

class BillForBookingService {

    ChargedBooking pay(Booking booking) {
        new ChargedBooking(booking, 'CONFIRMATION-1234')
    }
}