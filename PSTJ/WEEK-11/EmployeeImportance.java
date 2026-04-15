import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subs){
        this.id = id;
        this.importance = importance;
        this.subordinates = subs;
    }
}

public class EmployeeImportance {
    public static int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee e : employees){
            map.put(e.id, e);
        }

        return dfs(map, id);
    }

    private static int dfs(Map<Integer, Employee> map, int id){
        Employee e = map.get(id);
        int total = e.importance;
        for(int sub : e.subordinates){
            total += dfs(map, sub);
        }
        return total;
    }

    public static void main(String[] args){
        Employee e1 = new Employee(1,5,Arrays.asList(2,3));
        Employee e2 = new Employee(2,3,new ArrayList<>());
        Employee e3 = new Employee(3,3,new ArrayList<>());
        List<Employee> list = Arrays.asList(e1,e2,e3);

        System.out.println(getImportance(list,1));
    }
}