package com.lc.queue.controller;

import com.lc.queue.config.ThreadPoolManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther : lc
 * @Date: 2019/1/16 10:28
 * @Description:
 */
@Controller
public class ThreadPoolController {

    @Autowired
    ThreadPoolManager tpm;

    @RequestMapping("/pool")
    public
    @ResponseBody
    Object test() {
        for (int i = 0; i < 100; i++) {
            //模拟并发500条记录
            tpm.processOrders(Integer.toString(i));
        }

        return "ok";
    }
}
