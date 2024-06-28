public class SubArrays {

    public static void subArray(int [] nums){
        int totalSubArrays = 0; 
        for(int i = 0; i < nums.length; i++){
            int start = i;
            for(int j = i; j <nums.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(nums[k]+" ");
                    totalSubArrays++;
                }
                System.out.println();
            }
        }

        System.out.println("Total SubArrays : "+totalSubArrays);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        subArray(nums);
    }
}
