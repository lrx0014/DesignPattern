package h24_State;

/**
 * 玩家实体类
 * @author gong
 *
 */
public class Player {
    private AbstractLevel level;
    private String name;
    private boolean isSuccess;
    public Player(String name) {
        this.level=new PrimaryLevel(this);
        this.name = name;
    }
    public boolean isSuccess() {
        return isSuccess;
    }
    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public AbstractLevel getLevel() {
        return level;
    }
    public void setLevel(AbstractLevel level) {
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void play(int score){
        level.play(score);
    }
    public void doubleScore(int score){
        level.doubleScore(score);
    }
    public void changeCards(int score){
        level.changeCards(score);
    }
    public void peekCards(int score){
        level.peekCards(score);
    }
}
