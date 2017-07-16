package hibernateforceid


class Acme {
//    String id
    String name
    String nickname

    static constraints = {
    }

    static mapping = {
        id generator: 'assigned', unique: true, nullable: false
    }
}
