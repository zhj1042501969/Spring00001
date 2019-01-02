package com.didi;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



@Configuration
@Import(value = {CDConfig.class, CDPlayerConfig.class})
//@Import(CDPlayerConfig.class)
//@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {

}
