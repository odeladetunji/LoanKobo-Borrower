package com.services;


import com.config.BeanGenerator;
import com.dao.GroupBorrowersRepository;
import com.dao.SingleBorrowerRepository;
import com.factory.AbstractFactory;
import com.factory.ProducerFactory;
import com.models.GroupBorrower;
import com.models.SingleBorrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EndPoint implements BorrowersServiceInterface{

   @Autowired
   SingleBorrowerRepository singleBorrowerRepository;

   @Autowired
   GroupBorrowersRepository groupBorrowersRepository;

   BeanGenerator groupBorrower;

   public BeanGenerator groupBorrowerBean(GroupBorrower payload){
      groupBorrower.groupBorrower().companyName = payload.companyName;
      groupBorrower.groupBorrower().country = payload.country;
      groupBorrower.groupBorrower().currency = payload.currency;
      groupBorrower.groupBorrower().email = payload.email;
      groupBorrower.groupBorrower().firstName = payload.firstName;
      groupBorrower.groupBorrower().lastName = payload.password;
      groupBorrower.groupBorrower().password = payload.password;
      groupBorrower.groupBorrower().timeZone = payload.timeZone;

      return groupBorrower;
   }

   public BeanGenerator singleBorrower(SingleBorrower payload){
      groupBorrower.singleBorrower().companyName = payload.companyName;
      groupBorrower.singleBorrower().country = payload.country;
      groupBorrower.singleBorrower().currency = payload.currency;
      groupBorrower.singleBorrower().email = payload.email;
      groupBorrower.singleBorrower().firstName = payload.firstName;
      groupBorrower.singleBorrower().lastName = payload.firstName;
      groupBorrower.singleBorrower().timeZone = payload.timeZone;
      groupBorrower.singleBorrower().password = payload.password;

      return groupBorrower;
   }


   @Override
   public String addGroupBorrowers(GroupBorrower payload){
      try {
         groupBorrowersRepository.save(groupBorrowerBean(payload).groupBorrower());
         return "successully added";
      }catch (Exception ex){
         return "unsuccessfull";
      }
   }

   @Override
   public String addSingleBorrower(SingleBorrower payload){
      try {
         singleBorrowerRepository.save(singleBorrower(payload).singleBorrower());
         return "successfull added";
      }catch (Exception ex){
         return "unsuccessfull";
      }
   }

   @Override
   public List<SingleBorrower> viewSingleBorrowers(){
      Iterable<com.entity.SingleBorrower> result = singleBorrowerRepository.findAllByLastName();
      if (((List<com.entity.SingleBorrower>) result).isEmpty()) return  new ArrayList<>();
      AbstractFactory entityFactory = ProducerFactory.newEntityFactory();
      SingleBorrower aSingleBorrowwer = entityFactory.getSingleBorrower();

      for (com.entity.SingleBorrower aBorrower: result){
         aSingleBorrowwer.firstName = aBorrower.firstName;
         aSingleBorrowwer.lastName = aBorrower.lastName;
         aSingleBorrowwer.companyName = aBorrower.companyName;
         aSingleBorrowwer.country = aBorrower.country;
         aSingleBorrowwer.currency = aBorrower.currency;
         aSingleBorrowwer.email = aBorrower.email;
         aSingleBorrowwer.password = aBorrower.password;
         aSingleBorrowwer.timeZone = aBorrower.timeZone;
      }

      List<SingleBorrower> theResult = new ArrayList<>();
      theResult.add(aSingleBorrowwer);
      return theResult;
   }

   @Override
   public List<GroupBorrower> viewGroupBorrowers(){
      Iterable<com.entity.GroupBorrower> result = groupBorrowersRepository.findAllByLastName();
      if (((List<com.entity.GroupBorrower>) result).isEmpty()) return new ArrayList<>();
      AbstractFactory entityFactory = ProducerFactory.newEntityFactory();
      GroupBorrower aGroupBorrower = entityFactory.getGroupBorrower();

      for (com.entity.GroupBorrower aborrower: result){
         aGroupBorrower.firstName = aborrower.firstName;
         aGroupBorrower.lastName = aborrower.lastName;
         aGroupBorrower.companyName = aborrower.companyName;
         aGroupBorrower.country = aborrower.country;
         aGroupBorrower.currency = aborrower.currency;
         aGroupBorrower.email = aborrower.email;
         aGroupBorrower.password = aborrower.password;
         aGroupBorrower.timeZone = aborrower.timeZone;
      }

      List<GroupBorrower> theResult = new ArrayList<>();
      theResult.add(aGroupBorrower);
      return theResult;
   }
}





