class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    Point setx(int x){
        this.x=x;
        return this;
    }
    Point sety(int y){
        this.y=y;
        return this;
    }
}
public class this_reference1 {
    public static void main(String[] args) {
        Point p1=new Point(10, 20);
        
        Point p2=new Point(30, 40);
        p1.setx(4).sety(6);
        
    }
    
}
