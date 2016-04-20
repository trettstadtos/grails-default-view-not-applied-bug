package json

class UrlMappings {

    static mappings = {

        "/api/book/$action?"(controller: 'book', namespace: 'api')

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
