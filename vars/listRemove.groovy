
def call(List args = [], string valueToRemove) {
    args.remove(valueToRemove)
    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
