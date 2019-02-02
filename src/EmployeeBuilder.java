public class EmployeeBuilder {
    public static void main(String[] args){
        Employee emp1=new Leaf("John", 10000);
        Employee emp2=new Leaf("David", 15000);
        Employee manager1=new CEO("Daniel",25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3=new Leaf("Michael", 20000);
        CEO generalManager=new CEO("Mark", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
