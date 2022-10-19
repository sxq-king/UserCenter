package com.sxq.usercenter.service;

import com.sxq.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author sxq
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2022-08-22 08:45:12
*/
public interface UserService extends IService<User> {


    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param planetCode 星球编号
     * @return 新用户id
     */
    long userRegistry(String userAccount,String userPassword,String checkPassword,String planetCode);

    /**
     * 用户登录
     * @param userAccount 账号
     * @param userPassword 密码
     * @return （脱敏后）用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     * @param originUser
     * @return 脱敏后用户信息
     */
    User getSafetyUser(User originUser);

    /**
     * 用户退出
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
