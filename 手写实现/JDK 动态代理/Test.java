package com.lkp.demo.test.two.five.three.gp;

/**
 * @author: LKP
 * @date: 2020/3/11
 */
public class Test {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
