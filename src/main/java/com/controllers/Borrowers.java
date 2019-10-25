package com.controllers;

import com.entity.SingleBorrower;
import com.models.GroupBorrower;
import com.services.BorrowersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Borrowers {

    @Autowired
    BorrowersServiceInterface borrowersServiceInterface;

    @ResponseBody
    @GetMapping(path = "/")
    public String ping(){
        return "ping successfull";
    }

    @ResponseBody
    @GetMapping(path = "viewBorrowers")
    public String viewSingleBorrowers(){
        return "ping successfull";
    }

    @ResponseBody
    @GetMapping(path = "/viewBorrowersGroup")
    public String viewBorrowersGroup(){
        return "ping successfull";
    }

    @ResponseBody
    @PostMapping(path = "/addSingleBorrowers")
    public String addSingleBorrowers(@RequestBody SingleBorrower payload){
        return "ping successfull";
    }

    @ResponseBody
    @PostMapping(path = "/addGroupBorrowers")
    public String addGroupBorrowers(@RequestBody GroupBorrower payload){
        return "ping successfull";
    }

    @ResponseBody
    @PostMapping(path = "/smsToAllBorrowers")
    public String smsToAllBorrowers(){
        return "Not Available For Now";
    }

    @ResponseBody
    @PostMapping(path = "/emailToAllBorrowers")
    public String emailToAllBorrowers(){
        return "Not Available For Now!";
    }

    @ResponseBody
    @PostMapping (path = "/inviteBorrowers")
    public String inviteBorrowers(){
        return "ping successfull";
    }

}

















































