import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CEO implements Employee{
    private String name;
    private float salary;
    List<Employee> subordinates = new ArrayList<Employee>();

    public CEO(String name, float salary){
        this.name = name;
        this.salary =salary;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public float getSalary(){
        return this.salary;
    }
    @Override
    public Employee getChild(int i){
        return subordinates.get(i);
    }
    @Override
    public void add(Employee e){
        this.subordinates.add(e);
    }

    @Override
    public void remove(Employee e){
        this.subordinates.remove(e);
    }

   public List<Employee>  getSubordinates(){
        return subordinates;
    }
    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");

        Iterator<Employee> employeeIterator = subordinates.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }
}
