package net.cc.zzh.yydiscoveryprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhonghua.zhi
 * @version 1.0
 * @classname HelloController
 * @date 2020-01-05 11:57
 * @description TODO
 */
@RestController
public class HelloController {

    @GetMapping("/demo")
    public String sayHello(String name) {

        System.out.println(getSysTime() + " ThreadId " + Thread.currentThread().getId() + " name " + name);
        return "Hello " + name;
    }

    /**
     * 功能描述:
     *
     * @param
     * @return: java.lang.String
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2020/1/5 11:59 上午
     */
    private String getSysTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date()).toString();
    }
}