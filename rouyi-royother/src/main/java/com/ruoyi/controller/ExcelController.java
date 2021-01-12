package com.ruoyi.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.ruoyi.entity.LoginRecordEntity;

import com.ruoyi.entity.SysLogininfor;
import com.ruoyi.service.LogininforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lirenwei
 * @date 2021/1/11 16:40
 * excel的导入和导出controller
 */
@RestController
@RequestMapping("/royli/loginfor")
public class ExcelController {




    @Autowired
    private LogininforService logininforService;


    /**
     * 导出登陆日志excel
     */
    @GetMapping("/exportExcel")
    public void exportExcel(SysLogininfor sysLogininfor, HttpServletResponse response) throws IOException {


        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            //防止中文乱码
            String fileName = URLEncoder.encode("demo", "UTF-8").replaceAll("\\+", "%20");

            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");


            // 设置不关闭流 导出根据当前查询条件查询到的数据,导出全部,不需要分页,导出时注册自适应表格宽度的类
            EasyExcel.write(response.getOutputStream(), LoginRecordEntity.class).autoCloseStream(Boolean.FALSE).sheet("sheet1")
                    .doWrite(logininforService.selectLogininforList(sysLogininfor));

        } catch (Exception e) {
            // 重置response
            response.reset();
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            Map<String, String> map = new HashMap<String, String>();
            map.put("status", "failure");
            map.put("message", "下载文件失败" + e.getMessage());
            response.getWriter().println(JSON.toJSONString(map));
        }

    }











}
