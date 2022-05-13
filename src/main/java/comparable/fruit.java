package comparable;

public class fruit implements Comparable<fruit> {
    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public fruit(String fruitname, String fruitDesc, int quantity) {
        this.fruitName = fruitname;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int compareTo(fruit compareFruit) {
        int compareQuantity = ((fruit) compareFruit).getQuantity();

        return this.quantity - compareQuantity;
    }
}
