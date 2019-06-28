package com.avisbudget.drools.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BookingData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Derived Channel")
	private java.lang.String derivedChannel;
	@org.kie.api.definition.type.Label("Derived Segment")
	private java.lang.String derivedSegment;
	@org.kie.api.definition.type.Label("Request Type")
	private java.lang.String requestType;
	@org.kie.api.definition.type.Label("Reservation Station Number")
	private int reservationStationNumber;
	@org.kie.api.definition.type.Label("Station Type Of Booking Location")
	private java.lang.String stationTypeOfBookingLocation;
	@org.kie.api.definition.type.Label("Booking Source")
	private java.lang.String bookingSource;
	@org.kie.api.definition.type.Label("Brand")
	private java.lang.String brand;
	@org.kie.api.definition.type.Label("Booking Location")
	private java.lang.String bookingLocation;
	@org.kie.api.definition.type.Label("Booking Location ID")
	private int bookingLocationId;
	@org.kie.api.definition.type.Label("Booking Station")
	private java.lang.String bookingStation;
	@org.kie.api.definition.type.Label("Booking Channel")
	private java.lang.String bookingChannel;
	@org.kie.api.definition.type.Label("Checkout Rate Category1")
	private int checkoutRateCategory1;
	@org.kie.api.definition.type.Label("Checkout Rate Category2")
	private int checkoutRateCategory2;
	@org.kie.api.definition.type.Label("Checkout Rate Category3")
	private int checkoutRateCategory3;
	@org.kie.api.definition.type.Label("Checkout Rate Category4")
	private int checkoutRateCategory4;
	@org.kie.api.definition.type.Label("check-In Rate Category1")
	private int checkinRateCategory1;
	@org.kie.api.definition.type.Label("Buildup AWD type")
	private java.lang.String buildupAWDtype;
	@org.kie.api.definition.type.Label("Inbound")
	private java.lang.String inbound;
	@org.kie.api.definition.type.Label("Checkout Divisions")
	private int checkoutDivisions;
	@org.kie.api.definition.type.Label("Buildup ST Code")
	private java.lang.String buildupStCode;
	@org.kie.api.definition.type.Label("Buildup Awd Number")
	private java.lang.String buildupAwdNumber;
	@org.kie.api.definition.type.Label("Length Of Rental")
	private double lengthOfRental;
	@org.kie.api.definition.type.Label("Checkout Date")
	private String checkoutDate;
	@org.kie.api.definition.type.Label("Checkin Date")
	private String checkinDate;
	@org.kie.api.definition.type.Label("Checkout Time")
	private String checkoutTime;
	@org.kie.api.definition.type.Label("Checkin Time")
	private String checkinTime;

	@org.kie.api.definition.type.Label("Entering Checkout Date")
	private String enteringCheckoutDate;

	@org.kie.api.definition.type.Label("Entering CheckIn Date")
	private String enteringCheckInDate;

	@org.kie.api.definition.type.Label("transactionIdentifierNumber")
	private java.lang.String transactionIdentifierNumber;

	@org.kie.api.definition.type.Label("Booking Date")
	private java.lang.String bookingDate;

	@org.kie.api.definition.type.Label("TRAC Amount")
	private double tRacAmount;

	public BookingData() {
	}

	public java.lang.String getDerivedChannel() {
		return this.derivedChannel;
	}

	public void setDerivedChannel(java.lang.String derivedChannel) {
		this.derivedChannel = derivedChannel;
	}

	public java.lang.String getDerivedSegment() {
		return this.derivedSegment;
	}

	public void setDerivedSegment(java.lang.String derivedSegment) {
		this.derivedSegment = derivedSegment;
	}

	public java.lang.String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(java.lang.String requestType) {
		this.requestType = requestType;
	}

	public int getReservationStationNumber() {
		return this.reservationStationNumber;
	}

	public void setReservationStationNumber(int reservationStationNumber) {
		this.reservationStationNumber = reservationStationNumber;
	}

	public java.lang.String getStationTypeOfBookingLocation() {
		return this.stationTypeOfBookingLocation;
	}

	public void setStationTypeOfBookingLocation(
			java.lang.String stationTypeOfBookingLocation) {
		this.stationTypeOfBookingLocation = stationTypeOfBookingLocation;
	}

	public java.lang.String getBookingSource() {
		return this.bookingSource;
	}

	public void setBookingSource(java.lang.String bookingSource) {
		this.bookingSource = bookingSource;
	}

	public java.lang.String getBrand() {
		return this.brand;
	}

	public void setBrand(java.lang.String brand) {
		this.brand = brand;
	}

	public java.lang.String getBookingLocation() {
		return this.bookingLocation;
	}

	public void setBookingLocation(java.lang.String bookingLocation) {
		this.bookingLocation = bookingLocation;
	}

	public int getBookingLocationId() {
		return this.bookingLocationId;
	}

	public void setBookingLocationId(int bookingLocationId) {
		this.bookingLocationId = bookingLocationId;
	}

	public java.lang.String getBookingStation() {
		return this.bookingStation;
	}

	public void setBookingStation(java.lang.String bookingStation) {
		this.bookingStation = bookingStation;
	}

	public java.lang.String getBookingChannel() {
		return this.bookingChannel;
	}

	public void setBookingChannel(java.lang.String bookingChannel) {
		this.bookingChannel = bookingChannel;
	}

	public int getCheckoutRateCategory1() {
		return this.checkoutRateCategory1;
	}

	public void setCheckoutRateCategory1(int checkoutRateCategory1) {
		this.checkoutRateCategory1 = checkoutRateCategory1;
	}

	public int getCheckoutRateCategory2() {
		return this.checkoutRateCategory2;
	}

	public void setCheckoutRateCategory2(int checkoutRateCategory2) {
		this.checkoutRateCategory2 = checkoutRateCategory2;
	}

	public int getCheckoutRateCategory3() {
		return this.checkoutRateCategory3;
	}

	public void setCheckoutRateCategory3(int checkoutRateCategory3) {
		this.checkoutRateCategory3 = checkoutRateCategory3;
	}

	public int getCheckoutRateCategory4() {
		return this.checkoutRateCategory4;
	}

	public void setCheckoutRateCategory4(int checkoutRateCategory4) {
		this.checkoutRateCategory4 = checkoutRateCategory4;
	}

	public int getCheckinRateCategory1() {
		return this.checkinRateCategory1;
	}

	public void setCheckinRateCategory1(int checkinRateCategory1) {
		this.checkinRateCategory1 = checkinRateCategory1;
	}

	public java.lang.String getBuildupAWDtype() {
		return this.buildupAWDtype;
	}

	public void setBuildupAWDtype(java.lang.String buildupAWDtype) {
		this.buildupAWDtype = buildupAWDtype;
	}

	public java.lang.String getInbound() {
		return this.inbound;
	}

	public void setInbound(java.lang.String inbound) {
		this.inbound = inbound;
	}

	public int getCheckoutDivisions() {
		return this.checkoutDivisions;
	}

	public void setCheckoutDivisions(int checkoutDivisions) {
		this.checkoutDivisions = checkoutDivisions;
	}

	public java.lang.String getBuildupStCode() {
		return this.buildupStCode;
	}

	public void setBuildupStCode(java.lang.String buildupStCode) {
		this.buildupStCode = buildupStCode;
	}

	public java.lang.String getBuildupAwdNumber() {
		return this.buildupAwdNumber;
	}

	public void setBuildupAwdNumber(java.lang.String buildupAwdNumber) {
		this.buildupAwdNumber = buildupAwdNumber;
	}

	public double getLengthOfRental() {
		return this.lengthOfRental;
	}

	public void setLengthOfRental(double lengthOfRental) {
		this.lengthOfRental = lengthOfRental;
	}

	public java.lang.String getTransactionIdentifierNumber() {
		return this.transactionIdentifierNumber;
	}

	public void setTransactionIdentifierNumber(
			java.lang.String transactionIdentifierNumber) {
		this.transactionIdentifierNumber = transactionIdentifierNumber;
	}

	public java.lang.String getBookingDate() {
		return this.bookingDate;
	}

	public void setBookingDate(java.lang.String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public java.lang.String getCheckoutDate() {
		return this.checkoutDate;
	}

	public void setCheckoutDate(java.lang.String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public java.lang.String getCheckinDate() {
		return this.checkinDate;
	}

	public void setCheckinDate(java.lang.String checkinDate) {
		this.checkinDate = checkinDate;
	}

	public java.lang.String getCheckoutTime() {
		return this.checkoutTime;
	}

	public void setCheckoutTime(java.lang.String checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

	public java.lang.String getCheckinTime() {
		return this.checkinTime;
	}

	public void setCheckinTime(java.lang.String checkinTime) {
		this.checkinTime = checkinTime;
	}

	public java.lang.String getEnteringCheckoutDate() {
		return this.enteringCheckoutDate;
	}

	public void setEnteringCheckoutDate(java.lang.String enteringCheckoutDate) {
		this.enteringCheckoutDate = enteringCheckoutDate;
	}

	public java.lang.String getEnteringCheckInDate() {
		return this.enteringCheckInDate;
	}

	public void setEnteringCheckInDate(java.lang.String enteringCheckInDate) {
		this.enteringCheckInDate = enteringCheckInDate;
	}

	public double gettRacAmount() {
		return this.tRacAmount;
	}

	public void settRacAmount(double tRacAmount) {
		this.tRacAmount = tRacAmount;
	}

	public BookingData(java.lang.String derivedChannel,
			java.lang.String derivedSegment, java.lang.String requestType,
			int reservationStationNumber,
			java.lang.String stationTypeOfBookingLocation,
			java.lang.String bookingSource, java.lang.String brand,
			java.lang.String bookingLocation, int bookingLocationId,
			java.lang.String bookingStation, java.lang.String bookingChannel,
			int checkoutRateCategory1, int checkoutRateCategory2,
			int checkoutRateCategory3, int checkoutRateCategory4,
			int checkinRateCategory1, java.lang.String buildupAWDtype,
			java.lang.String inbound, int checkoutDivisions,
			java.lang.String buildupStCode, java.lang.String buildupAwdNumber,
			double lengthOfRental, java.lang.String checkoutDate,
			java.lang.String checkinDate, java.lang.String checkoutTime,
			java.lang.String checkinTime,
			java.lang.String enteringCheckoutDate,
			java.lang.String enteringCheckInDate,
			java.lang.String transactionIdentifierNumber,
			java.lang.String bookingDate, double tRacAmount) {
		this.derivedChannel = derivedChannel;
		this.derivedSegment = derivedSegment;
		this.requestType = requestType;
		this.reservationStationNumber = reservationStationNumber;
		this.stationTypeOfBookingLocation = stationTypeOfBookingLocation;
		this.bookingSource = bookingSource;
		this.brand = brand;
		this.bookingLocation = bookingLocation;
		this.bookingLocationId = bookingLocationId;
		this.bookingStation = bookingStation;
		this.bookingChannel = bookingChannel;
		this.checkoutRateCategory1 = checkoutRateCategory1;
		this.checkoutRateCategory2 = checkoutRateCategory2;
		this.checkoutRateCategory3 = checkoutRateCategory3;
		this.checkoutRateCategory4 = checkoutRateCategory4;
		this.checkinRateCategory1 = checkinRateCategory1;
		this.buildupAWDtype = buildupAWDtype;
		this.inbound = inbound;
		this.checkoutDivisions = checkoutDivisions;
		this.buildupStCode = buildupStCode;
		this.buildupAwdNumber = buildupAwdNumber;
		this.lengthOfRental = lengthOfRental;
		this.checkoutDate = checkoutDate;
		this.checkinDate = checkinDate;
		this.checkoutTime = checkoutTime;
		this.checkinTime = checkinTime;
		this.enteringCheckoutDate = enteringCheckoutDate;
		this.enteringCheckInDate = enteringCheckInDate;
		this.transactionIdentifierNumber = transactionIdentifierNumber;
		this.bookingDate = bookingDate;
		this.tRacAmount = tRacAmount;
	}

}