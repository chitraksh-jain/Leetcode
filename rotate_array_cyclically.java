public class rotate_array_cyclically{
    public static class solution{
    int []rotate1(int A[],int k){
        int size=A.length;
        int [] B = new int [size];
        int i=0;
        int j=size-k;
        while(j<size){
        B[i]=A[j];
        j++;
        i++;
        }
        j=0;
        while(i<size){
            B[i]=A[j];
            i++;
            j++;
        }
        return B;
    }
}
    public static void main(String[] args) {
    int A[]={9,2,6,1,4};
    int k=2;
    solution obj = new solution();
    int[]rotated_arr=obj.rotate1(A, k);
    for (int num: rotated_arr) {
        System.out.print(" "+num);
    }
    }
}