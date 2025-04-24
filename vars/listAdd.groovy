
@NonCPS
def call(String valueToAdd, List args = []) {
    def newList = args
    newList.add(valueToAdd) //1. using method

    newList.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
