package h15_Flyweight;

import java.util.Hashtable;

/** 
 * 围棋棋子工厂类：享元工厂类 
 * @author fly 
 * 
 */  
public class IgoChessmanFactory {  
      
    private static IgoChessmanFactory instance = new IgoChessmanFactory();  
    private static Hashtable<String, IgoChessman> ht;  
      
    public IgoChessmanFactory() {  
        // TODO Auto-generated constructor stub  
        ht = new Hashtable<String, IgoChessman>();  
        IgoChessman black,white;  
        black = new BlackIgoChessman();  
        ht.put("b", black);  
        white = new WhiteIgoChessman();  
        ht.put("w", white);  
    }  
      
    public static IgoChessmanFactory getInstance(){  
        return instance;  
    }  
      
    public static IgoChessman getIgoChessman(String color){  
        return (IgoChessman)ht.get(color);  
    }  
}  
