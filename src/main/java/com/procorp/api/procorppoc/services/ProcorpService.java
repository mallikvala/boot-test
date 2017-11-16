package com.procorp.api.procorppoc.services;

import com.procorp.api.procorppoc.models.User;
import com.procorp.api.procorppoc.utils.MockerUtil;
import org.springframework.stereotype.Component;

@Component
public class ProcorpService {
    public User getUserAccounts(String userId){
        return MockerUtil.mockUsers().get(userId);
    }
}
