public class studentMark1 {
    public static void main(String[] args) {
        int a = 57, b = 48, c = 93, d = 80, e = 84, total;
        double per;
        total = a + b + c + d + e;
        per = total / 5.0;
        System.out.println("total marks = " + total);
        if (a >= 40 && b >= 40 && c >= 40 && d >= 40 && e >= 40) 
        {
            if (per >= 60)
                System.out.println("student get 1st class");
        }
        else 
            System.out.println("student is fail");
    }
}
