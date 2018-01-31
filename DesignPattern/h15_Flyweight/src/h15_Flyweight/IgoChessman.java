package h15_Flyweight;

/** 
 * 围棋棋子类：抽象享元类 
 * @author fly 
 * 
 */  
abstract class IgoChessman {  
      
    public abstract String getColor();  
    public void locate(Coordinates coord){  
        System.out.println("棋子颜色："+this.getColor()+",棋子位置："+coord.getX()+","+coord.getY());  
    }  
}  
