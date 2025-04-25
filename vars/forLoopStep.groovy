//won't work due to cps

/*
def call() {

    //1..5 step 2  // → [1, 3, 5]
    for(i in 1..5.step(2)) {
        println("Hello ${i}")
    }

}
*/

def call() {
    //closure syntax works
    //1..5 step 2  // → [1, 3, 5]
    1.step(6, 2) {i ->
        echo "Hello ${i}"
    }

}