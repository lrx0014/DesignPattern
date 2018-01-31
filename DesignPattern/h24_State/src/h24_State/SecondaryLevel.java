package h24_State;

/**
 * ����״̬��
 * @author gong
 *
 */

public class SecondaryLevel extends AbstractLevel {
    public SecondaryLevel(AbstractLevel level) {
        this.player=level.player;
        this.point=level.getPoint();
        this.stateName="���������";
    }
    public void changeCards(int score){
        System.out.println("�Բ���"+player.getName()+",��û�л��Ƶ�Ȩ��");
    }
    public void peekCards(int score){
        System.out.println("�Բ���"+player.getName()+",��û��͵�������Ƶ�Ȩ��");
    }
    @Override
    public void checkState(int score) {
        if(this.point>1000){
            player.setLevel(new FinalLevel(this));
        }
        else if(this.point>500){
            player.setLevel(new ProfessionalLevel(this));
        }
        else if(this.point<200){
            player.setLevel(new PrimaryLevel(this));
        }

    }

}
