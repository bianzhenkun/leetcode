class MergeSection {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Comparator<int[]> cmp = new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        };
        Arrays.sort(intervals,cmp);
        for(int i=0;i<intervals.length;i++){
            int j = i;
            int right = intervals[j][1];
            for(;j<intervals.length-1;j++){
                if(right<intervals[j+1][0])
                    break;
                right = Math.max(right, intervals[j+1][1]);
            }
            //i-j合并
            list.add(new int[]{intervals[i][0],right});
            i=j;
        }
        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }
}