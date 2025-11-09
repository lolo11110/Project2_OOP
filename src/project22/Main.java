package project22;

//Main.java
public class Main {
 public static void main(String[] args) {
     RegistrationSystem system = new RegistrationSystem();
     
     // إضافة طلاب (مثال بيانات طالب جامعي وطالب دراسات عليا)
     UndergradStudent u1 = new UndergradStudent("Ali Hassan", "U123");
     GradStudent g1 = new GradStudent("Sara Ahmed", "G456");
     
     system.addStudent(u1);
     system.addStudent(g1);
     
     // إدخال العلامات
     system.updateMarks("U123", 58.5); // تحتجّل تعديل لاحق
     system.updateMarks("G456", 82.0);
     
     // طباعة الملخص
     system.printSummary();
     
     // تعديل علامة لاحقاً (مثال الخاصية المطلوبة)
     System.out.println("\n--- Modifying Ali's marks to 65 ---");
     system.updateMarks("U123", 65.0);
     system.printSummary();
     
     // أمثلة على الوصول
     Student s = system.getStudentById("U123");
     if (s != null) {
         System.out.printf("\nStudent %s has passed? %s\n", s.getName(), s.hasPassed() ? "Yes" : "No");
     }
 }
}
