package com.consumer

import org.junit.jupiter.api.Test

class MyConsumerTests {

    @Test
    fun `MyConcumser can say hi`() {
        assert("Im MyConsumer" == MyConsumer().hi())
    }
}
