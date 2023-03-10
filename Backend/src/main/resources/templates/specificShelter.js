    let petID = 0;
    let shelterID = 0;
        function refreshPage(){
            window.location.reload();
        }

        function feed(petID) {
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