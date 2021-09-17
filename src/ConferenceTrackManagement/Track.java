package ConferenceTrackManagement;
import java.util.ArrayList;
import java.util.List;
public class Track {
    private List<Event> morningSession=new ArrayList<>();
    private List<Event> afternoonSession=new ArrayList<>();
    private int morningTime=0;
    private int afternoonTime=240;

    public List<Event> getMorningSession() {
        return morningSession;
    }

    public List<Event> getAfternoonSession() {
        return afternoonSession;
    }

    public int getMorningTime() {
        return morningTime;
    }

    public int getAfternoonTime() {
        return afternoonTime;
    }

    public void setMorningTime(int morningTime) {
        this.morningTime = morningTime;
    }

    public void setAfternoonTime(int afternoonTime) {
        this.afternoonTime = afternoonTime;
    }

    @Override
    public String toString() {
        String out="";
        for(Event event :morningSession){
            out = out+ event.toString() +"\n";
        }
        out = out+"Lunch " +"12:00 PM\n";
        for (Event event : afternoonSession){
            out = out +event.toString() + "\n";
        }
//        out = out+afternoonTime+" ";
        if(afternoonTime<420){
            afternoonTime = 420;
        }
        out = out+"Networking Session "+((afternoonTime/60)-3)+":"+ (afternoonTime%60)+" PM";
        return out;
    }
}


