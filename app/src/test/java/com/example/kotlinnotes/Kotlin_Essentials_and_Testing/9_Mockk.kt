package Kotlin_Essentials_and_Testing

import io.mockk.*

class UserService {
    fun getUserName(userId: Int): String {
        // Simulate fetching user name from a database or API
        return "RealUser"
    }
}

fun main(){
    val mockService = mockk<UserService>()
    every { mockService.getUserName(1) } returns "MockedUser"
    println(mockService.getUserName(1)) // Outputs: MockedUser
}