package com.java.ratelimiter.controller;

import com.google.common.util.concurrent.RateLimiter;
import com.java.ratelimiter.annotation.ServiceLimit;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: RetelimiterController
 * @PackageName com.java.ratelimiter.controller
 * @Description: TODO
 * @Author ningqian
 * @Date 2019/05/08 19:51
 * @Version V1.0
 */
@RestController
@Log4j2
public class RatelimiterController {

    private RateLimiter rateLimiter = RateLimiter.create(1);

    @GetMapping("/")
    @ServiceLimit
    public String index() {
//        boolean acquire = rateLimiter.tryAcquire(1);
//        log.info("成功");
//        if (!acquire) {
//            log.info("失败！！！！！！！！");
//            return "当前人数过多，请稍后再试";
//        }
        return "抢购成功！";
    }

    @GetMapping("/index")
    @ServiceLimit
    public String index1() {
        return "抢购成功！";
    }


}
