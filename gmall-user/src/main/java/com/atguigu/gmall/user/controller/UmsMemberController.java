package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.entity.UmsMember;
import com.atguigu.gmall.user.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员表(UmsMember)表控制层
 *
 * @author LiWeiJie
 * @since 2020-07-11 15:19:22
 */
@RestController
@RequestMapping("/umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;


    @RequestMapping("/queryAll")
    public List<UmsMember> queryAll() {
        return this.umsMemberService.queryAll();
    }

}