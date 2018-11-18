package com.icinfo.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月18
 */

@Controller
@Slf4j
public class TestControler {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Test Controler";
    }
}
