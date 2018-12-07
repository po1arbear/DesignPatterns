package com.orangeaterz.lib;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("org.simple.injector.anno.*")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class ViewInjectorProcessor extends AbstractProcessor {
    //所有注解处理器的列表

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        return false;
    }
}
