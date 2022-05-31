package com.spring.configinitializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] configFiles = { com.spring.configinitializer.MyAppConfig.class };

		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mappings = { "/" };
		return mappings;
	}

}
