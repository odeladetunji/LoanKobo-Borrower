package com.factory;

import com.models.GroupBorrower;
import com.models.SingleBorrower;

public abstract class AbstractFactory {
    public abstract SingleBorrower getSingleBorrower();
    public abstract GroupBorrower getGroupBorrower();
}
