package com.ass.controller;

import com.ass.domin.Dormitory;
import com.ass.domin.SOT;
import com.ass.domin.customer;
import com.ass.sevice.CustomerSave;
import com.ass.sevice.DormitorySave;
import com.ass.sevice.SOTSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Dormitory")
public class webController {

    @Autowired
    private  SOTSave sotSave;
    private DormitorySave dormitorySave;
    private CustomerSave customerSave;


    @RequestMapping(value="/input",method=RequestMethod.GET)
    public String input(){
        return "input";
    }
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public String DMsave(Dormitory dormitory){
        return "succ";
    }
    @RequestMapping(value = "/saveCustomer",method=RequestMethod.GET)
    public String CustomerSave(customer cust){
        customerSave.save(cust);
        return "succ";
    }
    @RequestMapping(value="/registerForm",method = RequestMethod.GET)
    public String registerForm(){
        return "registerForm";
    }
    @RequestMapping("/log")
    public String log(@RequestParam("name")String name,@RequestParam("address")String address,@RequestParam("pNumber")String pNumber,@RequestParam("birth")String birth,@RequestParam("ID")String ID,@RequestParam("password")String password,@RequestParam("sex")String sex,@RequestParam("type")boolean type){
        SOT sot=new SOT( name, address, pNumber,birth,ID, password, sex,type);
        sotSave.save(sot);
        return "succ";
    }
    @RequestMapping("/logSuccess")
    public String logSuccess(@RequestParam("type")boolean type,@RequestParam("ID")String ID,@RequestParam("password")String password){
//        SOTlogin sot=new SOTlogin( ID, password);
//        sotSave.match(sot);
        if(type==true)
        return "studentSelect";
        else return "ownerSubmit";
    }
}

//type=true/&name=wdz&pNumber=17859753244&address=wdz&sex=男&birth=2013-03-26&ID=1231&password=23121