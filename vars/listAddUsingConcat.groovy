//remember that @NonCPS methods can't use Groovy methods that are restricted by the sandbox, such as add().
// This leads to the same sandbox error.
//won't work
/*
@NonCPS
def call(String valueToAdd, List args = []) {
    def newList = args
    newList.add(valueToAdd) //1. using method

    newList.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
*/

def call(String valueToAdd, List args = []) {
    def newList = args + [valueToAdd] // Concatenate the valueToAdd to args
    echo "newList: ${newList}"
}