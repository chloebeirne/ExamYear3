package ie.atu.examyear3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddProduct2 {
    private List<AddProduct2>addProduct2 = new ArrayList<>();
    public void createProduct2(TodoResponse2 todoResponse2){
        addProduct2.add(todoResponse2);
        System.out.println("Product Code" + todoResponse2.getProductCodeID());
        System.out.println("Product Name" + todoResponse2.getProductNameID());
        System.out.println("Category" + todoResponse2.getCategoryID());
        System.out.println("Quantity in Stock" + todoResponse2.getQuantityInStock());
        System.out.println("Price" + todoResponse2.getPrice());
    }

    public List <TodoResponse2> getAddById(){
        return addProduct2;
    }
}
