package h24_State;

/**
 * ״̬ģʽ�ͻ���
 * @author gong
 *
 */
public class Client {

    public static void main(String[] args) {
        Player player1=new Player("��С��");
        player1.setSuccess(true);
        player1.play(200);
        System.out.println("-----------------------------------------------");
        player1.setSuccess(true);
        player1.doubleScore(200);
        System.out.println("===============================================");
        player1.setSuccess(true);
        player1.play(200);
        System.out.println("===============================================");
        player1.setSuccess(true);
        player1.doubleScore(200);
        System.out.println("-----------------------------------------------");
        player1.setSuccess(true);
        player1.peekCards(200);
        System.out.println("===============================================");
        player1.setSuccess(true);
        player1.doubleScore(200);
        System.out.println("===============================================");
    }
}
