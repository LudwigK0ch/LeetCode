/**
* Problem: 36. Valid Sudoku
* Difficulty: Medium
* Categories: Array, Hash Table, Matrix
* Link: https://leetcode.com/problems/valid-sudoku
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, List<Character>> rows = new HashMap<Integer, List<Character>>();
        HashMap<Integer, List<Character>> columns = new HashMap<Integer, List<Character>>();
        HashMap<String, List<Character>> boxes = new HashMap<String, List<Character>>();
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                char current = board[i][j];
                if(current == '.') continue;
                //Check row
                rows.putIfAbsent(i, new ArrayList<>());
                if(rows.get(i).contains(current)){
                    return false;
                } else {
                    rows.get(i).add(current);
                }
                
                //Check column
                columns.putIfAbsent(j, new ArrayList<>());
                if(columns.get(j).contains(current)){
                    return false;
                } else {
                    columns.get(j).add(current);
                }
                
                //Check box
                String box = Integer.toString(i/3) + Integer.toString(j/3);
                boxes.putIfAbsent(box, new ArrayList<>());
                if(boxes.get(box).contains(current)){
                    return false;
                } else {
                    boxes.get(box).add(current);
                }
            }
        }
        
        return true;
    }
}