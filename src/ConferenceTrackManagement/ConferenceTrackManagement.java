package ConferenceTrackManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ConferenceTrackManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> events=new ArrayList<>();
        System.out.println("welcome to event management system");
        System.out.println("enter the no of events");
        int eventCount=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<eventCount;i++)
        {
            String event=sc.nextLine();
            events.add(event);
        }
        LogicalHandler logicalHandler=new LogicalHandler();
        logicalHandler.scheduleEvents(events);
        List<Track> filledTracks = logicalHandler.getFilledTracks();
       // List<Track> unfilledTracks = logicalHandler.getUnfilledTracks();
        int i=1;
//        System.out.println("filled");
        for(Track track : filledTracks){
            System.out.println("Track "+i);
            System.out.println(track+"\n");
            i++;
        }
//        System.out.println("unfilled");
        /*for (Track track : unfilledTracks){
            System.out.println("Track "+i);
            System.out.println(track+"\n");
            i++;
        }*/

    }
}
/*
writing fast test 60min
overloading in python 45min
lua for the masses 30min
ruby error version 45min
common ruby error 45min
rails for python developer 30min
communicating over distance 60min
accounting developement 45min
woah 30min
sit down and write 30min
pair vs noise 45min
rail magic 60min
ruby on rails 60min
clojure ate 45min
programming in boondocks 30min
ruby vs clojure 30min
ruby on rail legacy 60min
a world without hacker 30min
user interface CSS 30min
 */