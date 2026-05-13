package com.framework.ioc;

import com.domain.testPost.repository.TestPostRepository;
import com.domain.testPost.service.TestFacadePostService;
import com.domain.testPost.service.TestPostService;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
    private String basePackage;
    private Map<String, Object> beans;

    public ApplicationContext(String basePackage) {
        this.basePackage = basePackage;
        this.beans = new HashMap<>();
    }

    public void init() {

    }

    public <T> T genBean(String beanName) {
        Object bean = beans.get(beanName);

        if (bean == null) {
            bean = switch (beanName) {
                case "testPostService" -> new TestPostService(genBean("testPostRepository"));
                case "testPostRepository" -> new TestPostRepository();
                case "testFacadePostService" -> new TestFacadePostService(
                        genBean("testPostService"),
                        genBean("testPostRepository"));
                default ->  null;
            };
            beans.put(beanName, bean);
        }
        return (T) bean;
    }
}
