package com.ruoyi.common;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author lirenwei
 * @date 2021/1/11 16:42
 * 导入excel监听类
 */
public class EaseExcelListener extends AnalysisEventListener<T> {

    


    @Override
    public void invoke(T t, AnalysisContext analysisContext) {

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
