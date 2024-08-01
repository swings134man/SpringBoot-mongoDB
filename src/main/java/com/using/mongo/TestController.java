//package com.using.mongo;
//
//import com.lucas.converter.util.ConvertUtil;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletResponse;
//
//@RestController("test/")
//@RequiredArgsConstructor
//public class TestController {
//
//    private final ConvertUtil convertUtil;
//
//    @GetMapping("excel")
//    public void name(HttpServletResponse response) throws Exception {
//        convertUtil.toExcel("http://localhost:8080/v2/api-docs", response);
//    }
//
//}
