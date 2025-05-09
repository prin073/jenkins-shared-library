// by pass CPS

//Use an explicit closure with .downto()
//@NonCPS //bypassing cps is not needed with below syntax of downto
def countDown() {
    // 5.downto(1)  // → [5, 4, 3, 2, 1]

    //closure syntax works
    5.downto(1) { i ->
        println("Hello ${i}")
    }

}

/*
//will work with normal groovy but won't work in decalarative pipeline
@NonCPS
def countDown() {
    // 5.downto(1)  // → [5, 4, 3, 2, 1]

    for(i in 5.downto(1)) {
        println("Hello ${i}")
    }

}
*/

def call() {
    countDown()
}
