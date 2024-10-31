/**
 * Represents a single event with a unique ID, name, date, and optional
 * category.
 */
public class Event {
    /**
     * The unique identifier for this event.
     */
    private int id;
    /**
     * The name of this event.
     */
    private String name;
    /**
     * The date of this event.
     */
    private String date;
    /**
     * The optional category of this event.
     */
    private String category;

    /**
     * Constructs an Event without category.
     *
     * @param id
     *            the unique identifier for the event
     * @param name
     *            the name for the event
     * @param date
     *            the date for the event
     * @requires {@code name != null && date != null}
     * @ensures {@code this.id == id, && this.name == name && this.date == date}
     */
    public Event(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.category = null;
    }

    /**
     * Constructs an Event with a category.
     *
     * @param id
     *            the unique identifier for the event
     * @param name
     *            the name for the event
     * @param date
     *            the date for the event
     * @param category
     *            the category for the event
     * @requires {@code name != null && date != null && category != null}
     * @ensures {@code this.id == id, && this.name == name && this.date == date, this.category == category}
     */
    public Event(int id, String name, String date, String category) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.category = category;
    }

}
