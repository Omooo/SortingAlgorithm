package top.omooo.sort.DailyPractice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 抢红包，随机金额
 * https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653193719&idx=1&sn=64f184d36af9ef6393998fe5ea79329c&chksm=8c99f72dbbee7e3b3f00e067613c15144ce3624782161bd668ac57943d6aa198f1cebed8a050&scene=0#rd
 */
public class DividePackage {
    private static List<Integer> divider(int totalMoney, int totalPeople) {
        List<Integer> amountList = new ArrayList<>();
        int restMoney = totalMoney;
        int restPeople = totalPeople;
        Random random = new Random();
        for (int i = 0; i < totalPeople - 1; i++) {
            int amount = random.nextInt(restMoney / restPeople * 2) + 1;
            restMoney -= amount;
            restPeople--;
            amountList.add(amount);
        }
        amountList.add(restMoney);
        return amountList;
    }

    public static void main(String[] args) {
        List<Integer> amounts = divider(1000, 10);
        int total = 0;
        for (int amount : amounts) {
            System.out.println("领取金额为：" + new BigDecimal(amount).divide(new BigDecimal(100)));
            total += amount;
        }
        System.out.println("总共金额：" + total);
    }

}
