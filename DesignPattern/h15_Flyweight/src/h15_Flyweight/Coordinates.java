package h15_Flyweight;

/** 
 * 坐标类：外部状态类 
 * @author fly 
 * 
 */  
class Coordinates {  
      
    private int x;  
    private int y;  
      
    public Coordinates(int x,int y) {  
        // TODO Auto-generated constructor stub  
        this.x = x;  
        this.y = y;  
    }  
  
    public int getX() {  
        return x;  
    }  
  
    public void setX(int x) {  
        this.x = x;  
    }  
  
    public int getY() {  
        return y;  
    }  
  
    public void setY(int y) {  
        this.y = y;  
    }  
      
}  