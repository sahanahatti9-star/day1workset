
class Student{

    Student()
    {
        System.out.println("Sonu");

    }
     Student(int a, int b)
    {
        System.out.println("Numbers:"+a+b);

    }
     Student(float a, float b)
    {
        System.out.println("Decimals:");

    }
}

class main1 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(10,4);
        Student s3=new Student(10.4, );
    } 
    
}



