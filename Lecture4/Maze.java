package Lecture4;

public class Maze {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(maze(1, 1, n));
    }

    public static int maze(int x, int y, int n){
        if(x == n && y == n){
            return 1;
        }

        if(x > n || y > n){
            return 0;
        }

        return maze(x, y+1, n) + maze(x+1, y, n);
    }
}
