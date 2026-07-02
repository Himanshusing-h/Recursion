 class UniquePath {
    public static void main (String[]args) {
        //m and n are rows and column of grid
        int m=3;
        int n=3;
        int paths=path(m,n);
        System.out.println(paths);
    }
   static int path(int m,int n){
        if(m==1 || n==1){
            return 1;

        }
        //recursive calling ek ne do ko call kiya then do ne do do or ko call kiya jbb tkk m ya n one na ho
        return path(m-1,n)+path(m,n-1);


    }
}

