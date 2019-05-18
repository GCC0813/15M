package com.fm.rabbitmq;

import javax.mail.MessagingException;

/**
 * Created on 2018/11/2.
 */
public interface EmailService {
    //将发送邮件任务存入消息队列

    void sendEmailToUserQueue(String mail,String key);

    //发送邮件

    void sendEmailToUser(String to, String key) throws MessagingException;
}
