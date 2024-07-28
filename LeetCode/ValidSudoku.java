import java.util.*;
class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> map = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                char num = board[i][j];
                if(num != '.'){
                    String rowCheck = num+" in row "+i;
                    String colCheck = num+" in col "+i;
                    String boxCheck = num+"in box"+(i/3)+"-"+(j/3);
                    
                    if(map.contains(rowCheck) || map.contains(colCheck) || map.contains(boxCheck)){
                        return false;
                    }
                    
                    map.add(rowCheck);
                    map.add(colCheck);
                    map.add(boxCheck);
                    
                }
            }
        } 
        return true;      
    }

    public static void main(String args[]){
    char board[][] = {
        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };
    
    System.out.println(isValidSudoku(board));
    }
}