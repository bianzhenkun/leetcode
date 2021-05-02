class LeastBricks {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<wall.size();i++){
            List<Integer> line = wall.get(i);
            int index = 0;
            for(int j=0;j<line.size()-1;j++){
                index += line.get(j);
                map.put(index, map.getOrDefault(index, 0)+1);
            }
        }
        int res = 0;
        for(int num:map.values()){
            res = Math.max(res, num);
        }
        return wall.size()-res;
    }
}
