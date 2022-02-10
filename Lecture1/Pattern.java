public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        p3(n);
    }

    static void p1(int n){
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        int row = 0;
        while(row < n){
            int col = 0;
            while(col < n){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    static void p2(int n){
        int row = 0;
        while(row < n){
            int col = 0;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    static void p3(int n){
        int row = 0;
        int tempRow = 0;
        while(row < 2*n -1){
            int col = 0;
            while(col <= tempRow){
                System.out.print("* ");
                col++;
            }
            System.out.println();

            if(row < n-1){
                tempRow++;
            }
            else{
                tempRow--;
            }

            row++; 
        }
    }

}
