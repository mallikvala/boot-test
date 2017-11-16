package com.procorp.api.procorppoc.resources;

import com.procorp.api.procorppoc.models.Account;
import com.procorp.api.procorppoc.models.User;
import com.procorp.api.procorppoc.services.ProcorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Predicate;

@RestController
@RequestMapping(value = "/details")
public class UtilResources {

    @Autowired
    ProcorpService procorpService;

    @GetMapping(path = "/user/{userId}")
    public User getUserDetails(@PathVariable String userId){
        return procorpService.getUserAccounts(userId);
    }

    @GetMapping(path = "/user/{userId}/account/{accountId}")
    public Account getAccountDetails(@PathVariable String userId, @PathVariable String accountId){
        Predicate<Account> accountPredicate = account -> account.getAccountNumber().equals(accountId);
        return procorpService.getUserAccounts(userId).getAccounts().stream().filter(accountPredicate).findFirst().get();
    }

}
