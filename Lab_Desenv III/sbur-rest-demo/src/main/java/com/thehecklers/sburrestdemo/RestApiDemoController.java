
package com.thehecklers.sburrestdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestApiDemoController {
    @GetMapping("/")
    public String redirectToTeams() {
        return "redirect:/teams";
    }
}
