class UrlMappings {

    static mappings = {

        "/initial"(controller: 'flight', action: 'initialVersion')
        "/flight"(controller: 'flight', action: 'bookAFlight')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
