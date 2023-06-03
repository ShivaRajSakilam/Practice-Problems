public class N_Queens {
    public static void printBoard(char board[][]) {
        System.out.println("-------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][], int i, int j) {
        //vertical
        for (int j2 = 0; j2 < board.length; j2++) {
            if(board[j2][j]=='Q')
            return false;
        }
        //horizontal
        for (int j2 = 0; j2 < board.length; j2++) {
            if(board[i][j2]=='Q')
            return false;
        }
        //diagnol ul
        for (int j2 = i,j3=j; j2 >=0 && j3>=0; j2--,j3--) {
            if(board[j2][j3]=='Q')
            return false;
        }
        //diagnol ur
        for (int j2 = i,j3=j; j2 >=0 && j3<board.length; j2--,j3++) {
            if(board[j2][j3]=='Q')
            return false;
        }
        
        //down ones are not required as no queens have been placed so far in the below of the given i,j position.

        //diagnol dr
        // for (int j2 = i,j3=j; j2<board.length && j3<board.length; j2++,j3++) {
        //     if(board[j2][j3]=='Q')
        //     return false;
        // }
        //diagnol dl
        // for (int j2 = i,j3=j; j2<board.length && j3>=0; j2++,j3--) {
        //     if(board[j2][j3]=='Q')
        //     return false;
        // }
        return true;
    }
    public static void printAllSols(char board[][], int i) {
        if(i==board.length){
            printBoard(board);
            return;
        }
            for (int j = 0; j < board.length; j++) {
                if(isSafe(board,i,j)){
                    board[i][j]='Q';
                    printAllSols(board, i+1);
                    board[i][j]='X';
                }
            }
    }
    public static void solveNQueens(int n) {
        // creating chess board
        char board[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        printAllSols(board,0);        
    }
    public static boolean onesol(char board[][], int i) {
        if(i==board.length){
            printBoard(board);
            return true;
        }
            for (int j = 0; j < board.length; j++) {
                if(isSafe(board,i,j)){
                    board[i][j]='Q';
                    if(!onesol(board, i+1))
                    board[i][j]='X';
                    // else 
                    // return true;
                }
            }
        return false;
    }
    public static void main(String[] args) {
        int n = 3;
        solveNQueens(n);
        char board[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        if(!onesol(board, 0))
        System.out.println("not possible");
    }
}
