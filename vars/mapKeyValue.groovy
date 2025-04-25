
def call(Map args = [:]) {

    args.each {

            entry -> echo "${entry.key}: ${entry.value}"
    }
}
