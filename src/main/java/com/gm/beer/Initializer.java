package com.gm.beer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by gilozoaire on 09.03.17.
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        Class<?>[] classes = { Config.class, BeanConfig.class };
        return classes;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[0];


    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
