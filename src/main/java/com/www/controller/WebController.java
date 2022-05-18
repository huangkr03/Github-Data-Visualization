package com.www.controller;

import com.www.util.GetValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class WebController {

    public static GetValue getValue = new GetValue();

    @RequestMapping("/")
    public String index() {
        return "bar-race-git";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return "helloWorld";
    }

    @ResponseBody
    @RequestMapping("/data")
    public String jsonString() {
        return "[{\"demo\": 123}]";
    }

    @ResponseBody
    @RequestMapping("/????")
    public String year() {
        return null;
    }

    @ResponseBody
    @RequestMapping("/????/*")
    public String year_month() {
        return "Demo";
    }
}
