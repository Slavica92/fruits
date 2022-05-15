package mca.fruits.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/*[
  {
    "name": "Tomato",
    "domestic": true,
    "price": 30.5,
    "weight": 150,
    "description": "The species originated in western South America and Central America. The Nahuatl (the language used by the Aztecs) word tomatl gave rise to the Spanish word tomate, from which the English word tomato derived."
  },
  {
    "name": "Apple",
    "domestic": true,
    "price": 14.5,
    "description": "Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today."
  },
  {
    "name": "Banana",
    "domestic": false,
    "price": 22.0,
    "description": "A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, bananas used for cooking may be called plantains, distinguishing them from dessert bananas."
  }
]*/
public class Fruit {
    private String name;
    private Boolean domestic;
    private Double price;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double weight;
    private String description;

    public Fruit(String name, Boolean domestic, Double price, Double weight, String description) {
        this.name = name;
        this.domestic = domestic;
        this.price = price;
        this.weight = weight;
        this.description = description;
    }

    public Fruit(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDomestic() {
        return domestic;
    }

    public void setDomestic(Boolean domestic) {
        this.domestic = domestic;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Fruits  {" +
                "name='" + name + '\'' +
                ", domestic=" + domestic +
                ", price=" + price +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
