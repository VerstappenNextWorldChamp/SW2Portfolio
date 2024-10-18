import components.map.Map;

/**
 * Event Tracker component with secondary methods.
 */
public interface EventTracker extends EventTrackerKernel {

    /**
     * Gets all the details of a given event.
     *
     * @param eventID
     *            a unique ID for this event
     * @return the date, name, and if applicable category of event as a string
     * @requires {@code eventID != null} and event with given ID exists
     * @ensures getEventDetails = the details of the event with the given ID
     */
    String getEventDetails(int eventID);

    /**
     * Updates the name of a given event.
     *
     * @param eventID
     *            a unique ID for this event
     * @param newName
     *            the new name for the event
     * @updates the name of the event with the given ID
     * @requires {@code eventID != null && newName != null} and event with given
     *           ID exists
     * @ensures getEventDetails = the event with the given ID has the new name
     */
    void editEventName(int eventID, String newName);

    /**
     * Updates the date of a given event.
     *
     * @param eventID
     *            a unique ID for this event
     * @param newDate
     *            the new date for the event
     * @updates the date of the event with the given ID
     * @requires {@code eventID != null && newDate != null} and event with given
     *           ID exists
     * @ensures getEventDetails = the event with the given ID has the new date
     */
    void editEventDate(int eventID, String newDate);

    /**
     * Returns a map of events with a specific category.
     *
     * @param category
     *            a category to filter events by
     * @return a map of events that have the specific category
     * @ensures filterByCategory = map of all events with the specific category
     */
    Map<String, String> filterByCategory(String category);

    /**
     * Removes all events with a specific category.
     *
     * @param category
     *            a category to remove events by
     * @updates this
     * @ensures all events with the given category are removed
     */
    void removeEventsByCategory(String category);
}
