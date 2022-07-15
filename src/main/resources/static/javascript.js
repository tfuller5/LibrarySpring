function send_deets() {
    // this function "send_deets" is called when they press the button on
    // the login.html
    elm1 = document.getElementById("username")
    elm2 = document.getElementById("password")
    console.log(elm1.text + elm2.text)

    let xhr = new XMLHttpRequest();

    // on the frontend this is what POST looks like
    xhr.open("POST", "http://localhost:8080/login_attempt");


    //xhr.setRequestHeader("Accept", "application/json");
    //xhr.setRequestHeader("Content-Type", "application/json");

    xhr.onload = () => console.log(xhr.responseText);

    let data = elm1.text + elm2.text
    console.log("sending card")

    // this line sends information from the front end to the backend
    xhr.send(data);

}