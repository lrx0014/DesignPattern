package h24_State;

/**
 * 具体状态类
 * @author gong
 *
 */
public class PrimaryLevel extends AbstractLevel {
    public PrimaryLevel(AbstractLevel level) {
        this.player=level.player;
        this.point=level.getPoint();
        this.stateName="入门级玩家";
    }
    public PrimaryLevel(Player player) {
        this.player=player;
        this.stateName="入门级玩家";
        this.point=0;
    }
    public void doubleScore(int score){
        System.out.println("对不起"+player.getName()+",您没有获胜双倍积分的权利");
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
