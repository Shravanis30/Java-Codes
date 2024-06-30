public interface Circle {

    // Abstract method to calculate the area of the shape
    double calculateArea();
  }
  
  public class Code_17 implements Circle {
 
    
    private double radius;
  
    public Code_17(double radius) {
      this.radius = radius;
    }
  
    @Override
    public double calculateArea() {
      return Math.PI * radius * radius;
    }
  }
    