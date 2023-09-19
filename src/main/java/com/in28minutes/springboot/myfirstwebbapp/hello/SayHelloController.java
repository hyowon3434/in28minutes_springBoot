package com.in28minutes.springboot.myfirstwebbapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("say-Hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?????";
    }

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    // sayHello.jsp
    // "say-hello-jsp" -> sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
