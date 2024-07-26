//package com.using.mongo.first.controller;
//
//import com.using.mongo.first.domain.MemberDTO;
//import com.using.mongo.first.domain.Member_info;
//import com.using.mongo.first.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
///************
// * @info : MongoDB Test - Controller
// * @name : MongoFirstController
// * @date : 2023/03/22 2:06 AM
// * @author : SeokJun Kang(swings134@gmail.com)
// * @version : 1.0.0
// * @Description :
// *
// * - Mono : 0 - 1 개의 데이터
// * - Flux : 0 - N 개의 데이터
// ************/
//@RestController
//@RequiredArgsConstructor
//@Slf4j
//@RequestMapping("/api/test/")
//public class MongoFirstController {
//
//    private final MemberRepository repository;
//
//    /**
//     * Post - save
//     * @param inDTO
//     * @return
//     */
//    @PostMapping("v1/insert/member")
//    public Mono<Member_info> insertMember(@RequestBody MemberDTO inDTO) {
//        log.info("Controller Request Param >>>> {}", inDTO);
//
//        // save & DTO to Entity
////        Member_info save = repository.save(inDTO.toEntity());
//        Mono<Member_info> save = repository.save(inDTO.toEntity());
//
//        log.info("Controller Return Param >>>> {}", save.subscribe(System.out::println));
//        // MessageConverter -> Java Obj to JSON Translate
//        return save;
//    }
//
//    /**
//     * FindAll - Get
//     * @return
//     */
//    @GetMapping("v1/findall/member")
//    public Flux<Member_info> findAll() {
//
//        Flux<Member_info> all = repository.findAll();
//
//        log.info("Controller Return Param >>>> {}", all.subscribe(System.out::println));
//        return all;
//    }
//
//    /**
//     * Update
//     * @param inDTO
//     * @param id
//     * @return
//     */
//    @PutMapping("v1/update/member")
//    public Mono<Member_info> updateMember(@RequestBody MemberDTO inDTO, @RequestParam String id) {
//        // save() 는 id(PK)가 같으면 수정. -> Spring data JPA 와 같음.
//        inDTO.set_id(id);
//        Member_info member_info = inDTO.toEntity();
//
//        Mono<Member_info> save = repository.save(member_info);
//        log.info("Controller Return Param >>>> {}", save.subscribe(System.out::println));
//
//        return save;
//    }
//
//    /**
//     * Delete
//     * @param id
//     * @return
//     */
//    @DeleteMapping("v1/delete/member")
//    public int deleteMember(@RequestParam String id) {
//        // id : pk 값으로 삭제.
//
//        // 내부적으로 실행됨 -> 오류 Exception 발생함.
////        repository.deleteById(id);
//
//        Mono<Void> voidMono = repository.findById(id).flatMap(repository::delete);
//        log.info("Delete Log : {}", voidMono.subscribe(System.out::println));
//
//        // 1 : 성공, -1 : 실패.
//        return 1;
//    }
//
//
//}//class
