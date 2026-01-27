package ca.tetervak.flowerdata.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Flower {

    @Id
    private String id = "";

    private String label = "";
    private BigDecimal price = BigDecimal.valueOf(0.0);
    private String description = "";

    @OneToOne(cascade = CascadeType.ALL)
    private Picture picture = null;

    private String wiki = "";

    public Flower() {
    }

    public Flower(
            String id,
            String label,
            double price,
            String description,
            Picture picture,
            String wiki
    ) {
        this.id = id;
        this.label = label;
        this.price = BigDecimal.valueOf(price);
        this.description = description;
        this.picture = picture;
        this.wiki = wiki;
    }

    public double getPrice() {
        return price.doubleValue();
    }

    public void setPrice(Double price) {
        this.price = BigDecimal.valueOf(price);
    }
}
