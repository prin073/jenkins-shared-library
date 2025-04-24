
@NonCPS
def call(String valueToAdd, List args = []) {
    args.add(valueToAdd) //1. using method

    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
