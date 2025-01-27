class Student{
    int rollNo;
    int age;
    String studentName;
    String FullName;
}

public class Main {
public static void main (String[]args){
    Student obj1 = new Student();
    Student obj2 = new Student();
    Student Shoeb = new Student();
    Student Saif = new Student();
    Student Shama = new Student();
    Student Khurshid = new Student();
    obj1.rollNo=7;
    obj2.rollNo=8;
    obj1.studentName= "jawed";
    obj2.studentName= "jamshed";
    Shoeb.age=13;
    Shoeb.FullName="Shoeb Akhtar";
    Saif.age = 10;
    Saif.FullName = "Saif Ali";
    Shama.age = 14;
    Shama.FullName = "Shama Parveen";
    Khurshid.age = 27;
    Khurshid.FullName = "Mohammad Khurshid";
    System.out.println(obj1.rollNo+" "+obj1.studentName);
    System.out.println(obj2.rollNo+" "+obj2.studentName);
    System.out.println("The Actual  Age is "+Shoeb.age+" The FullName is "+Shoeb.FullName);
    System.out.println("The Actual Age is "+Saif.age+" The FullName is "+Saif.FullName);
    System.out.println("The Actual Age is "+Shama.age+" The FullName is "+Shama.FullName);
    System.out.println("The Actual Age is "+Khurshid.age+" The FullName is "+Khurshid.FullName);
}
}
