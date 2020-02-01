package nl.marc_apps.ovgo.ui

import org.junit.Assert.assertEquals
import org.junit.Test

class ViewExtensionsTests {
    @Test
    fun `takeFirstOrNull takes first non-null element and maps it`(){
        // Arrange
        val array = arrayOf(1, 2, 3, 4, 5)

        // Act
        val actualResult = array.takeFirstOrNull { if(it >= 3) it * 3 else null }

        // Assert
        assertEquals(actualResult, 9)
    }

    @Test
    fun `takeFirstOrNull returns null if no element matches predicate`(){
        // Arrange
        val array = arrayOf(1, 2, 3, 4, 5)

        // Act
        val actualResult = array.takeFirstOrNull { if(it >= 9) it * 3 else null }

        // Assert
        assertEquals(actualResult, null)
    }
}