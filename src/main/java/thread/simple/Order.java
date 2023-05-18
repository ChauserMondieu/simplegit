package thread.simple;

public class Order {
    private Integer ID;
    private String message;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Order(String message) {
        this.message = message;
    }
}
