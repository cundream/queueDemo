package com.lc.queue;

import com.lc.queue.config.MyApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @auther : lc
 * @Date: 2019/1/16 10:41
 * @Description:
 */
@SpringBootApplication
public class OrderQueueApplication {
    public static void main(String[] args) {
        SpringApplication st =  new  SpringApplication(OrderQueueApplication.class);
        st.addListeners(new MyApplicationListener());
        st.run(args);
    }


}
