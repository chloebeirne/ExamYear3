package ie.atu.examyear3;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class NotFoundResponse {
    private final AddProduct2 addProduct2;
    @Autowired
    public NotFoundResponse(AddProduct2 addProduct2){
        this.addProduct2 = addProduct2;
    }

    @PostMapping("/no-product")
    public String noProduct(@RequestBody AddProduct2 addProduct2){
        addProduct2.createProduct2(new TodoResponse2());
        return "No Product" + String; Object todoResponse;
    }

    @DeleteMapping("/delete")
    public String deleteProduct(@RequestBody AddProduct2 addProduct2){
        addProduct2.createProduct2(new TodoResponse2());
        return "No Product" + String; Object todoResponse;
}
