package ie.atu.examyear3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TodoResponse2 {
    @JsonProperty("productCodeID");
    private int productCodeID;
    @JsonProperty("productNameID");
    private int productNameID;
    @JsonProperty("categoryID");
    private int categoryID;
    @JsonProperty("quantityInStock");
    private int quantityInStock;
    @JsonProperty("price");
    private int price;
}
