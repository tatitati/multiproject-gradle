package com.example.demo

import org.junit.jupiter.api.Test

class MyProducerTests {

    @Test
    fun `test can say hi`() {
        assert("Im MyProducer" == MyProducer().hi())
    }

}
