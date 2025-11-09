package project22;

//UndergradStudent.java
public class UndergradStudent extends Student {
 private static final double PASS_PERCENT = 60.0;
 
 public UndergradStudent(String name, String id) {
     super(name, id);
 }
 
 @Override
 public double getPassingPercentage() {
     return PASS_PERCENT;
 }
}
