package hibernateforceid

class BootStrap {

    def init = { servletContext ->
        Acme acme1 = new Acme(name:'snoopy', nickname: 'the red baron')
        acme1.id=858
        acme1.save(failOnError:true)

        Acme acme2 = new Acme(name:'woodstock', nickname: 'the yellow menace')
        acme2.id = 859
        acme2.save(failOnError:true)
    }
    def destroy = {
    }
}
