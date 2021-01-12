package com.ruoyi.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author lirenwei
 * @date 2021/1/11 16:49
 */
@Data
public class LoginRecordEntity {

    /**
     * 访问编号
     */
    @ExcelProperty(value = "访问编号")
    private String infoId;

    /**
     * 用户名称
     */
    @ExcelProperty(value = "用户名称")
    private String userName;

    /**
     * 登陆地址
     */
    @ExcelProperty(value = "登陆地址")
    private String ipaddr;

    /**
     * 登陆地点
     */
    @ExcelProperty(value = "登陆地点")
    private String loginLocation;

    /**
     * 浏览器
     */
    @ExcelProperty(value = "浏览器")
    private String browser;

    /**
     * 操作系统
     */
    @ExcelProperty(value = "操作系统")
    private String os;

    /**
     * 登陆状态
     */
    @ExcelProperty(value = "登陆状态")
    private String status;

    /**
     * 操作信息
     */
    @ExcelProperty(value = "操作信息")
    private String msg;

    /**
     * 登陆日期
     */
    @ExcelProperty(value = "登陆日期")
    private String loginTime;



}
