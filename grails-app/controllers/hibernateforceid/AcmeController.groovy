package hibernateforceid

import grails.converters.JSON

class AcmeController {

    def index() {
        List acmes = Acme.list()
        render new JSON([acmes: acmes])
    }


}
