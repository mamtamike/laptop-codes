package advanceTopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInCollection {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {   //hasNext check out weather the element exist in list if so then loop will start to execute
            String fruit = it.next();
            System.out.println(fruit);
            
            if (fruit.equals("Banana")) {
                it.remove();  // safely removes "Banana" from the list
            }
        }

        System.out.println("Updated List: " + list);
    }
}

