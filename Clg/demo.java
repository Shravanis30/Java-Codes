// progarm to create two students A (Roll no = 4117) (Name = amit jain), B(Name = Seeta rathi) (Roll no = 3012) Display there information
//Design a class student 
//Data members:
//Roll no
// Name
// Member function:
// Show Data 
//set data (rn,nm)
//Set Data (nm, rn)

class student
{
    private int rollno;
    private String name;
    public void showData()
    {
        System.out.println("RollNo is "+ rollno);
        System.out.println("Name is "+name);
    }
    public void setData (int rn, String nm)
    {
        rollno = rn;
        name = nm;
    }
    public void setData (String nm, int rn)
    {
        rollno = rn;
        name = nm;
    }
}
public class demo {
    public static void main(String[] args) {
        student a = new student();
        student b = new student();
        a.setData(4117, "Amit Jain");
        b.setData("Seeta Rathi", 3012);
        a.showData();
        b.showData();
    }
}
