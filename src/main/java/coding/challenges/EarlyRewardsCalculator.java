package coding.challenges;

import java.util.ArrayList;
import java.util.List;

public class EarlyRewardsCalculator {


    public static void main(String[] args) {
        System.out.println(calculateRewards(400000,5));
    }

    private static double calculateRewards(double amount, int th) {
        th = th - 1;
        List<Double> threshold = new ArrayList<Double>(){{
            add(500000.00);add(1000000.0);add(2000000.0);add(5000000.0);
            add(10000000.0);add(20000000.0);add(30000000.0);add(50000000.0);add(100000000.0);
        }};
        List<Double> rewards = new ArrayList<Double>(){{
            add(45767.0);add(91533.0);add(183066.0);add(457666.0);
            add(915332.0);add(1830664.0);add(2745995.0);add(4576659.0);add(9153318.0);
        }};
        double net_reward = 0;
        for (int i = th; i < 9; i++) {
            double threshold_reward = (amount / threshold.get(i)) * (rewards.get(i));
            System.out.println("When total staked is less than: " + Math.round(threshold.get(i)) +  " i.e. Threshold: "  + i + ", rewards: " + Math.round(threshold_reward));
            net_reward += threshold_reward;
            amount += threshold_reward;
        }
        return Math.round(net_reward);
    }
}
