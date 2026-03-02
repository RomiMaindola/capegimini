package org.example.service_layer;
 import org.example.dao.operation;

 import java.util.List;

public class OperationCheck implements IoperationCheck{
operation op = new operation();
    @Override

    public List<String> bookTitle(String authorName) {
        if(authorName==null)
            return null;
        else
            return op.bookTitle(authorName);
    }

    @Override
    public String Add(String author, String title) {
       if(author==null){
           return "author name is invalid ";
       }
       if(title==null)
           return "title is invalid";
        return op.Add(author,title);
    }

    @Override
    public String updatePrice(String author,int price) {
        if(author==null || price ==0){
            return " invalid author ";
        }
        return op.updatePrice(author,price);
    }
}
