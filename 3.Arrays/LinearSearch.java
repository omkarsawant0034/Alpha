public class LinearSearch{
    
    public static int linearSearch(int[] marks,int key){
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[] = {2,4,6,8,10,12,16};
        int key = 10;

        System.out.println(linearSearch(marks,key));
    }
}