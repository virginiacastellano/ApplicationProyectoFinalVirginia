package com.curso.android.app.practica.applicationproyectofinalvirginia



import com.curso.android.app.practica.applicationproyectofinalvirginia.data.ComparisonRepository
import org.junit.Assert
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun testComparisonRepository() {
        val repository = ComparisonRepository()

        val string1 = "Hello"
        val string2 = "Hello"
        val result = repository.compareStrings(string1, string2)

        Assert.assertTrue(result)
    }
}
