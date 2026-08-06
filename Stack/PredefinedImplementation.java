import java.util.*;
/*Case - 01   General Implementation  

public class PredefinedImplementation extends Stack<Integer> {
    public static void main(String[] args) 
    {
        PredefinedImplementation s = new PredefinedImplementation();
        System.out.println(s.empty());  // true 
        s.push(111); 
        s.push(222); 
        s.push(333); 
        s.push(444); 
        s.push(555); 
        System.out.println(s);   // [111, 222, 333, 444, 555] 
        System.out.println(s.peek());   // 555 
        System.out.println(s.pop());   // 555 
        System.out.println(s);        // [111, 222, 333, 444] 
        System.out.println(s.search(333));  // 2 
        System.out.println(s.search(555));  // -1 
    }
} */

/*Case - 02   To Hold String Objects
 
public class PredefinedImplementation {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        System.out.println(s.empty()); //true
        s.push("AAA");
        s.push("BBB");
        s.push("CCC");
        s.push("DDD");
        System.out.println(s.empty()); //false
        System.out.println(s.peek()); //DDD
        System.out.println(s.search("CCC")); // 2
        System.out.println(s.pop());   //DDD
        System.out.println(s);  //[AAA, BBB, CCC]
    }
}*/

//To Hold Student class object
class Student {
    int sid;
    String name;

    Student(int sid, String name){
        this.sid = sid;
        this.name = name;
    }

    public String toString(){
        return "("+sid+","+name+")";
    }
}

public class PredefinedImplementation {
    public static void main(String[] args) 
    {
        Stack<Student> s = new Stack<>();
        Student s1 = new Student(444,"BBB");
        Student s2 = new Student(111,"AAA");
        Student s3 = new Student(555,"EEE");
        Student s4 = new Student(333,"DDD");
        Student s5 = new Student(222,"XXX");

        s.push(s1);
        s.push(s2);
        s.push(s3);
        s.push(s4);
        s.push(s5);

        System.out.println(s);
    }
}