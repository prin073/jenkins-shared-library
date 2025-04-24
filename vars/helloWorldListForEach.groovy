
def call(Map args = []) {
    args.each { arg ->
        println("${arg}")  // Use double quotes for GString
    }
}
