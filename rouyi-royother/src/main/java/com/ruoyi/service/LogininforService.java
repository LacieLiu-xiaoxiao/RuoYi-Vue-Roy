package com.ruoyi.service;



import com.ruoyi.entity.SysLogininfor;

import java.util.List;

/**
 * 系统访问日志情况信息 服务层
 * 
 * @author ruoyi
 */
public interface LogininforService
{

    /**
     * 查询系统登录日志集合
     * 
     * @param logininfor 访问日志对象
     * @return 登录记录集合
     */
    public List<SysLogininfor> selectLogininforList(SysLogininfor logininfor);


}
