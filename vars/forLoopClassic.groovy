// alternative of bypassing CPS as done is downto

def call() {
    for (int i=5; i>=1; i--) {
        println("${i}")  //use echo instead, println sometimes doesn't work woth CPS
    }
}
