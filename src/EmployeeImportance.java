/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,List<Integer>> map2 = new HashMap<>();
        for(int i=0;i<employees.size();i++){
            Employee temp = employees.get(i);
            map.put(temp.id, temp.importance);
            map2.put(temp.id, temp.subordinates);
        }
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addFirst(id);
        int res = 0;
        while(!queue.isEmpty()){
            int temp_id = queue.getFirst();
            res+=map.get(temp_id);
            List<Integer> list = map2.get(temp_id);
            for(int i=0;i<list.size();i++){
                queue.addLast(list.get(i));
            }
            queue.removeFirst();
        }
        return res;
    }
}