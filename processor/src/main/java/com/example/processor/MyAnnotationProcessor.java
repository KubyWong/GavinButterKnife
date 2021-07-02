package com.example.processor;

import com.example.annotation.MyIntercept;
import com.google.auto.service.AutoService;

import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.JavaFileObject;


@SupportedAnnotationTypes("com.example.annotation.MyIntercept")//设置支持的注解类型
@SupportedSourceVersion(SourceVersion.RELEASE_8)//设置支持的版本
@AutoService(Processor.class)
public class MyAnnotationProcessor extends AbstractProcessor {

/*
    *//**
     * 设置支持的版本
     * 可以通过类注解@SupportedSourceVersion设置
     * @return 这里用最新的就好
     *//*
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }


    *//**
     * 设置支持的注解类型
     * 可以通过类注解@SupportedAnnotationTypes设置
     * @return
     *//*
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        //添加支持的注解
        HashSet<String> set = new HashSet<>();
        set.add(MyIntercept.class.getCanonicalName());
        return set;
    }*/

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        System.out.println("待完成");
        return false;
    }
}
