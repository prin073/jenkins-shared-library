
def call(List args = []) {
    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
//        println(${arg})  // this won't work. ${} works within GString(Groovy Strings)
    }
}
