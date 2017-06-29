package singleton.q1;

/**
 * Created by yishengyang on 29/06/2017.
 */
public class TicketMaker {
    private static TicketMaker ourInstance = new TicketMaker();
    private int ticket = 1000;
    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
    public static TicketMaker getInstance() {
        return ourInstance;
    }
    private TicketMaker() {

    }
}
