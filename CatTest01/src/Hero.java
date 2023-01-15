import java.util.Random;

/**
 * @author yc
 * @date 2023/1/14 16:30
 */
public class Hero {
    private String name;
    private int Hp;
    private int Mp;

    public Hero(){

    }

    public Hero(String name) {
        this.name = name;
        Hp = 100;
        Mp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMp() {
        return Mp;
    }

    public void setMp(int mp) {
        Mp = mp;
    }

    /**
     * 普攻方法
     * @param a1 施法方
     * @param a2 被攻击方
     */
    public void bisicAttack(Hero a1,Hero a2){
        Random r = new Random();
        int loseHp = r.nextInt(10,30);
        a2.setHp(a2.getHp()-loseHp);
        System.out.println(a1.getName()+"释放普通攻击"+a2.getName()+",并扣其生命值 "+loseHp);
    }
    /**
     * 技能方法
     * @param a1 施法方
     * @param a2 被攻击方
     */
    public void skill(Hero a1,Hero a2){
        Random r = new Random();
        int loseHp = r.nextInt(30,50);
        a2.setHp(a2.getHp()-loseHp);
        a1.setMp(a1.getMp()-loseHp);
        System.out.println(a1.getName()+"用Mp点："+loseHp+"释放技能攻击"+a2.getName()+",并扣其生命值 "+loseHp);
    }
}
