package org.example.UserInterface;
import org.example.service_layer.OperationCheck;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {
        OperationCheck op = new OperationCheck();
        List<Integer> list = new ArrayList<>();
        System.out.println(op.bookTitle("romi"));
        System.out.print(op.Add("romi","death"));
        System.out.println(op.updatePrice("romi",450));

    }
}
