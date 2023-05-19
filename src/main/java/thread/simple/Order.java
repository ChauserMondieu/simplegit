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

    class Builder{
        private Integer ID;
        private String message;

        public void setID(int id){
            this.ID = id;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Order build(){
            Order order = new Order();
            order.ID = this.ID;
            order.message = this.message;
            System.out.println("construction is done...");
            return order;
        }
    }
}
