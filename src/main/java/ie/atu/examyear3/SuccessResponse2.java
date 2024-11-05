package ie.atu.examyear3;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class SuccessResponse2 {
    private final AddProduct2 addProduct2;
    @Autowired
    public SuccessResponse2(AddProduct2 addProduct2){
        this.addProduct2 = addProduct2;
    }

    @PostMapping("/confirm-add")
    public String confirmAdd(@RequestBody AddProduct2 addProduct2){
        addProduct2.createProduct2(new TodoResponse2());
        return "Add" + String; Object todoResponse;
    }

    @GetMapping("/get-add")
    public List<TodoResponse2>todoResponse2(){
        return addProduct2.getAddById();
    }
}
