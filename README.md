## Virtual Pet API

Now we will take Virtual pet to its logical conclusion! A fully functional MVC application! Your team will choose one of
your virtual pet applications and transform it into a backend application with a functional front end! This will test
everything you’ve learned up until this point, and will also be your first group project.

# Curl Commands

* GET ALL SHELTERS:
    * curl -X GET http://localhost:8080/shelters -H 'Content-Type: application/json'
* GET A SHELTER:
    * curl -X GET http://localhost:8080/shelters/1 -H 'Content-Type: application/json'
* POST A SHELTER:
    * curl -X POST http://localhost:8080/api/shelters -H 'Content-Type: application/json' -d '{"name": "test"}'
* PUT A SHELTER:
    * curl -X PUT http://localhost:8080/api/shelters/1 -H 'Content-Type: application/json' -d '{"id":1, "name": "test"}'
* DELETE A SHELTER:
    * curl -X DELETE http://localhost:8080/api/shelters/1 -H 'Content-Type: application/json'

## OrganicDog Commands

* GET ALL ORGANIC DOGS:
    * curl -X GET http://localhost:8080/api/shelters/1/organicDogs -H 'Content-Type: application/json'

* POST AN ORGANIC DOG:
    * curl -s -X POST http://localhost:8080/api/shelters/1/organicDog -H 'Content-Type: application/json' -d '{"
      petName": "testDog"}'

# Mappings

- GET /shelters - List all shelter
- POST /shelters - Create a new shelter
- POST /shelters/{shelterID} - Add a given pet according to type, age,etc
- GET /shelter/{shelterID} - Get all pets in a shelter
- POST /shelter/{shelterID} - Add a pet to a given shelter
- DELETE /shelter/{shelterID}/{petID} - Adopt a given pet
- PUT/shelter/{shelterID}/{petID} - (PUT) Perform actions upon or see the status (GET) of a single pet who is a guest of
  a particular shelter
- PUT /shelter/{shelterID} -Perform actions upon or see the status of all pets who are guests of a particular shelter

# User Stories

- AS a user I want a pet shelter that houses a pet that I can feed.
- As a user I want to see a list of all the shelters.
- As a user I need to create new shelters so that I can add pets to it.
- AS a user I need to see all the pets in all the shelters on one screen so that I can find the perfect pet.
- As a user I want a nice UI so that I like to visit the site.
    - As a designer I need a page to display a list of all the pets so that I can choose one.
    - As a designer I need a page to display an individual pet's status' and actions.
    - As a designer I need a page to display a list of shelters.
    -
- As a programmer I need to incorporate Spring into the program to make nice endpoints.
- As a user I need to be able to remove a pet from the shelter.

# HTML pages needed

- /shelter.html
- /shelter/{shelterId}.html

# Requirements for a shelter

-

# Requirements for a pet

- Need a parent class- Named Pet
    - ID
    - Name
    - getters and setters
    - constructor

# Entities

- Shelter
    - display pets
    - diplay pet status
    - get pet
    - admit
    - adopt


- Organic Dog
    - feed
- Organic Cat
    - feed
- Robotic Dog
    - oil
- Robotic Cat
    - oil

# Repositories

- CRUD repo for each entity

# Controllers

- Controller for each endpoint

# Pet parent class

## Required Tasks

# Backend

- Choose which student’s virtual pet will be used for this project.
- Use the Virtual Pet classes from Virtual Pet Amok as your model. This will probably require substantial modifications,
  that’s what the team is for!
- Relate Shelter to Virtual Pet. Allow for more than one shelter, though you still only need one shelter unless you want
  to get fancy.
- Make appropriate repos for your model.
- Make controller endpoints that can do everything your original pets did in Amok. For instance, make an endpoint that
  will feed all your pets. Make sure you still tick() when you should!

# Frontend

- Create a frontend that has the following pages:
    - Shelter view which shows the names and basic stats of a pet. Also should allow you to adopt pets out and call
      appropriate shelter methods.
    - Pet view which shows a pet in detail. Also should be capable of running any pet specific methods you have.
    - Add pet view which allows you to add a new pet. Feel free to incorporate this one directly into the shelter view
      or pet view if you think it looks better.
- Use CSS styling and keep a consistent styling throughout the frontend.
- Use Javascript to interact with your back end.

# Stretch Tasks

Animation:
Add Javascript animations to the view.

Make your pets tick in real time:
Make it so that rather than calling tick() every time you interact with your shelter, tick() gets called every few
seconds and updates the view.

Use your creativity:
If you think of something and have extra time, feel free to attempt it!
