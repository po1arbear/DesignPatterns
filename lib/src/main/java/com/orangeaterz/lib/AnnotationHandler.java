package com.orangeaterz.lib;

import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.VariableElement;
import java.util.List;
import java.util.Map;

public interface AnnotationHandler {
    //关联ProcessingEnvironment
    void attachProcessingEnv(ProcessingEnvironment processingEnvironment);

    //处理注解,将结果存储到Map中
    Map<String, List<VariableElement>> handleAnnotation(RoundEnvironment environment);
}
