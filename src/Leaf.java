public class Leaf implements Employee {
    //this leaf class has no
    private String name;
    private float salary;

    public Leaf(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee e){

    }
    public Employee getChild(int i){
        return null;
    }

    public String getName(){
        return name;
    }

    public float getSalary(){
        return salary;
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");
    }

    public void remove(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }
}
