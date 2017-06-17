package solution4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bus{
	
	    

    private final int[] seats = new int[100];
    private int noSeat = 0;
	private String passengerName;

    public void bookSeat() throws Exception{
        if(noSeat<seats.length){
       
        noSeat++;
        System.out.print("Seat number " +noSeat+ " booked");
        }else{
            System.out.println("The bus is full sorry");
        }
        }
    public class Passenger extends Thread{

        Bus bus1;
        String passengerName1;

        public Passenger(Bus bus, String passengerName){
            this.bus1=bus;
            this.passengerName1=passengerName1;
        }

        public void go(){
            synchronized(bus1){
                try {
                    bus1.bookSeat();
                    Thread.sleep(200);
                } catch (Exception ec) {
                    Logger.getLogger(Passenger.class.getName()).log(Level.SEVERE, null, ec);
                }
                System.out.println( passengerName);

            }
        }


    }
    public String getPassengerName() {
        return getPassengerName();
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
   
}


