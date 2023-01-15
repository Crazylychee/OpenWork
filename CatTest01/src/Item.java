import java.util.Random;

/**
 * @author yc
 * @date 2023/1/15 1:51
 */
public class Item {
    /**
     * 穿戴使英雄的HP提高
     */
    public static void defend(Hero a){
        Random r = new Random();
        int increaseHp = r.nextInt(10,40);
        a.setHp(a.getHp()+increaseHp);
        System.out.println(a + "装备防具，Hp加"+increaseHp);
    }
    /**
     * 穿戴使英雄的MP提高
     */
    public static void attack(Hero a){
        Random r = new Random();
        int increaseMp = r.nextInt(10,40);
        a.setHp(a.getHp()+increaseMp);
        System.out.println(a + "装备防具，Hp加"+increaseMp);
    }
}
