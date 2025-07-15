package com.Satya.SpringWeb.FirstWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControler {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int result=num1+num2;
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }

//    @RequestMapping("add")                                        // Using Spring BOOT
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
//
//        int result=num+num2;
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }


    @RequestMapping("add")                                        // Using Spring BOOT without Session and without .jsp
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {

        int result=num+num2;
        mv.addObject("result",result);
        mv.setViewName("result");


        return mv;
    }

}


