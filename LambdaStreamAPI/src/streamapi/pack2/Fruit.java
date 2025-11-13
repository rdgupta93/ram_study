package streamapi.pack2;

public class Fruit {
  String fruitName;
  String colour;

    public Fruit(String fruitName, String colour) {
        this.fruitName = fruitName;
        this.colour = colour;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

