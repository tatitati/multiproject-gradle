package com.example.demo

import org.junit.jupiter.api.Test

class MyConsumerTests {

    @Test
    fun `test can say hi`() {
        assert("Im MyConsumer" == MyConsumer().hi())
    }
}
