package Test;

import utils.RandomPersonInfoUtil;

/**
 * @author WJL
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(RandomPersonInfoUtil.getRandomUrl(7));
        }
    }
}
