package com.demo.webui;

import com.demo.base.WebUIBase;
import com.demo.base.WebUITasks;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gloria
 */
public class TestBaiDu extends WebUIBase {
    private Logger logger = Logger.getLogger(TestBaiDu.class);

    @Test
    public void baiduSearch() throws Exception{
        testcaseName = "百度搜索UI自动化测试";
        String checkString = "selenium";

        logger.info("开始运行自动化测试：" + testcaseName);

        //浏览器中打开百度
        logger.info("浏览器中打开百度网站");
        navigation.to("http://www.baidu.com");
        waitBySleepWay(2);

        //输入搜索内容：Selenium
        WebUITasks.inputText(checkString,driver);
        waitBySleepWay(2);

        //单击搜索按钮
        WebUITasks.clickSearchBtn(driver);
        waitBySleepWay(2);

        String browserTitle = driver.getTitle();
        Assert.assertTrue("检查页面标题包含‘" + checkString + "’", browserTitle.contains(checkString ));
    }
}
