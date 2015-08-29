package testowo.algorithm

import spock.lang.Specification

class ReturnTheSameTest extends Specification {


    def "should return the same value"() {

        when:
        println "nic"

        then:
        "aaa".length() == 4

        expect:
        new ReturnTheSame().work(5) == 5

    }
}
