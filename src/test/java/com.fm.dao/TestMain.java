package com.fm.dao;

import com.fm.cache.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018/10/9.
 *
 * @author guochangji
 */
/*//整合junit和spring，让junit在启动时候加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件,需要用到的配置文件，如果是dao的话可以不用spring-service.xml
@ContextConfiguration("classpath:applicationContext.xml")*/
public class TestMain {
    /*@Autowired
    RedisUtil redisUtil;*/

    @Test
    public void testImageService(){

        //redisUtil.hPut("imageId","3","6");
        //System.out.println(redisUtil.hGet("imageCommentList","2"));
        /*String s="#花#清新#植物#早晨#摄影#极简#室内#鲜花#白色#花朵";
        String[] s1=s.substring(1).split("#");
        System.out.println(s1.length);
        for(String s2:s1){
            System.out.println(s2);
        }*/

    }

}
