public class studentsMarks {
    public static void main(String[] args) {
        int maths = 90, english = 98, ed = 100, dbms = 70, oop = 99;
        int total = maths + english + ed + dbms + oop;

        if (maths >= 40 && english >= 40 && ed >= 40 && dbms >= 40 && oop >= 40) {
            double percentage = total / 5.0;
            System.out.println("total = " + total);
            System.out.println("percentage=" + percentage);
            System.out.println("student is pass");

        } else
            System.out.println("student is fail");

    }
}
