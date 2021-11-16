package project.maxwell.familymap;

import Model.*;
import android.provider.Settings;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataCache {
    private static DataCache instance = new DataCache();
    public static DataCache getInstance(){
        return instance;
    }
    private DataCache(){

    }
    Map<String, Person> people;
    Map<String, Event> events;
    Map<String, List<Event>> personEvents;
    Set<String> paternalAncestors;
    Set<String> maternalAncestors;

    Settings settings;

    Person getPersonByID(String personID){
        return null;
    }
    Event getEventByID(String eventID){
        return null;
    }
    List<Event> getPersonEvents(String personID){
        return null;
    }
}
