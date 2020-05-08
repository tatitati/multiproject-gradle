package com.producer

import org.junit.jupiter.api.Test

class MyProducerTests {

    @Test
    fun `In subproject MyProducer can say hi`() {
        assert("Im MyProducer" == MyProducer().hi())
    }

}
