package com.services;

import com.models.GroupBorrower;
import com.models.SingleBorrower;

import java.util.List;

public interface BorrowersServiceInterface {
    String addGroupBorrowers(GroupBorrower payload);

    String addSingleBorrower(SingleBorrower payload);

    List<SingleBorrower> viewSingleBorrowers();

    List<GroupBorrower> viewGroupBorrowers();
}
