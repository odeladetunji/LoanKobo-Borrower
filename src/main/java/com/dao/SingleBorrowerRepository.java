package com.dao;

import com.entity.SingleBorrower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SingleBorrowerRepository extends CrudRepository<SingleBorrower, Long> {
    List<SingleBorrower> findAllByLastName();
}
