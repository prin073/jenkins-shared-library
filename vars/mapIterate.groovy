
//1. simple way
/*
def call(Map args = [:]) {
    sh "echo Hello World! My name is ${args.name} and today is ${args.weekOfDay}"
}
*/



//2. new and accepted version
def call(Map args = [:]) {
//    Above will work but it's better to assign some default values
//    def name = args.name
//    def weekOfDay = args.weekOfDay

    def name = args.get('name', 'Unknown')
    def weekOfDay = args.get('weekOfDay', 'Some day')
    sh "echo Hello World! My name is ${name} and today is ${weekOfDay}"
}
