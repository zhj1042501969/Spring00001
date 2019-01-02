package com.habuma;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //getEnvironment 检查环境变量是否存在以及他的值是什么。
        Environment env = context.getEnvironment();
        return env.containsProperty("magic");
    }

}
