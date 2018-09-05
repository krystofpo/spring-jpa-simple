package kr

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import spock.lang.Specification


@ContextConfiguration(classes=[Config.class])
class OvladacSpec extends Specification {
    @Autowired
    Ovladac ovladac

    def "ZkouskaTest"() {
        expect:
        ovladac.zkouskaTest() == 'ok'

    }
}
