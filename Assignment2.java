public class Assignment2 {package assignment;
    class student
    {
        private string name;
        private int age;
        private String email;
        private String address;
        public student()
        {
            System.out.println("student default constructor");

        }
        public student(String n, int a,String add)
        {
            this.name = n;
            this.age = d;
            this.mail = e;
            this.address =add;

        }
        public String getName()
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
        public String getEmail()
        {
            return email;
        }
        public String getAddress()
        {
            return address;
        }
 }
    class Teacher
    {
        private String name;
        private int age;
        private String email;
        private String address;
        public Teacher()
        {
            System.out.println("teacher default constructor");
  }
  public Teacher(String n, int d, String e,String add)
  {
      this.name=n;
      this.age=d;
      this.email=e;
      this.address=add;
  }
  public string getName()
  {
      return name;
  }
  public int getAge()
{
    return age;
}
public String getEmail()
{ 
    return email()
}
public String getAddress()   
{
    return address;
}
}





public class Assignment3
{
    public Static void main(String[] args){
        System.out.println("student details");
        Student s1= new Student("deepthi", "deepthirm22@gmail.com", "Davanagere");
        Student s2=new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getEmail());
        System.out.println(s1.getAddress());
        System.out.println("teacher details:");
        Teacher t1= new Teacher("pradeep", 40, "pradeep.test@gmail.com", "banglour");
        Teacher t2= new Teacher();
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getEmail());
        System.out.println(t1.getAddress());
        batch1=new batch();
 }
}

class batch
{
    private String name;
    private int size;
    private Student[] student;
    private Teacher teacher;
    public batch()
    {
        System.out.println("batch dafault constructor");
    }
    public batch(String name, int size)
    {
        this.name=name;
        this.size=size;

    }
    public String getName()
    {
        return name;
    }
    public int getsize()
    {
        return size;
    }
    
}