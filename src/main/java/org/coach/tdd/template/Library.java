package org.coach.tdd.template;

public class Library {
    private int countAlive;
    private final int HEIGHT=15;//游戏界面size
    private final int WIDTH =60;
    private char[][] cell = new char[HEIGHT][WIDTH];
    private final char Y ='*'; //用字符*代表一个细胞
    private final char No = ' ';

    public boolean haveThreeAlive(int adrX,int adrY, int index) {
        int flag = 0;
        countAlive = index;
        if (countAlive == 3) {
            cell[adrX][adrY] = Y;
            return true;
        }
        else
            return false;
    }

    public boolean haveTwokeep(int adrX,int adrY,int index) {
        //int flag = 0;
        // countAlive=index;
        // if(countAlive == 2)
        return true;

    }

    public boolean haveDead(int adrX,int adrY) {
        cell[adrX][adrY] = No;
            return true;

    }
    Library(){
        cell[3][4] = cell[3][5] = cell[3][6] =Y;
        //glider
        cell[10][4] =  cell[10][5] =  cell[10][6] =  cell[11][6] =  cell[12][5] = Y;
        System.out.print("initial cell:");
        for(int x=0;x<HEIGHT;x++){
            for(int y=0;y<WIDTH;y++)
                System.out.print(cell[x][y]);
            System.out.print("\n");}
        System.out.print("\n");
        System.out.print("\n");

    }
    private int cellState(int y,int x) {
        boolean isEmpty = (y < 0 || y >= HEIGHT || x < 0 || x >= WIDTH || cell[y][x] != Y ) ;
        return isEmpty ? 0 : 1 ;
    }
    private int getNeighbors(int y,int x) {
        int n = 0; //neighbor
        n += cellState(y - 1, x - 1);
        n += cellState(y - 1, x);
        n += cellState(y - 1, x + 1);
        n += cellState(y, x - 1);
        n += cellState(y, x + 1);
        n += cellState(y + 1, x - 1);
        n += cellState(y + 1, x);
        n += cellState(y + 1, x + 1);
        System.out.print(n);
        return n-1;
    }

    public boolean resolve(int i,int j) {
        int a,b;
        a=i;
        b=j;
        boolean flag;
       int  n = getNeighbors(a,b);
        System.out.print(n);
        if(n == 3)
           flag= haveThreeAlive(a,b,n);
        else if(n == 2)
             flag = haveTwokeep(a,b,n);
        else
            flag=haveDead(a,b);
        for(int x=0;x<HEIGHT;x++){
            for(int y=0;y<WIDTH;y++)
                System.out.print(cell[x][y]);
                     System.out.print("\n");}
        return flag;

    }

    public boolean someLibraryMethod() {
        return true;
    }

    public void main(){
        int checkY,checkX;
        Library selfCell = new Library();
        //for(int i=0;i<HEIGHT;i++)
            //for(int j=0;j<WIDTH;j++) {
                 checkY = 4;
                checkX = 3;

               // selfCell.cellState(checkX, checkY);
               // getNeighbors(checkX, checkY);
                resolve(checkX, checkY);

    }

}

