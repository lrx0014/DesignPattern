package h15_Flyweight;

/** 
 * Χ�������ࣺ������Ԫ�� 
 * @author fly 
 * 
 */  
abstract class IgoChessman {  
      
    public abstract String getColor();  
    public void locate(Coordinates coord){  
        System.out.println("������ɫ��"+this.getColor()+",����λ�ã�"+coord.getX()+","+coord.getY());  
    }  
}  
