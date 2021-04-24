class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int layer = 0;
        List<Integer> res = new ArrayList<>();
        int m=matrix.length, n=matrix[0].length;
        boolean[][] judge = new boolean[m][n];
        while(layer<m/2 && layer<n/2){
            for(int i=layer;i<n-layer;i++){
                res.add(matrix[layer][i]);
                judge[layer][i]=true;
            }
            for(int i=layer+1;i<m-layer;i++){
                res.add(matrix[i][n-layer-1]);
                judge[i][n-layer-1]=true;
            }
            for(int i=n-layer-2;i>=layer;i--){
                res.add(matrix[m-layer-1][i]);
                judge[m-layer-1][i] = true;
            }
            for(int i=m-layer-2;i>=layer+1;i--){
                res.add(matrix[i][layer]);
                judge[i][layer] = true;
            }
            layer++;
        }
        if(m%2==1){
            for(int i=layer;i<n-layer;i++){
                if(judge[layer][i]==false)
                {
                    res.add(matrix[layer][i]);
                    judge[layer][i] = true;
                }
            }
        }
        if(n%2==1){
            for(int i=layer;i<m-layer;i++){
                if(judge[i][layer]==false)
                    res.add(matrix[i][layer]);
            }
        }
        return res;
    }
}