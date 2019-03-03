package com.example.winter.controller;

import com.example.winter.common.Result;
import com.example.winter.entity.user.Menu;
import com.example.winter.service.user.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Flux;
import reactor.netty.http.server.HttpServerRequest;

import java.util.List;

@RestController
@RequestMapping("index")
@Slf4j
public class IndexController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public Result index(ServerRequest request) {
        log.info("sessionId" + request.session()+ ",");
        return new Result(Result.ResultFlag.SUCCESS, "" + request.cookies());
    }

    @GetMapping("findAllMenus")
    public Flux<Menu> findAllMenus() {
        List<Menu> menus = menuService.findAll(2L);
        menus = null;
        return Flux.fromIterable(menus);
    }
}
