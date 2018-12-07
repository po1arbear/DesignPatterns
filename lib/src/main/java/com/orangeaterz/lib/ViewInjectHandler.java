package com.orangeaterz.lib;

import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.VariableElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewInjectHandler implements AnnotationHandler {
    ProcessingEnvironment mProcessingEnv;

    @Override
    public void attachProcessingEnv(ProcessingEnvironment processingEnvironment) {
        this.mProcessingEnv = processingEnvironment;
    }

    @Override
    public Map<String, List<VariableElement>> handleAnnotation(RoundEnvironment roundEnvironment) {
        Map<String, List<VariableElement>> annotationMap = new HashMap<>();

        


        return null;
    }
}
