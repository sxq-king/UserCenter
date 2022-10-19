package com.sxq.usercenter.service;

import com.sxq.usercenter.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * 用户服务测试
 *
 * @Auther sxq
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("test");
        user.setUserAccount("123");
        user.setAvatarUrl("https://images.zsxq.com/FmC_3tHKD4X8j3Ur_UBUKreOohuT?e=1664553599&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:yFIoBcQ5v2soSeHth2rjbQ-3850=");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean save = userService.save(user);
        System.out.println(user.getId());
        Assert.assertTrue(save);

    }

    @Test
    public void userRegistry() {
        String userAccount = "yupi";
        String userPassword = "";
        String checkPassword = "123456";
        String planetCode = "1";
        long result = userService.userRegistry(userAccount, userPassword, checkPassword,planetCode);
        Assert.assertEquals(-1,result);

        userAccount = "yu";
        result = userService.userRegistry(userAccount, userPassword, checkPassword,planetCode);
        Assert.assertEquals(-1,result);

        userAccount = "yupi";
        userPassword = "123456";
        result = userService.userRegistry(userAccount, userPassword, checkPassword,planetCode);
        Assert.assertEquals(-1,result);

        userAccount = "yu pi";
        userPassword = "12345678";
        result = userService.userRegistry(userAccount, userPassword, checkPassword,planetCode);
        Assert.assertEquals(-1,result);

        checkPassword = "123456789";
        result = userService.userRegistry(userAccount, userPassword, checkPassword,planetCode);
        Assert.assertEquals(-1,result);

        userAccount = "dogyupi";
        checkPassword = "12345678";
        result = userService.userRegistry(userAccount, userPassword, checkPassword,planetCode);
        Assert.assertEquals(-1,result);

        userAccount = "yupi";
        result = userService.userRegistry(userAccount, userPassword, checkPassword,planetCode);
        Assert.assertTrue(result>0);

    }
}