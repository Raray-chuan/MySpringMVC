package com.xichuan.framework.helper;


import com.xichuan.framework.interfaces.BeanPostProcessor;

import java.util.ArrayList;

/**
 * @Author Xichuan
 * @Date 2022/5/7 11:25
 * @Description
 */

/**
 * Bean定义信息
 */
public class BeanDefinition {
    //Class
    private Class clazz;
    //Bean名词
    private String BeanName;
    //是否是Controller注解
    private  boolean isController=false;
    //作用域1、singleton 2、prototype
    private String scope;
    //根据扩容原理，如果不添加元素，永远是空数组不占用空间
    private ArrayList<BeanPostProcessor> beanPostProcessors=new ArrayList<>();


    public boolean isController() {
        return isController;
    }

    public void setIsController(boolean controller) {
        this.isController = controller;
    }

    public String getBeanName() {
        return BeanName;
    }

    public void setBeanName(String beanName) {
        BeanName = beanName;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public ArrayList<BeanPostProcessor> getBeanPostProcessors() {
        return beanPostProcessors;
    }

    public void setBeanPostProcessors(ArrayList<BeanPostProcessor> beanPostProcessors) {
        this.beanPostProcessors = beanPostProcessors;
    }
}
