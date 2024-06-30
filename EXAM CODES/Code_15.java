// 15. How do you create vector in java with example? How do we add element to the vector?

// program to create an vector of 6 elements set values 2.5, 4.2, 8.6, 12.4, 24.9, 50.8 find sum of elements

import java.util.Vector;
import java.util.*;

public class Code_15 {
    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.add(2.5);
        vec.add(4.2);
        vec.add(8.6);
        vec.add(12.4);
        vec.add(24.9);
        vec.add(50.8);
        double s = 0;
        for (int i = 0; i < vec.size(); i++)
            s = s + (double) vec.get(i);
        System.out.println("Sum is " + s);
    }
}
