
/*
def call(Map args = [:]) {
    sh "echo Hello World! My name is ${args.name} and today is ${args.weekOfDay}"
}

This won't work anymore with newer jenkins version. Jenkins Sandbox has tighten it's rules
*/


def call(Map args = [:]) {
//    def name = args.name
//    def weekOfDay = args.weekOfDay

    // Above will work but it's better to assign some default values

    def name = args.get('name', 'Unknown')
    def weekOfDay = args.weekOfDay('weekOfDay', 'Some day')
    sh "echo Hello World! My name is ${name} and today is ${weekOfDay}"
}
