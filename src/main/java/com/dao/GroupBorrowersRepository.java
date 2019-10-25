package com.dao;

import com.entity.GroupBorrower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupBorrowersRepository extends CrudRepository<GroupBorrower, Long> {
    @Override
    Iterable<GroupBorrower> findAll();
    //   List<GroupBorrower> findAllByLastName();
}
