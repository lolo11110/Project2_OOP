package project22;

//GradStudent.java
public class GradStudent extends Student {
 private static final double PASS_PERCENT = 80.0;
 
 public GradStudent(String name, String id) {
     super(name, id);
 }
 
 @Override
 public double getPassingPercentage() {
     return PASS_PERCENT;
 }
}
