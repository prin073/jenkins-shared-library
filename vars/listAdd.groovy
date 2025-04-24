
def call(List args = [], string valueToAdd) {
    args.add(valueToAdd)
    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
