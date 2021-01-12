package com.ruoyi.service.impl;

import com.ruoyi.entity.SysLogininfor;
import com.ruoyi.mapper.LogininforMapper;
import com.ruoyi.service.LogininforService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统访问日志情况信息 服务层处理
 * 
 * @author ruoyi
 */
@Service
public class LogininforServiceImpl implements LogininforService
{

    @Autowired
    private LogininforMapper logininforMapper;


    /**
     * 查询系统登录日志集合
     *
     * @param logininfor 访问日志对象
     * @return 登录记录集合
     */
    @Override
    public List<SysLogininfor> selectLogininforList(SysLogininfor logininfor) {
        return logininforMapper.selectLogininforList(logininfor);
    }
}
