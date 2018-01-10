package by.epam.makarevich;

import by.epam.makarevich.entity.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Worker {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>(Arrays.asList(new String[]{"Linda", "Max"}));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList(new String[]{"ben", "John"}));
        User firstUser = new User(11, "Alex", new Long("123698712546125464"), new BigDecimal(5559000.256), firstList);
        User secondUser = new User(22, "Donald", new Long("123123456789555"), new BigDecimal(565423.222), secondList);
        User thirdUser = new User(22, "Donald", new Long("123123456789555"), new BigDecimal(565423.222), secondList);
        System.out.println(firstUser.equals(secondUser));
        System.out.println(firstUser.hashCode() == secondUser.hashCode());
        System.out.println(secondUser.equals(thirdUser));
        System.out.println(secondUser.hashCode() == thirdUser.hashCode());
        try {
            firstUser = firstUser.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        firstUser.setId(10);
        System.out.println(firstUser.getId());
        System.out.println(firstUser.toString());
    }
}
