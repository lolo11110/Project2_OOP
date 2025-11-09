package project22;

//Student.java
public abstract class Student {
 private String name;
 private String id;
 protected double marks; // single mark representing percentage (0-100)
 
 public Student(String name, String id) {
     this.name = name;
     this.id = id;
     this.marks = 0;
 }
 
 public String getName() { return name; }
 public String getId() { return id; }
 public double getMarks() { return marks; }
 
 public void setMarks(double marks) {
     if (marks < 0) marks = 0;
     if (marks > 100) marks = 100;
     this.marks = marks;
 }
 
 // each subclass provides its own passing percentage
 public abstract double getPassingPercentage();
 
 public boolean hasPassed() {
     return this.marks >= getPassingPercentage();
 }
 
 @Override
 public String toString() {
     return String.format("Name: %s, ID: %s, Marks: %.2f%%, Passed: %s",
             name, id, marks, hasPassed() ? "Yes" : "No");
 }
}
 