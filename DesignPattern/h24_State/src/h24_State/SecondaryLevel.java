package h24_State;

/**
 * 具体状态类
 * @author gong
 *
 */

public class SecondaryLevel extends AbstractLevel {
    public SecondaryLevel(AbstractLevel level) {
        this.player=level.player;
        this.point=level.getPoint();
        this.stateName="熟练级玩家";
    }
    public void changeCards(int score){
        System.out.println("对不起"+player.getName()+",您没有换牌的权利");
    }
    public void peekCards(int score){
        System.out.println("对不起"+player.getName()+",您没有偷看别人牌的权利");
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
