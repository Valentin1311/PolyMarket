package Core;

public class Ticket {

    private int id;
    private String title;
    private String body;
    private int categoryId;
    private int userId;
    private boolean isAnswered;


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Ticket))
            return false;
        Ticket t2 = (Ticket) obj;
        if (this.id != t2.id || !this.title.equals(t2.title) || !this.body.equals(t2.body)
                || this.categoryId != t2.categoryId || this.userId != t2.userId || this.isAnswered != t2.isAnswered)
            return false;
        return true;
    }

    /**
     * Constructor of Ticket when id is know (received from DB)
     * @param id
     * @param title
     * @param body
     * @param categoryId
     * @param userId
     * @param isAnswered
     */
    public Ticket(int id, String title, String body, int categoryId, int userId, boolean isAnswered) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.categoryId = categoryId;
        this.userId = userId;
        this.isAnswered = isAnswered;
    }

    public Ticket(String title, String body, int categoryId, int userId, boolean isAnswered) {
        this.title = title;
        this.body = body;
        this.categoryId = categoryId;
        this.userId = userId;
        this.isAnswered = isAnswered;
    }

    /**
     * Getter of id
     * @return ticket's id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Getter of title
     * @return ticket's title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Getter of body
     * @return ticket's body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Getter of category
     * @return ticket's categoryId
     */
    public int getCategory() {
        return this.categoryId;
    }

    /**
     * Getter of userId
     * @return ticket's userId
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * Getter of status
     * @return ticket's status
     */
    public boolean getIsAnswered() {
        return this.isAnswered;
    }

    /**
     * Setter of status
     * @param isAnswered
     */
    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }
}
