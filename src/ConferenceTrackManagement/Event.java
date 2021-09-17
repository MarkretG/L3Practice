package ConferenceTrackManagement;
public class Event {
    private String eventName;
    private  int durationTime;
    private int time;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        String out="";
        out = out+eventName+"  ";
        int startTime = 9+(time/60);
        if(startTime>12){
            startTime = startTime-12;
            out = out+startTime+":"+(time%60)+" PM";
        } else {
            out = out + startTime + ":" + (time % 60)+" AM";
        }
        return out;
    }
}

