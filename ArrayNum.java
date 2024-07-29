public class ArrayNum {
    public static void main(String[] args) {
        int i;
        int n = 100;
        int[] A = new int[n];
        for(i=0;i<=n-1;i++)
        {
            A[i]=i+1;
        }
        for(i=0;i<=n-1;i++)
        {
            System.out.print(A[i] + "\t");
        }
    }
}