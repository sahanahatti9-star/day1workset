class Student {  
    int id;
    String name;
    void display()
    {
        System.out.println(id+""+name);
    }
    class main
    {
        public static void main(String[] args) {
            Student s1=new Student();
            s1.id=04;
            s1.name="Sunaina";
            s1.display();
        }
    }
}
