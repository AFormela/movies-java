<html>

<head>
    <meta charset="UTF-8">
    <title>REST Documentation</title>
    <link rel="stylesheet" href="style/bootstrap.min.css">
</head>

<body>

    <div class="container">
        <div class="row border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                #
            </div>
            <div class="col-xl-2">
                METHOD
            </div>
            <div class="col-xl-3">
                URL
            </div>
            <div class="col-xl-3">
                DESCRIPTION
            </div>
            <div class="col-xl-3">
                JSON
            </div>
        </div>
        <div class="row bg-warning border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                1
            </div>
            <div class="col-xl-2">
                POST
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies
            </div>
            <div class="col-xl-3">
                Adds movie
            </div>
            <div class="col-xl-3">
                {<br/>
                "title": String,<br/>
                "year": int<br/>
                }
            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                2
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies
            </div>
            <div class="col-xl-3">
                Gets all movies
            </div>
            <div class="col-xl-3">
                Array:</br>
                {<br/>
                "id": Long,<br/>
                "title": String,<br/>
                "year": int<br/>
                }
            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                3
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}
            </div>
            <div class="col-xl-3">
                Gets movie based on the specific id
            </div>
            <div class="col-xl-3">
                {<br/>
                "id": Long,<br/>
                "title": String,<br/>
                "year": int<br/>
                }
            </div>
        </div>
        <div class="row bg-primary text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                4
            </div>
            <div class="col-xl-2">
                PUT
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}
            </div>
            <div class="col-xl-3">
                Updates movie based on the id
            </div>
            <div class="col-xl-3">
                {<br/>
                "title": String,<br/>
                "year": int<br/>
                }
            </div>
        </div>
        <div class="row bg-danger text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                5
            </div>
            <div class="col-xl-2">
                DELETE
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}
            </div>
            <div class="col-xl-3">
                Deletes movie based on the id
            </div>
            <div class="col-xl-3">

            </div>
        </div>
        <div class="row bg-warning border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                6
            </div>
            <div class="col-xl-2">
                POST
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}/comments
            </div>
            <div class="col-xl-3">
                Adds comment to the movie based on the id
            </div>
            <div class="col-xl-3">
                {<br/>
                "content": String<br/>
                }<br/>
            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                7
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}/comments
            </div>
            <div class="col-xl-3">
                Gets comments from the movie based on the id
            </div>
            <div class="col-xl-3">
                Array:<br/>
                {<br/>
                "id": Long,<br/>
                "content": String<br/>
                }<br/>
            </div>
        </div>
        <div class="row bg-danger text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                8
            </div>
            <div class="col-xl-2">
                DELETE
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id1}/comments{id2}
            </div>
            <div class="col-xl-3">
                Deletes comment based on the id (id2) from the movie based on the id (id1)
            </div>
            <div class="col-xl-3">

            </div>
        </div>
        <div class="row bg-warning border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                9
            </div>
            <div class="col-xl-2">
                POST
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}/ratings
            </div>
            <div class="col-xl-3">
                Adds rating to the movie based on id
            </div>
            <div class="col-xl-3">
                {<br/>
                "rating": int<br/>
                }
            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                10
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}/ratings
            </div>
            <div class="col-xl-3">
                Gets rating from the movie based on the id
            </div>
            <div class="col-xl-3">
                double
            </div>
        </div>
        <div class="row bg-warning border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                11
            </div>
            <div class="col-xl-2">
                POST
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/actors
            </div>
            <div class="col-xl-3">
                Adds actor
            </div>
            <div class="col-xl-3">
                {<br/>
                "firstName": String,<br/>
                "lastName": String<br/>
                }
            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                12
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/actors
            </div>
            <div class="col-xl-3">
                Gets actors
            </div>
            <div class="col-xl-3">
                Array:<br/>
                {<br/>
                "id": Long,<br/>
                "firstName": String,<br/>
                "lastName": String<br/>
                }
            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                13
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/actors/{id}
            </div>
            <div class="col-xl-3">
                Gets actor based on the id
            </div>
            <div class="col-xl-3">
                {<br/>
                "id": Long,<br/>
                "firstName": String,<br/>
                "lastName": String<br/>
                }
            </div>
        </div>
        <div class="row bg-danger text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                14
            </div>
            <div class="col-xl-2">
                DELETE
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/actors/{id}
            </div>
            <div class="col-xl-3">
                Deletes the actor based on the id
            </div>
            <div class="col-xl-3">

            </div>
        </div>
        <div class="row bg-secondary text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                15
            </div>
            <div class="col-xl-2">
                PATCH
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/actors/{id1}/movies/{id2}
            </div>
            <div class="col-xl-3">
                Assigns the movie {id2} to the actor {id1}
            </div>
            <div class="col-xl-3">

            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                16
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/actors/{id}/movies
            </div>
            <div class="col-xl-3">
                Gets movies played by the actor based on the id
            </div>
            <div class="col-xl-3">
                Array:<br/>
                {<br/>
                "id": Long,<br/>
                "title": String,<br/>
                "year": int<br/>
                }
            </div>
        </div>
        <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
            <div class="col-xl-1">
                17
            </div>
            <div class="col-xl-2">
                GET
            </div>
            <div class="col-xl-3">
                localhost:8080/movies-java/api/movies/{id}/actors
            </div>
            <div class="col-xl-3">
                Gets actors played in the movie based on the id
            </div>
            <div class="col-xl-3">
                Array:<br/>
                {<br/>
                "id": Long,<br/>
                "firstName": String,<br/>
                "lastName": String<br/>
                }
            </div>
        </div>
    </div>
    <div class="col-md-5">
    </div>

</body>

</html>
