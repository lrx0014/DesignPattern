package h24_State;

/**
 * ����״̬��
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
        System.out.println(player.getName()+"ӵ��"+this.point+"���֣���ʼ��ֽ����Ϸ");
        if(player.isSuccess()==true){
            this.point+=score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("�����Ѿ���ͣ��������ٿ۷���");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"����ƴ��߯���ˣ�Ӯ��һ������":"ͬ־����Ŭ��������һ������");
        checkState(score);
        System.out.println("����ʣ�ࣺ"+this.point+"����ǰ����"+player.getLevel().getStateName());
    }
    public void doubleScore(int score){
        System.out.println(player.getName()+"ӵ��"+this.point+"���֣���Ϸʤ�����Ի��ּӱ�");
        if(player.isSuccess()==true){
            this.point+=2*score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("�����Ѿ���ͣ��������ٿ۷���");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"����ƴ��߯���ˣ�Ӯ��һ������":"ͬ־����Ŭ��������һ������");
        checkState(score);
        System.out.println("����ʣ�ࣺ"+this.point+"����ǰ����"+player.getLevel().getStateName());
    }
    public void changeCards(int score){
        System.out.println(player.getName()+"ӵ��"+this.point+"���֣����Ժ�������һ���");
        if(player.isSuccess()==true){
            this.point+=score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("�����Ѿ���ͣ��������ٿ۷���");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"����ƴ��߯���ˣ�Ӯ��һ������":"ͬ־����Ŭ��������һ������");
        checkState(score);
        System.out.println("����ʣ�ࣺ"+this.point+"����ǰ����"+player.getLevel().getStateName());
    }
    public void peekCards(int score){
        System.out.println(player.getName()+"ӵ��"+this.point+"���֣�����͵�����˵���");
        if(player.isSuccess()==true){
            this.point+=score;
        }
        else if(point>score&&player.isSuccess()==false){
            System.out.println("�����Ѿ���ͣ��������ٿ۷���");
        }
        else if(player.isSuccess()==false){
            this.point-=score;
        }
        System.out.println(player.isSuccess()==true?"����ƴ��߯���ˣ�Ӯ��һ������":"ͬ־����Ŭ��������һ������");
        checkState(score);
        System.out.println("����ʣ�ࣺ"+this.point+"����ǰ����"+player.getLevel().getStateName());
    }

}
