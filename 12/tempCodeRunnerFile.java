class person {
    String name;
    String address;
    int age;
    person(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
}
    class employee extends person{
        int empid;
        String c_name;
        String qualification;
        employee(String name,String address , int age,int empid,String c_name,String qualification  ){
            super(name, address, age);
            this.empid=empid;
            this.c_name=c_name;
            this.qualification=qualification;
        }
    }
    class teacher extends  employee{
        String subject;
        String department;
        int teacherId;
        teacher(String name,String address , int age,int empid,String c_name,String qualification,String subject,String department,int teacherId){
        super (name, address, age,empid,c_name,qualification);
        this.subject=subject;
        this.department=department;
        this.teacherId=teacherId;

    }
    
    void display(){
        System.out.println("name"+name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(empid);
        System.out.println(qualification);
        System.out.println(subject);
    }
}
    public class co2{
        public static void main(String []args){
            teacher [] teach=new teacher[2];
            teach [0]=new teacher("amal","male",32,1001,"eduport","msc","abc","bfdfd",1);
        }
    }
