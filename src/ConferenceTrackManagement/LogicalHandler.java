package ConferenceTrackManagement;
import java.util.ArrayList;
import java.util.List;
public class LogicalHandler {
    private List<Track> filledTracks = new ArrayList<>();
    //private List<Track> unfilledTracks = new ArrayList<>();

    public List<Track> getFilledTracks() {
//        System.out.println(filledTracks);
        return filledTracks;
    }

    /*public List<Track> getUnfilledTracks() {
//        System.out.println(unfilledTracks);
        return unfilledTracks;
    }*/


    public void scheduleEvents(List<String> events)
    {
        List<Event> eventsList=new ArrayList<>();
        for (String name:events)
        {
            Event event=getEvent(name);
            eventsList.add(event);
        }
        createTrack(eventsList);
    }
    private static Event getEvent(String name)
    {
        String[] eventName=name.split(" ");
        int length=eventName.length;
        int duration=0;
        String time=eventName[length-1];
        if(time.equals("lightning"))
        {
            duration=5;
        }
        else
        { int i=0;
            while (time.charAt(i)!='m')
            {
                duration=(duration*10)+((int)time.charAt(i)-(int)'0');
                i++;
            }
        }
        Event event=new Event();
        event.setEventName(name);
        event.setDurationTime(duration);
        return event;
    }
    private void createTrack(List<Event> eventList)
    {
        Track track=new Track();
        List<Event> morningSessions=new ArrayList<>();
        List<Event> afternoonSessions=new ArrayList<>();
        for(Event event:eventList)
        {
            if(event.getDurationTime()>240)
            {
                continue;
            }
            /*if(checkUnfilledTracks(event)){
                continue;
            }*/
            if(event.getDurationTime() <= 240 && track.getMorningTime()+event.getDurationTime()>180 && track.getAfternoonTime() + event.getDurationTime()>480){
                //if(track.getMorningTime() >= 175 && track.getAfternoonTime() >= 475){
                    filledTracks.add(track);
               /* } else {
                    unfilledTracks.add(track);
                }*/
                track = new Track();
                morningSessions = track.getMorningSession();
                afternoonSessions = track.getAfternoonSession();
            }
            if(event.getDurationTime()+track.getMorningTime()<=180)
            {
                morningSessions.add(event);
                event.setTime(track.getMorningTime());
                track.setMorningTime(track.getMorningTime()+event.getDurationTime());
            }
            else{
                afternoonSessions.add(event);
                event.setTime(track.getAfternoonTime());
                track.setAfternoonTime(track.getAfternoonTime()+event.getDurationTime() );
            }
        }
        //unfilledTracks.add(track);
    }
   /* private boolean checkUnfilledTracks(Event event){
        int duration  = event.getDurationTime();
        for(Track unfilledTrack : unfilledTracks){
            if(unfilledTrack.getMorningTime()+duration <=180){
                List<Event> morningSessions = unfilledTrack.getMorningSession();
                morningSessions.add(event);
                event.setTime(unfilledTrack.getMorningTime());
                unfilledTrack.setMorningTime(unfilledTrack.getMorningTime()+duration);
                return true;
            } else if(unfilledTrack.getAfternoonTime()+duration <=480){
                List<Event> afternoonSessions = unfilledTrack.getAfternoonSession();
                afternoonSessions.add(event);
                event.setTime(unfilledTrack.getAfternoonTime());
                unfilledTrack.setAfternoonTime(unfilledTrack.getAfternoonTime()+duration);
                return true;
            }
        }
        return false;
    }*/
}
