[condition][]There is a Booking=bookingData: BookingData()
[condition][]- Request Type of booking is "{requestType}"=requestType=="{requestType}"
#[condition][]- Request Type of booking is either "{requestType1}" or "{requestType2}" =requestType=="{requestType1}"||requestType=="{requestType2}" 
[condition][]- Request Type of booking is either {requestType} = requestType in ("{requestType}")

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

[condition][]- Length of rental is less than {number} days=lengthOfRental < {number}
[condition][]- AWD Type is equals to {AWD} = buildupAWDtype=="{AWD}"
[condition][]- AWD Type is equals to {AWD} || AWD Type is equals to null = buildupAWDtype=="{AWD}" || buildupAWDtype==null
[condition][]- AWD Type is either {categories} =buildupAWDtype in ({categories})

[condition][]- check-out is on  between {day1} anytime and {day2} {time1} =eval(verifyCheckOutDate(bookingData,"{day1}","{day2}","{time1}"))==true
[condition][]- check-in is on  between {day1} anytime and {day2} {time1} =eval(verifyCheckInDate(bookingData,"{day1}","{day2}","{time1}"))
[condition][]- Inbound dimension  is "{inbound}"=inbound=="{inbound}"
[condition][]- Checkin Rate Category 1 is either {categories} =checkinRateCategory1 in ({categories})
[condition][]- Checkout Rate Category is {number} or AWD Type is equals to {AWD}=(checkoutRateCategory1=={number}||checkoutRateCategory2=={number}||checkoutRateCategory3=={number}||checkoutRateCategory4=={number})||(buildupAWDtype=="{AWD}")
#[condition][]- Checkout Rate Category is {number}= (checkoutRateCategory1=={number}||checkoutRateCategory2=={number}||checkoutRateCategory3=={number}||checkoutRateCategory4=={number})

[condition][]- Distribution Channel is "{derivedChannel}"=derivedChannel=="{derivedChannel}"
[condition][]- Distribution Channel is either {derivedChannel} =derivedChannel in ({derivedChannel})

[condition][]- Divisions is {categories} =checkoutDivisions=={categories}
[condition][]- Divisions is either {categories} =checkoutDivisions in ({categories})
[condition][]- Divisions is not in either {categories} =checkoutDivisions not in ({categories})


[condition][]- AWD number is {number} =buildupAwdNumber in ({number})
[condition][]- Check AWD number is not {number} =buildupAwdNumber not in ({number})

[condition][]- TRAC Amount is greater than or equal to ${number} million=tRacAmount >= ({number}*1000000.0)
[condition][]- TRAC Amount is less than ${number} million=tRacAmount < ({number}*1000000.0)

[condition][]- STC code is beginning with {code} =eval(checkSTCode(bookingData,new String[] \{{code}\} ))

[consequence][bookingData] Set Derived Channel to "{derivedChannel}"=modify(bookingData) \{setDerivedChannel("{derivedChannel}")\} 
[consequence][bookingData] Set Derived Segment to "{derivedSegment}"=modify(bookingData) \{setDerivedSegment("{derivedSegment}")\} 
[consequence][]logRule=System.out.println("Priya - the rule that executed is: " + drools.getRule());