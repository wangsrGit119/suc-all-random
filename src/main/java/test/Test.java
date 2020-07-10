package test;


import utils.RandomPersonInfoUtil;

import java.time.LocalDateTime;

public class Test {



    public static void main(String[] args) {
        for (int i = 0; i < 400; i++) {
            System.out.println(RandomPersonInfoUtil.getEmail());
        }

    }

}
