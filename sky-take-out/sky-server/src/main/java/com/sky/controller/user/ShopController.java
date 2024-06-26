package com.sky.controller.user;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: sky_test
 * @BelongsPackage: com.sky.controller.user
 * @Author: X_X
 * @Description: 用户端
 * @Version: 1.0
 */
@RestController("userShopController")
@RequestMapping("/user/shop")
@Api(tags = "店铺相关操作")
@Slf4j
public class ShopController {
    public static final String KEY_SHOP_STATUS = "shop_status";
    @Autowired
    RedisTemplate redisTemplate;



    @GetMapping("/status")
    @ApiOperation("查询店铺状态")
    public Result<Integer> getStatus(){
        Integer status = (Integer) redisTemplate.opsForValue().get(KEY_SHOP_STATUS);
        log.info("查询店铺状态:{}",status);
        return Result.success(status);

    }

}