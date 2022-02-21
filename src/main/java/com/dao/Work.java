package com.dao;

import java.util.Date;

/**
 * 工作类
 */
public class Work {
    // 工作名称
    private String workName;
    // 工作内容
    private String workContent;
    // 工作时间
    private Date date;

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
