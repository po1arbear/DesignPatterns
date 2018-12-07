package com.orangeaterz.lib;

import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import java.util.*;

public class ViewInjectHandler implements AnnotationHandler {
    ProcessingEnvironment mProcessingEnv;

    @Override
    public void attachProcessingEnv(ProcessingEnvironment processingEnvironment) {
        this.mProcessingEnv = processingEnvironment;
    }

    @Override
    public Map<String, List<VariableElement>> handleAnnotation(RoundEnvironment roundEnvironment) {
        Map<String, List<VariableElement>> annotationMap = new HashMap<>();
        //1、获取使用ViewInjector注解的所有元素
        Set<? extends Element> elements = roundEnvironment.getElementsAnnotatedWith(ViewInjector.class);
        for (Element element : elements) {
            //2、获取被注解的字段
            VariableElement variableElement = (VariableElement) element;
            //3、获取字段所在类型的完整路径名，如一个TextView所在的完整路径，也就是变量的宿主类
            String className = variableElement.getClass().getName();
            //4、获取这个宿主类型的所有元素，如某个Activity中的所有注解对象
            List<VariableElement> cacheElements = annotationMap.get(className);
            if (cacheElements == null) {
                cacheElements = new LinkedList<>();
            }
            //将元素添加到该类型对应的字段中
            cacheElements.add(variableElement);
            //以宿主类的路径为key，所有字段列表为value，存入map
            //这里是将所在字段按所属的类型进行分类
            annotationMap.put(className, cacheElements);
        }
        return annotationMap;
    }
}
