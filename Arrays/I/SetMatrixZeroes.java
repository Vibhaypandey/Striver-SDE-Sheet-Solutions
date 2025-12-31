
---------------------------- Brute force approch -----------------------------------------------
  class Solution {
    public void setZeroes(int[][] matrix) {
        //Brute force approch
        /* Here we are creating new matrix 
           find zero value index  */
        int[][] result = new int[matrix.length][matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
               result[i][j] = matrix[i][j];
            }
       }
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                updateRow(i,result);
                updateCol(j,result);
            }
          }
        }
       


       for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j]=result[i][j];
            }
       }
        
         
    }

    public void updateRow(int row, int [][] result){
        for(int i =0;i<result[0].length;i++){
           result[row][i]=0;
        }
    }

    public void updateCol(int col, int [][] result){
        for(int i =0;i<result.length;i++){
           result[i][col]=0;
        }
    }
}


-------------------------------------- Better approch -----------------------------------


  class Solution {
    public void setZeroes(int[][] matrix) {
       int rowArr[] = new int[matrix.length];
       int colArr[] = new int[matrix[0].length];

       for(int i =0; i<matrix.length;i++){
        for(int j =0;j<matrix[0].length;j++){
           if(matrix[i][j]==0){
              rowArr[i] =-1;
              colArr[j] =-1;
           }
        }
       }

       for(int i =0;i<rowArr.length;i++){
          if(rowArr[i]==-1){
            for(int j =0;j<matrix[0].length;j++){
               matrix[i][j] =0;
            }
          }


       for(int k =0;k<colArr.length;k++){
          if(colArr[k]==-1){
            for(int j =0;j<matrix.length;j++){
               matrix[j][k] =0;
            }
          }
       }
    }
    }
}


------------------------------------- optimal approch -----------------------------------------------------
  

