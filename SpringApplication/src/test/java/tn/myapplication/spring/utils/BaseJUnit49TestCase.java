package tn.myapplication.spring.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;



public abstract class BaseJUnit49TestCase extends BaseSpringAwareTestCase {
    private static final Logger LOG = LogManager.getLogger(BaseJUnit49TestCase.class);

    @Autowired
    protected ApplicationContext applicationContext;

    protected BaseJUnit49TestCase() {
        super();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

}
