package co.edu.udea.compumovil.ejemploadmob.test;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void esto_pasa_siempre()
    {
        assertTrue(5>1);
    }

    public void esto_no_pasa()
    {
        assertTrue(5<1);
    }
}