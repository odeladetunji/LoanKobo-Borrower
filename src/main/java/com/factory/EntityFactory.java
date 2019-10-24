package com.factory;

import com.models.GroupBorrower;
import com.models.SingleBorrower;

public class EntityFactory extends AbstractFactory{
    @Override
    public SingleBorrower getSingleBorrower(){
        return new SingleBorrower();
    }

    @Override
    public GroupBorrower getGroupBorrower(){
        return new GroupBorrower();
    }
}
