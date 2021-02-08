package com.george.springcloud.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.george.springcloud.domain.DepartmentDomain;
import com.george.springcloud.entities.CommonResult;
import com.george.springcloud.entities.Payment;
import com.george.springcloud.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version:
 * @author: liam
 * @className: DepartmentController.java
 * @packageName: com.george.springcloud.controller
 * @description:
 * @date: 2021/2/7 11:03
 **/
@RestController
@Slf4j
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/department/get")
    public CommonResult<Payment> getDepartment() {
        System.out.println("test0");
        List<String> payment = departmentService.getAllCode();
        log.info("-------------查询结果:[{}]", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,端口号: " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录 ", null);
        }
    }

    @GetMapping(value = "/department/delete/{id}")
    public CommonResult<Payment> deleteDepartmentById(@PathVariable("id") Long id) {
        System.out.println("test1");
        boolean flag = departmentService.deleteDepartmentById(id);
        //log.info("-------------查询结果:[{}]", payment);
        if (flag) {
            return new CommonResult(200, "删除成功,端口号: " + serverPort, flag);
        } else {
            return new CommonResult(444, "没有对应记录 ", null);
        }
    }

    @GetMapping(value = "/department/delete2/{code}")
    public CommonResult<Payment> deleteDepartmentByCode(@PathVariable("code") String code) {
        System.out.println("test2");
        boolean flag = departmentService.deleteDepartmentByCode(code);
        //log.info("-------------查询结果:[{}]", payment);
        if (flag) {
            return new CommonResult(200, "删除成功,端口号: " + serverPort, flag);
        } else {
            return new CommonResult(444, "没有对应记录 ", null);
        }
    }

    @GetMapping(value = "/department/delete3/{name}")
    public CommonResult<Payment> deleteDepartmentByName(@PathVariable("name") String name) {
        System.out.println("test3");
        boolean flag = departmentService.deleteDepartmentByName(name);
        //log.info("-------------查询结果:[{}]", payment);
        if (flag) {
            return new CommonResult(200, "删除成功,端口号: " + serverPort, flag);
        } else {
            return new CommonResult(444, "没有对应记录 ", null);
        }
    }

    @PostMapping(value = "/department/insert")
    public CommonResult<Payment> increaseDepartment( DepartmentDomain departmentDomain) {
        System.out.println("test4");
        boolean flag = departmentService.increaseDepartment(departmentDomain);
        //log.info("-------------查询结果:[{}]", payment);
        if (flag) {
            return new CommonResult(200, "插入成功,端口号: " + serverPort, departmentDomain);
        } else {
            return new CommonResult(444, "插入失败 ", null);
        }
    }

    @PostMapping(value = "/department/update")
    public CommonResult<Payment> updateDepartment( DepartmentDomain departmentDomain) {
        System.out.println("test5");
        boolean flag = departmentService.updateDepartment(departmentDomain);
        //log.info("-------------查询结果:[{}]", payment);
        if (flag) {
            return new CommonResult(200, "更新成功,端口号: " + serverPort, departmentDomain);
        } else {
            return new CommonResult(444, "没有对应记录 ", null);
        }


    }


}