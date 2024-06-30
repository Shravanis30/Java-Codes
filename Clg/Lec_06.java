// program to create a vector store 
// student name list in it set values
// amit, sumit ,raja, gopal, mohan

import java.util.*;

public class Lec_06 {
    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.add("amit");
        vec.add("sumit");
        vec.add("raja");
        vec.add("gopal");
        vec.add("mohan");

        for (int i = 0; i < vec.size(); i++)
            System.out.println(vec.get(i));
    }
}
