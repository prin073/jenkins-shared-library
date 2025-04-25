//it is the default variable used in closure statements.
def call(Map args = [:]) {

    args.each {echo "${it.key}: ${it.value}"
    }
}
