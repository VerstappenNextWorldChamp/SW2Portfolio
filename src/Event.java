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
        this.category = "This event does not have a category.";
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

    /**
     * Returns the id of this event.
     *
     * @return the event id
     * @ensures getId = this.id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Returns the name of this event.
     *
     * @return the event name
     * @ensures getId = this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Edits the name of this event.
     *
     * @param name
     *            the new name for the event
     * @requires {@code name != null}
     * @ensures this.name = name
     */
    public void setName(String name) {
        this.name = name
    }

    /**
     * Returns the date of this event.
     *
     * @return the event date
     * @ensures getId = this.date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Edits the date of this event.
     *
     * @param date
     *            the new date for the event
     * @requires {@code date != null}
     * @ensures this.date = date
     */
    public void setDate(String date) {
        this.date = date
    }

    /**
     * Returns the category of this event if it exists.
     *
     * @return the event category
     * @ensures getCategory = this.category
     */
    public String getCategory)
    {
        return category;
    }

    /**
     * Edits the category of this event.
     *
     * @param category
     *            the new category for the event
     * @requires {@code category != null}
     * @ensures this.category = category
     */
    public void setCategory(String category) {
        this.category = category
    }

    /**
     * Returns a string representation of this event's details
     *
     * @return a string with the event ID, name, date, and category(if
     *         applicable)
     * @ensures toString = "[ID=" + this.id + ", Name=" + this.name + ", Date="
     *          + this.date + (if category != null then ", Category=" +
     *          this.category)]
     */
    @Override
    public String toString() {
        return "Event ID: " + this.id + "\nName: " + this.name + "\nDate: "
                + this.date + "\nCategory: " + this.category;
    }

}
