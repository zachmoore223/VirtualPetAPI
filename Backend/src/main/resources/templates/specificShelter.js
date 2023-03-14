    let petID = 0;
    let shelterID = 0;
    let pets = [[${pets}]];
        function refreshPage(){
          window.setInterval(() => window.location.reload(), 200)  ;
        }

    function validateForm() {
      var x = document.forms["addPetForm"]["name"].value;
      if (x == "" || x == null) {
        alert("Name must be filled out");
        return false;
      }
    }

   function feedAllOrganicPets() {
        for (let i =0; i < pets.length; i++){
            let tempPet = pets[i];
            if (tempPet.type=='ORGANIC_CAT'){
            feedOrganicCat(tempPet.id)
            }
            if (tempPet.type=='ORGANIC_DOG'){
            feedOrganicDog(tempPet.id)
            }
        }
    }

   function oilAllRoboticPets() {
        for (let i =0; i < pets.length; i++){
            let tempPet = pets[i];
            if (tempPet.type=='ROBOTIC_CAT'){
            oilRoboticCat(tempPet.id)
            }
            if (tempPet.type=='ROBOTIC_DOG'){
            oilRoboticDog(tempPet.id)
            }
        }
    }

        function feedOrganicDog(petID) {
            fetch("http://localhost:8080/api/organicDog/" + petID, {
            method: "PUT",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }
        function feedOrganicCat(petID) {
            fetch("http://localhost:8080/api/organicCat/" + petID, {
            method: "PUT",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }

        function oilRoboticDog(petID) {
            fetch("http://localhost:8080/api/roboticDog/" + petID, {
            method: "PUT",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }

        function oilRoboticCat(petID) {
            fetch("http://localhost:8080/api/roboticCat/" + petID, {
            method: "PUT",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }

        function adopt(petID) {
            fetch("http://localhost:8080/api/organicDog/" + petID, {
            method: "DELETE",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }
        function adoptOrganicCat(petID) {
            fetch("http://localhost:8080/api/organicCat/" + petID, {
            method: "DELETE",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }
        function adoptRoboticDog(petID) {
            fetch("http://localhost:8080/api/roboticDog/" + petID, {
            method: "DELETE",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }
        function adoptRoboticCat(petID) {
            fetch("http://localhost:8080/api/roboticCat/" + petID, {
            method: "DELETE",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }

        function tick(shelterID) {
            fetch("http://localhost:8080/shelters/" + shelterID, {
            method: "PUT",
                })
            .then((response) => response.json())
            .then((result) => {
            console.log("Success:", result);
            })
            .catch((error) => {
            console.error("Error:", error);
            });
        }

        //every 5 seconds refresh the page and tick all pets
        window.setInterval(() => refreshPage(), 10000)
        window.setInterval(() => tick([[${shelter.id}]]), 10000)

        window.onload = function() {
                        localStorage.setItem("catchName", $('#petID').val());
                        }
                        let name = localStorage.getItem('catchName');
                        console.log('catchName');