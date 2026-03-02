package org.example.dao;
import org.example.beans.*;

import java.util.List;

public interface Ioperation {
public List<String> bookTitle(String authorName);
public String Add(String author, String title);
public String updatePrice(String author,int price);


}
