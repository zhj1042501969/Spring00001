package com.habuma;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;


public class ProfileCondition implements Condition {
    public boolean matches(
            ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (context.getEnvironment() != null) {
            //获取@profile注解的所有属性
            MultiValueMap<String, Object> attrs =
                    metadata.getAllAnnotationAttributes(Profile.class.getName());
            if (attrs != null) {
                for (Object value : attrs.get("value")) {
                    //acceptsProfiles 方法检查profile是否处于激活
                    if (context.getEnvironment()
                            .acceptsProfiles(((String[]) value))) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }
}

