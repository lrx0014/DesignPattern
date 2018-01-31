package h24_State;

/**
 * ����״̬��
 * @author gong
 *
 */
public class PrimaryLevel extends AbstractLevel {
    public PrimaryLevel(AbstractLevel level) {
        this.player=level.player;
        this.point=level.getPoint();
        this.stateName="���ż����";
    }
    public PrimaryLevel(Player player) {
        this.player=player;
        this.stateName="���ż����";
        this.point=0;
    }
    public void doubleScore(int score){
        System.out.println("�Բ���"+player.getName()+",��û�л�ʤ˫�����ֵ�Ȩ��");
    }
    @Override
    public void checkState(int score) {
        if(this.point>1000){
            player.setLevel(new FinalLevel(this));
        }
        else if(this.point>500){
            player.setLevel(new ProfessionalLevel(this));
        }
        else if(this.point>200){
            player.setLevel(new SecondaryLevel(this));
        }

    }

}
