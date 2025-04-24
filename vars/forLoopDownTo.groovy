// by pass CPS

@NonCPS
def countDown() {
    // 5.downto(1)  // → [5, 4, 3, 2, 1]

    for(i in 5.downto(1)) {
        println("Hello ${i}")
    }

}


def call() {
    countDown()
}
