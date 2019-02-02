import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

interface Employee{
    public String getName();
    public float getSalary();
    public void add(Employee e);
    public void remove(Employee e);
    public Employee getChild(int i);
    public void print();
}

