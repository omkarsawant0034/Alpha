

class mergeSort{

    public static void printArr(int arr[]){
        for(int q : arr){
            System.out.println(q);
        }
    }

    public static void merge(int [] arr,int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;     // iterator left
        int j = mid+1;  // iterator right
        int k = 0;      // iterator temp;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];   // left part
                i++;
            }else{
                temp[k] = arr[j]; // right part
                j++;
            }
            k++;
        }

        // Right array exausted 
        while(i <= mid){           
            temp[k++] = arr[i++];
        }

        //Left Exausted
        while(j <= ei){           
            temp[k++] = arr[j++];
        }

        for(i= si,k=0; k < temp.length; i++,k++){
            arr[i] = temp[k];
        }
    }
    
    public static void merge_sort(int [] arr,int si,int ei){
       
        if(si >= ei){
            return;
        }
        
        int mid = si+(ei-si)/2;
        merge_sort(arr,0,mid); //sort left 
        merge_sort(arr,mid+1,ei); // sort right
        merge(arr, si, mid, ei);
    }    
    public static void main(String args[]){
        int arr[] = {2,4,1,3,5,6,9,7};
        merge_sort(arr,0,arr.length-1);
        printArr(arr);
    }
}