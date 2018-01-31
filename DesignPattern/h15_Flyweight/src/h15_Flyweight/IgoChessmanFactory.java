package h15_Flyweight;

import java.util.Hashtable;

/** 
 * Χ�����ӹ����ࣺ��Ԫ������ 
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
