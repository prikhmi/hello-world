[condition][]There is a Booking=bookingData: BookingData()
[condition][]- Request Type of booking is "{requestType}"=requestType=="{requestType}"
[condition][]- Request Type of booking is either "{requestType1}" or "{requestType2}" =requestType=="{requestType1}"||requestType=="{requestType2}" 
[condition][]- Reservation Station Number of booking is {number}=reservationStationNumber=={number}
[condition][]- Station Type of booking location is "{stationTypeOfBookingLocation}"=stationTypeOfBookingLocation=="{stationTypeOfBookingLocation}"
[condition][]- Station Type of booking location is in between "{stationTypeOfBookingLocation}"= stationTypeOfBookingLocation in ("{stationTypeOfBookingLocation}")
[condition][]- Booking Source is "{bookingSource}"=bookingSource=="{bookingSource}"
[condition][]- Booking Location is "{bookingLocation}"=bookingLocation=="{bookingLocation}"
[condition][]- Booking Date is {bookingDate}=bookingDate=={bookingDate}
#[condition][]- Booking Date is before {bookingDt:DATE:default}=bookingData(bookingDate> "{bookingDate}")
[condition][]- It is true that Booking Date is before {bookingDt}=bookingData: BookingData (eval(beforeDateFunction(bookingData,"{bookingDt}")
[condition][]- Brand is "{brand}"=brand=="{brand}"
[condition][]- Booking location ID is not {number}=bookingLocationId!={number}
[condition][]- Booking Channel is not "{bookingChannel}"=bookingChannel!="{bookingChannel}"
[consequence][bookingData] Set Derived Channel to "{derivedChannel}"=modify(bookingData) \{setDerivedChannel("{derivedChannel}")\} 
[consequence][bookingData] Set Derived Segment to "{derivedSegment}"=modify(bookingData) \{setDerivedSegment("{derivedSegment}")\} 
[consequence][]logRule=System.out.println("The rule that executed is: " + drools.getRule());