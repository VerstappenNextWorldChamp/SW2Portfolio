import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.w3c.dom.events.Event;

/**
 * Implementation of the EventTracker component with secondary methods.
 */
public abstract class EventTrackerSecondary implements EventTracker {
    /**
     * Stores events by their unique IDs.
     */
    private final Map<Integer, Event> events;

    /**
     * Constructs an empty EventTracker
     */
    public EventTrackerSecondary() {
        this.events = new HashMap<>();
    }

    @Override
    public void addEvent(String name, String date) {
        int id = this.generateUniqueID();
        Event newEvent = new Event(id, name, date);
        this.events.put(id, newEvent);
    }

    @Override
    public void addEvent(String name, String date, String category) {
        int id = this.generateUniqueID();
        Event newEvent = new Event(id, name, date, category);
        this.events.put(id, newEvent);
    }

    @Override
    public void deleteEvent(String name) {
        List<Integer> keysToRemove = new ArrayList<>();
        for (Map.Entry<Integer, Event> entry : events.entrySet()) {
            Event currEvent = entry.getValue();
            if (currEvent.getName().equals(name)) {
                keysToRemove.add(currEvent.getId());
            }
        }
        for (Integer key : keysToRemove) {
            this.events.remove(key);
        }
    }

    @Override
    public void applyCategory(int eventID, String category) {
        if (this.events.containsKey(eventID)) {
            Event wantedEvent = this.events.get(eventID);
            wantedEvent.setCategory(category);
        }
    }

    @Override
    public boolean isEventPresent(int eventID) {
        return this.events.containsKey(eventID);
    }

    @Override
    public String getEventDetails(int eventID) {
        if (this.events.containsKey(eventID)) {
            return this.events.get(eventID).toString();
        }
        return "A event with the specified event ID does not exist.";
    }

    @Override
    public void editEventName(int eventID, String newName) {
        if (this.events.containsKey(eventID)) {
            this.events.get(eventID).setName(newName);
        }
    }

    @Override
    public void editEventDate(int eventID, String newDate) {
        if (this.events.containsKey(eventID)) {
            this.events.get(eventID).setDate(newDate);
        }
    }

    @Override
    public Map<String, String> filterByCategory(String category) {
        Map<String, String> filteredEvents = new HashMap<>();
        for (Map.Entry<Integer, Event> entry : events.entrySet()) {
            Event currEvent = entry.getValue();
            if (currEvent.getCategory().equals(category)) {
                String id = String.valueOf(currEvent.getId());
                String eventCategory = currEvent.getCategory();
                filteredEvents.put(id, eventCategory);
            }
        }
        return filteredEvents;
    }

    @Override
    public void removeEventsByCategory(String category) {
        List<Integer> keysToRemove = new ArrayList<>();
        for (Map.Entry<Integer, Event> entry : events.entrySet()) {
            Event currEvent = entry.getValue();
            if (currEvent.getCategory().equals(category)) {
                keysToRemove.add(currEvent.getId());
            }
        }

        for (Integer key : keysToRemove) {
            this.events.remove(key);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof EventTrackerSecondary)){
            return false;
        }
        else{
            return this.events.equals(obj.events)
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<Integer, Event> entry : events.entrySet()) {
            Event currEvent = entry.getValue();
            String currEventToString = currEvent.toString();
            result += ("\n" + currEventToString);
        }
        return result;
    }

    /**
     * Generates a unique ID for an event.
     *
     * @return a unique ID that is not already in the events map
     */
    private int generateUniqueID() {
        Random rand = new Random();
        int id = 0;
        do {
            id = rand.nextInt(Integer.MAX_VALUE);
        } while (this.events.containsKey(id));
        return id;
    }

}