import components.map.Map;

/**
 * This class is mean to simulate a single event.
 */
public class EventTracker {

    /**
     * Map that stores all the events.
     */
    private Map<String, String> events;

    /**
     * No argument constructor.
     */
    public EventTracker() {
        this.events = new Map2L<>();
    }

    //Kernel methods
    /**
     * Adds a specific event to the events map.
     *
     * @param name
     *            the name of the event
     * @param date
     *            the date of the event
     */
    public void addEvent(String name, String date) {
        events.add(name, date);
    }

    /**
     * Removes a specific event from the events map.
     *
     * @param name
     *            the name of the event
     */
    public void deleteEvent(String name) {
        events.remove(name);
    }

    /**
     * Adds a category to an event.
     * @param name the name of the event
     * @param category the name of the category
     * @param date the date of the event
     */
    public void addCategory(String name, String date, String category) {
        if(events.hasKey(name)){
            //this will make a call to a function in the event class which holds all the details for a specific event
            addCategory(name, date, category)
        }
    }
}

public static void main(String[] args) {
    EventTracker calendar = new EventTracker();
    calender.addEvent("Meeting", "2024-10-02");
    calender.addCategory("Meeting", "2024-10-02", "Work");
    calender.addEvent("Pickleball sesh with da boys", "2024-10-03");
    calender.remove("Pickleball sesh with da boys");
}
