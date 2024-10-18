import components.standard.Standard;

/**
 * Event Tracker kernel component with primary methods.
 */
public interface EventTrackerKernel extends Standard<EventTracker> {

    /**
     * Adds a specific event to the tracker.
     *
     * @param name
     *            the name of the event
     * @param date
     *            the date of the event
     * @updates this
     * @requires {@code name != null && date != null}
     * @ensures this contains the event {@code (name, date)}
     */
    void addEvent(String name, String date);

    /**
     * Adds a specific event to the tracker with a category.
     *
     * @param name
     *            the name of the event
     * @param date
     *            the date of the event
     * @param category
     *            the category of the event
     * @updates this
     * @requires {@code name != null && date != null && category != null}
     * @ensures this contains the event {@code (name, date, category)}
     */
    void addEvent(String name, String date, String category);

    /**
     * Removes a specific event from the tracker.
     *
     * @param name
     *            the name of the event
     * @updates this
     * @requires {@code name != null && date != null}
     * @ensures this no longer contains the event {@code (name, date)}
     */
    void deleteEvent(String name);

    /**
     * Applies a category to a prexisting event.
     *
     * @param eventID
     *            a unique ID for this event
     * @param category
     *            the category of the event
     * @updates this
     * @requires {@code eventID != null} and the given event exists
     * @ensures this contains the event {@code (name, date, category)}
     */
    void applyCategory(int eventID, String category);

    /**
     * Says whether a specific event with a given ID exists.
     *
     * @param eventID
     *            a unique ID for this event
     * @return true if an event with the given ID exists
     * @requires {@code eventID != null} and the given event exists
     * @ensures isEventPresent = (event with the given name exists)
     */
    boolean isEventPresent(int eventID);
}
