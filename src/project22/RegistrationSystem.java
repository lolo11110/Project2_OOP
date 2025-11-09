package project22;

//RegistrationSystem.java
import java.util.*;

public class RegistrationSystem {
 private Map<String, Student> students; // key = ID
 
 public RegistrationSystem() {
     students = new LinkedHashMap<>();
 }
 
 public boolean addStudent(Student s) {
     if (s == null || students.containsKey(s.getId())) return false;
     students.put(s.getId(), s);
     return true;
 }
 
 public boolean removeStudentById(String id) {
     return students.remove(id) != null;
 }
 
 public Student getStudentById(String id) {
     return students.get(id);
 }
 
 public List<Student> getAllStudents() {
     return new ArrayList<>(students.values());
 }
 
 // update marks for a student
 public boolean updateMarks(String id, double marks) {
     Student s = students.get(id);
     if (s == null) return false;
     s.setMarks(marks);
     return true;
 }
 
 // get pass/fail summary
 public void printSummary() {
     System.out.println("---- Students Summary ----");
     for (Student s : students.values()) {
         System.out.println(s);
     }
 }
}