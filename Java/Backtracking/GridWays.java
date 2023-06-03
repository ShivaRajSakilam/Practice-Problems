public class GridWays {
    public static int solution(int N, int M, int i, int j) {
        if(i==N && j==M)
        return 1;
        if(i==N+1 || j==M+1)
        return 0;

        return solution(N, M, i+1, j)+solution(N, M, i, j+1);
    }
    public static void main(String[] args) {
        //i,j inital indices
        // N M final indices
        System.out.println(solution(1,1,0,0));
    }
}
