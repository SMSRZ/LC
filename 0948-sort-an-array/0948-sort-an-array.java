class Solution {
    public int[] sortArray(int[] arr) {
        //bubble sort 
        /*
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
        //selection sort
        for(int i=0; i<arr.length-1; i++){
            int minele = arr[i];
            int minidx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<minele){
                    minele = arr[j];
                    minidx= j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        return arr;*/
        //merge sort
        mergesort(arr,0,arr.length-1);
        return arr;
    }
    public void mergesort(int[] arr, int s, int e){
        if(s==e)return;

        int mid = (s+e)/2;

        mergesort(arr, s, mid);
        mergesort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }
    public void merge(int[] arr, int s, int m, int e){
        int[] temp = new int [e-s+1];
        int p1= s;
        int p2=m+1;
        int p3 = 0;
        while(p1<=m && p2<=e){
            if(arr[p1]<arr[p2]){
                temp[p3]=arr[p1];
                p3++;
                p1++;
            }else{
                temp[p3]=arr[p2];
                p2++;
                p3++;
            }
        }
        while(p1<=m){
            temp[p3]=arr[p1];
            p3++;
            p1++;
        }
        while(p2<=e){
            temp[p3]=arr[p2];
            p2++;
            p3++;
        }
        for(int i=0; i<temp.length; i++){
            arr[s+i] = temp[i];
        }
    }
}