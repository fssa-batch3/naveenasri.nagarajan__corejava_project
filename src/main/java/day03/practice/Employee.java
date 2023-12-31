package day03.practice;

public class Employee {

	private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
      
    public Employee(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Naveena");
        Employee e2 = new Employee(2, "JayaShree");
        Employee e3 = new Employee("Vinith");
        
        System.out.println("id = "+e1.id+", name = "+e1.name);
        System.out.println("id = "+e2.id+", name = "+e2.name);
        System.out.println("name = "+e3.id);
    }
}
