package h24_State;

/**
 * 抽象状态类
 * @author gong
 *
 */
public abstract class AbstractLevel {
    protected Player player;
    protected String stateName;
    protected int point;
    public abstract void checkState(int score);

    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public void play(int score){
        System.out.println(player.getName()+"拥有"+this.point+"积分，开始玩纸牌游戏");
        if(player.isSuccess()==true){
            this.point+=score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("分数已经最低，不可以再扣分了");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"你的牌打得忒好了，赢得一场比赛":"同志任需努力，输了一场比赛");
        checkState(score);
        System.out.println("积分剩余："+this.point+"，当前级别："+player.getLevel().getStateName());
    }
    public void doubleScore(int score){
        System.out.println(player.getName()+"拥有"+this.point+"积分，游戏胜利可以积分加倍");
        if(player.isSuccess()==true){
            this.point+=2*score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("分数已经最低，不可以再扣分了");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"你的牌打得忒好了，赢得一场比赛":"同志任需努力，输了一场比赛");
        checkState(score);
        System.out.println("积分剩余："+this.point+"，当前级别："+player.getLevel().getStateName());
    }
    public void changeCards(int score){
        System.out.println(player.getName()+"拥有"+this.point+"积分，可以和其他玩家换牌");
        if(player.isSuccess()==true){
            this.point+=score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("分数已经最低，不可以再扣分了");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"你的牌打得忒好了，赢得一场比赛":"同志任需努力，输了一场比赛");
        checkState(score);
        System.out.println("积分剩余："+this.point+"，当前级别："+player.getLevel().getStateName());
    }
    public void peekCards(int score){
        System.out.println(player.getName()+"拥有"+this.point+"积分，可以偷看他人的牌");
        if(player.isSuccess()==true){
            this.point+=score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("分数已经最低，不可以再扣分了");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"你的牌打得忒好了，赢得一场比赛":"同志任需努力，输了一场比赛");
        checkState(score);
        System.out.println("积分剩余："+this.point+"，当前级别："+player.getLevel().getStateName());
    }

}
