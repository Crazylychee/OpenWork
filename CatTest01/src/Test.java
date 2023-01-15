import java.util.Scanner;

/**
 * @author yc
 * @date 2023/1/14 16:34
 */
public class Test {
    public static void main(String[] args) {
        Hero BaiLi = new Hero();
        BaiLi.setName("百里守约");
        Hero YaSe = new Hero();
        YaSe.setName("亚瑟");
        Hero temp1 = new Hero();
        Hero temp2 = new Hero();
        int cnt = 0;
        do {
            if((cnt%2)==0){
                temp1=BaiLi;
                temp2=YaSe;
            }else{
                temp1=YaSe;
                temp2=BaiLi;
            }
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input){
                case 1:
                    temp1.bisicAttack(temp1,temp2);
                    break;
                case 2:
                    temp1.skill(temp1,temp2);
                    break;
                case 3:
                    Armor.attack(temp1);
                    break;
                case 4:
                    Weapon.defend(temp1);
                    break;
                default:
                    System.out.println("您输入错误，请重新输入！！");
                    break;
            }
            cnt=cnt + 1;
        } while (YaSe.getHp()>0&&BaiLi.getHp()>0);
        if(YaSe.getHp()<0){
            System.out.println("百里守约赢得比赛~~");
        } else{
            System.out.println("亚瑟赢得比赛~~");
        }
    }
}
