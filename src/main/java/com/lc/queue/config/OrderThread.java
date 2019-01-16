package com.lc.queue.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * 线程池中工作的线程
 * @auther : lc
 * @Date: 2019/1/16 10:30
 * @Description:
 */
@Component
@Scope("prototype")//spring 多例
public class OrderThread  implements Runnable{

    private String msg;
    private Logger log = LoggerFactory.getLogger(OrderThread.class);




    @Override
    public void run() {
        //模拟在数据库插入数据
        log.info("insert->  做订单处理" + msg);
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
