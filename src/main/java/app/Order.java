package app;

public class Order implements Comparable<Order> {

    private String word;
    private int orderNumber;

    public Order() {
    }

    public Order(String word, int orderNumber) {
        this.word = word;
        this.orderNumber = orderNumber;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the orderNumber
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber the orderNumber to set
     */
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public int compareTo(Order ord) {
        if (this.getOrderNumber() == ord.getOrderNumber()) {
            return 0;
        }
        if (this.getOrderNumber() > ord.getOrderNumber()) {
            return 1;
        }
        return -1;

    }
}
