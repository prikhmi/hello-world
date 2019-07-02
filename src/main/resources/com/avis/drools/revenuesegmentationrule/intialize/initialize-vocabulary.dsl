[condition][]There is a Booking=bookingData: BookingData()
[condition][]- Request Type of booking is "{requestType}"=requestType=="{requestType}"
[condition][]- Request Type of booking is either "{requestType1}" or "{requestType2}" =requestType=="{requestType1}"||requestType=="{requestType2}" 
[consequence][bookingData] Set Derived Channel to "{derivedChannel}"=modify(bookingData) \{setDerivedChannel("{derivedChannel}")\} 
[consequence][bookingData] Set Derived Segment to "{derivedSegment}"=modify(bookingData) \{setDerivedSegment("{derivedSegment}")\} 
[consequence][]logRule=System.out.println("The rule that executed is: " + drools.getRule());