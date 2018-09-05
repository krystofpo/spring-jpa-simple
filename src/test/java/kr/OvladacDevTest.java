package kr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
@ActiveProfiles("dev")
public class OvladacDevTest {

    @Autowired
    Ovladac o;

    @Test
    public void zkouskaTest() {
        assertTrue(o.zkouska().equals("ok dev"));
    }
}