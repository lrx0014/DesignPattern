package h24_State;

/**
 * ����״̬��
 * @author gong
 *
 */
public class FinalLevel extends AbstractLevel {
    public FinalLevel(AbstractLevel level) {
        this.player=level.player;
        this.point=level.getPoint();
        this.stateName="�ǻҼ����";
    }
    @Override
    public void checkState(int score) {
        if(this.point<1000){
            player.setLevel(new ProfessionalLevel(this));
        }
        else if(this.point<500){
            player.setLevel(new SecondaryLevel(this));
        }
        else if(this.point<200){
            player.setLevel(new PrimaryLevel(this));
        }

    }

}
