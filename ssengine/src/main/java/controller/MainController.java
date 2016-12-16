package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 此处作为整个搜索的入口
 * Created by scott on 2016/12/16.
 */
@Controller
@RequestMapping("/main")
public class MainController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
