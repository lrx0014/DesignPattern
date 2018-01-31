package h15_Flyweight;

/** 
 * 客户端测试类 
 * @author fly 
 * 
 */  
public class Client {  
      
    public static void main(String[] args) {  
        IgoChessman black1,black2,black3,white1,white2;  
        IgoChessmanFactory factory;  
        factory = IgoChessmanFactory.getInstance();  
        black1 = IgoChessmanFactory.getIgoChessman("b");  
        black2 = IgoChessmanFactory.getIgoChessman("b");  
        black3 = IgoChessmanFactory.getIgoChessman("b");  
        System.out.println("判断两颗黑棋是否相同："+(black1==black2));  
        white1 = IgoChessmanFactory.getIgoChessman("w");  
        white2 = IgoChessmanFactory.getIgoChessman("w");  
        System.out.println("判断两颗白棋是否相同："+(white1==white2));  
        black1.locate(new Coordinates(1, 2));  
        black2.locate(new Coordinates(3, 4));  
        black3.locate(new Coordinates(1, 3));  
        white1.locate(new Coordinates(2, 5));  
        white2.locate(new Coordinates(2, 4));  
    }  
}  
