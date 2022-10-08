const imageShower = document.getElementById("imageShower");
const sendRequestButton = document.getElementById("send_request_button");

sendRequestButton.addEventListener("click", () => {
    // fetch("https://v2.jokeapi.dev/joke/Any?safe-mode")
    fetch("http://localhost:8080/sendRequestToPublicApi")
        .then(response => response.json())
        .then(data => updateUI(data))
        .catch(err => console.log(err))
})

function updateUI(data){
    console.log(data)
   imageShower.src = data.file;
}
console.log(sendRequestButton);
console.log(imageShower.src);