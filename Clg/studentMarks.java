public class studentMarks {
    public static void main(String[] args) {
        int a = 57, b = 48, c = 93, d = 80, e = 84, total;
        double per;
        total = a + b + c + d + e;
        System.out.println("Total marks = " + total);
        if (a >= 40 && b >= 40 && c >= 40 && d >= 40 && e >= 40) 
        {
            per = total / 5.0;
            System.out.println("Student is pass");
            System.out.println("Percentage is " + per);
        } else
            System.out.println("student is fail");
    }
}
