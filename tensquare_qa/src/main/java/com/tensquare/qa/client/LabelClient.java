package com.tensquare.qa.client;

import com.tensquare.qa.client.impl.LabelClientImpl;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author：liuzhongyu
 * @Date: 2019/12/16 21:53
 * @Description:
 */

@FeignClient(value="tensquare-base",fallback = LabelClientImpl.class)
public interface LabelClient {

    @RequestMapping(value = "/label/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable("id") String id);
}
