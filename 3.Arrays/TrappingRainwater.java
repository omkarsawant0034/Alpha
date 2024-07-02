
// // Trapping Rainwater 

// public class TrappingRainwater {

//     public static int[] left_max_boundaries(int [] height){

//         int leftMaxBoundary[] = new int[height.length];
//         leftMaxBoundary[0] = height[0];
//         System.out.print(leftMaxBoundary[0]+" ");

//         for(int i = 1; i < height.length; i++){
//             leftMaxBoundary[i] = Math.max(leftMaxBoundary[i-1],height[i]);
//             System.out.print(leftMaxBoundary[i]+" ");
//         }
//         System.out.println();
//         return leftMaxBoundary;
//     }

//     public static int[] right_max_boundaries(int [] height){

//         int rightMaxBoundary[] = new int[height.length];
//         rightMaxBoundary[height.length-1] = height[height.length-1];
//         System.out.print(rightMaxBoundary[height.length-1]+" ");

//         for(int i = height.length-2; i >= 0; i--){
//             rightMaxBoundary[i] = Math.max(rightMaxBoundary[i+1],height[i]);
//             System.out.print(rightMaxBoundary[i]+" ");
//         }
//         System.out.println();
//         return rightMaxBoundary;
//     }

//     public static void trappedRainWater(int[] height){
//         int trappedWater = 0;
//         int left [] = left_max_boundaries(height);
//         int right[] = right_max_boundaries(height);

//         for(int i = 0; i < height.length; i++){
//             trappedWater += Math.min(left[i],right[i]) - height[i];
//         }
//         System.out.println("Total Trapped Water is : "+trappedWater);
//     }
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         trappedRainWater(height);
//     }
// }


class TrappingRainwater {
    public static int trap(int[] height) {
        int maxLeftBoundary[] = new int [height.length]; 
        maxLeftBoundary[0] = height[0]; 
         for(int i = 1; i < height.length;i++){
             maxLeftBoundary[i] = Math.max(maxLeftBoundary[i-1],height[i]);
         }
        
         int maxRightBoundary[] = new int [height.length];
         maxRightBoundary[height.length-1] = height[height.length-1];
         for(int i = height.length-2; i >= 0;i--){
             maxRightBoundary[i] = Math.max(maxRightBoundary[i+1],height[i]);
         }
 
         int trapWater = 0;
         for(int i = 0; i < height.length; i++){
             trapWater += Math.min(maxLeftBoundary[i],maxRightBoundary[i]) - height[i];             
         }
 
         return trapWater;
     }

    public static void main(String args[]){
                int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
                System.out.println(trap(height));
            }
}