public class Ten {
    public static void main(String[] args) {
        int [][]arr = new int[4][4];
        int row, col;
        for(int i =0 ; i< 10; i++){
            row =(int)(Math.random()*4);
            col =(int)(Math.random()*4);

            if(arr[row][col] == 0){
                arr[row][col] = (int)(Math.random()*9) +1;       
            }
            else{
                i--;
            }            
        }
        for(int i =0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length;j++)
                System.out.print(arr[i][j] +"\t");
            
            System.out.println();
        }
            
    }
}
