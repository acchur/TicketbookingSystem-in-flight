package reservationsystem;

public class Flight {
    private String flightNo;
    private String airLine;
    private int capacity;
    private int bookedSeat;

    public Flight(String flightNo,String airLine,int capacity,int bookedSeat){
        this.flightNo=flightNo;
        this.airLine=airLine;
        this.capacity=capacity;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getAirLine() {
        return airLine;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }
    public String getFlightDetails(){

       return System.out.println("Flight Number "+flightNo+"Air Line "+airLine+"Capacity of the flight "+capacity+"Number of seat booked " +bookedSeat)

    }
    public void incrementBookingConuter(){
           int sum = 0;
           sum=sum+bookedSeat;
    }
    public boolean checkAvalability(){
        return boolean avalability=true;
    }

}

