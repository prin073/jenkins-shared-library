
def call() {
    // 5.downto(1)  // → [5, 4, 3, 2, 1]
    // by pass CPS

    @NonCPS
    for(i in 5.downto(1)) {
        println("Hello ${i}")
    }
}
