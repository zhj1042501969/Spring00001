package com.didi; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** 
* SoundSystemConfig Tester. 
* 
* @author <Authors name> 
* @since <pre>12/27/2018</pre> 
* @version 1.0 
*/ 
public class SoundSystemConfigTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

    @Test
    public void play(){
        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(SoundSystemConfig.class);
        String[] beanNames = applicationContext2.getBeanDefinitionNames();
        for(int i=0;i<beanNames.length;i++){
            System.out.println("bean名称为==="+beanNames[i]);
        }
    }
} 
