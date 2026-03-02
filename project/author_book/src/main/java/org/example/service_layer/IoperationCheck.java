package org.example.service_layer;
import org.example.beans.*;

import java.util.List;

public interface IoperationCheck {
        public List<String> bookTitle(String authorName);
        public String Add(String author, String title);
        public String updatePrice(String author,int price);

}
