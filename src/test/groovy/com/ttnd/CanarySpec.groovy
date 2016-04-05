package com.ttnd

import geb.spock.GebSpec
import groovy.util.logging.Slf4j
import spock.lang.Stepwise

@Slf4j
@Stepwise
class CanarySpec extends GebSpec {

    def "canary"() {
    given:
        log.info "Canary"
        go "/"
    }

}