package com.framework.ioc;

import com.domain.testPost.service.TestPostService;

public class ApplicationContext {
    private String basePackage;
    private TestPostService testPostService;

    public ApplicationContext(String basePackage) {
        this.basePackage = basePackage;
        this.testPostService = new TestPostService();
    }

    public void init() {

    }

    public <T> T genBean(String beanName) {
        if(beanName.equals("testPostService")){
            return (T) testPostService;
        }
        return null;
    }
}
