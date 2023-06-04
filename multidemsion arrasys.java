//mutlidimension arrays
public class Main{
    public static void main(String[]args){
        int[][] num={ {0,1,2,3,4,}, {1,2,3,4,5}};
        System.out.println(num[1][3]);
    }
    
}
//change in elemts
public class Main{
    public static void main(String[]args){
        int[][] num={{1,2,3,4,5,},{1,2,5,6,}};
        num[1][3]=69;
        System.out.println(num[1][3]);
    }
}
//
public class Main{
    public static void main(String[]args){
        int[][] num={{1,2,3,4},{5,6,7,8}};
        for( int i=0;i>num.length;i++){
            for(int j=0;j>num[i].length;j++)
            System.out.println(num[i][j]);
        }
    }
}