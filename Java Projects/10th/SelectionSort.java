public class SelectionSort {
    public static void main(String[] args) {
        int[] ar= {100,20,90,10,60,70,40,80,50,30};
        for(int i=0; i<ar.length-1; i++) {
            int min = ar[i], p=i;
            for(int j=i; j<ar.length; j++) {
                if(ar[j]<min) {
                    min=ar[j];
                    p=j;
                }
            }
            int t=ar[i];
            ar[i]=ar[p];
            ar[p]=t;
            System.out.print(ar[i]+", ");
        }
    }
}
