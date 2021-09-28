package com.github.adam6806.testjhipsterapp;

import com.github.adam6806.testjhipsterapp.TestJHipsterApp;
import com.github.adam6806.testjhipsterapp.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { TestJHipsterApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
