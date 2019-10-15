package com.ee.homework.model;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void equalTest() {
        User user = new User();
        user.setEmail("t1@gmail.com")
                .setFirstName("abc")
                .setLastName("xyz");

        User userTest = new User();
        userTest.setEmail("t2@gmail.com")
                .setFirstName("abc")
                .setLastName("xyz");

        Assert.assertTrue(user.equals(userTest));
    }

    @Test
    public void notEqualTest() {
        User user = new User();
        user.setEmail("t1@gmail.com")
                .setFirstName("abc")
                .setLastName("xyz");

        User userTest = new User();
        userTest.setEmail("t2@gmail.com")
                .setFirstName("xyz")
                .setLastName("abc");

        Assert.assertTrue(!user.equals(userTest));
    }
}
