package com.example.gavin_butterknife_processor;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;


@SupportedAnnotationTypes("com.example.gavin_butterknife_annotation.GavinBindView")//设置支持的注解类型
@SupportedSourceVersion(SourceVersion.RELEASE_8)//设置支持的版本
@AutoService(Processor.class)
public class GavinButterknifeProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        System.out.println("wait to finish GavinButterknifeProcessor...");
        return false;
    }
}

