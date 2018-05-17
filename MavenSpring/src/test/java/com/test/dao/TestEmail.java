package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestEmail extends AbstractTestNGSpringContextTests {
    @Autowired
    EmailGenerator emailGenerator ;

    @Test()
    void testEmailGenerator() {

        String email = emailGenerator.generator();
        System.out.println(email);

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "46@qq.com");


    }
}
