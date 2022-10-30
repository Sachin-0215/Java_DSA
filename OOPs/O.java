//interface in java
public class O{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        rook r =new rook();
        r.moves();
    }
}

interface chessPlayer{
    public void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Moving up,down,left,right,diagonal in all direction");
    }
}
/*
    O.java:15: error: moves() in Queen cannot implement moves() in chessPlayer
    /*public/ void moves(){
        ^
        attempting to assign weaker access privileges; was public
      O.java:20: error: moves() in rook cannot implement moves() in chessPlayer
          /*public// void moves(){
                          ^
        attempting to assign weaker access privileges; was public
      2 errors */

class rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right in horizontal direction");
    }
}