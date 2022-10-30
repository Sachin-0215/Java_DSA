public class D {
    public static void main(String[] args) {
        // Student s = new Student();//error
        // Student s1 = new Student("asd");
        // Student s3 = new Student(124);
        // Student s4 = new Student("abd", 4);eror
        // System.out.println(s);

        //for copy constructor 
        Student s1 = new Student();
        s1.name = "xnxn";
        s1.rollNo = 11;
        s1.pwd = "sjsj";
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.pwd);
        s1.marks[0] = 90;
        s1.marks[1] = 10;
        s1.marks[2] = 100;

        System.out.println();
        
        Student st = new Student(s1);
        st.pwd = "wk";
        System.out.println(st.name);
        System.out.println(st.rollNo);
        System.out.println(st.pwd);
        s1.marks[2] = 50;
        for (int i = 0; i < st.marks.length; i++) {
            System.out.println(s1.marks[i]+" "+st.marks[i]);
        }

    }
}

//constructor
class Student {
    String name;
    int rollNo;
    String pwd;
    int marks[];

    //non parameterised constructor 
    Student() {
        marks = new int[3];
        System.out.println("Non parameterised Construtor is called...");
    }

    //Parameterised constructor 
    // Student(String name) {
    //     this.name = name;
    // marks = new int[3];
    //     System.out.println("Non parameterised Construtor is called...");
    // }

    // Student(int rollNo) {
    //     this.rollNo = rollNo;
    // marks = new int[3];
    //     System.out.println("Non parameterised Construtor is called...");
    // }
    //these are called as constructor overloading 

    //shallow copy constructor 
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;

    //     System.out.println("Copy constructor is called...");
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
