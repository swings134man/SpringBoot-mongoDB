//package com.using.mongo.batis_sample.controller;
//
//import com.using.mongo.batis_sample.dao.CustDAO;
//import com.using.mongo.batis_sample.dto.CustMgmtDTO;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///************
// * @info : MyBatis Controller
// * @name : CustController
// * @date : 2023/03/24 2:34 AM
// * @author : SeokJun Kang(swings134@gmail.com)
// * @version : 1.0.0
// * @Description :
// ************/
//@RestController
//@RequiredArgsConstructor
//@Slf4j
//public class CustController {
//
//    private final CustDAO dao;
//
//    @GetMapping("/v1/get")
//    public CustMgmtDTO getOne(@RequestParam String custId) {
//        CustMgmtDTO inDTO = new CustMgmtDTO();
//        inDTO.setCustId(custId);
//
//        CustMgmtDTO one = dao.getOne(inDTO);
//        return one;
//    }
//
//}
