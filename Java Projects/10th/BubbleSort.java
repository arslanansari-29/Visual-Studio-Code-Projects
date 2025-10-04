public class BubbleSort {
    public static void main(String[] args) {
        int[] ar= {100,20,90,10,60,70,40,80,50,30};
        for(int i=0; i<ar.length-1; i++) {
            // int min = ar[i], p=i;
            for(int j=0; j<(ar.length-i-1); j++) {
                if(ar[j]>ar[j+1]) {
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        for(int i=0; i<ar.length; i++)
            System.out.print(ar[i]+", ");
    }
}
