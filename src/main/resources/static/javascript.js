function responded(text) {
    if (text == "success") {
        window.location.assign("http://82.69.46.159:8080/success")
    }
    if (text == "fail") {
            window.location.assign("http://82.69.46.159:8080/fail")
        }
}

function send_deets() {
    // this function "send_deets" is called when they press the button on
    // the login.html
    elm1 = document.getElementById("username")
    elm2 = document.getElementById("password")
    console.log(elm1.text + elm2.text)

    let xhr = new XMLHttpRequest();

    // on the frontend this is what POST looks like
    xhr.open("POST", "http://82.69.46.159:8080/delivery?passwordAttempt="+elm2.text+"&usernameAttempt="+elm1.text);


    //xhr.setRequestHeader("Accept", "application/json");
    //xhr.setRequestHeader("Content-Type", "application/json");

    xhr.onload = () => responded(xhr.responseText);

    let data = elm1.text + elm2.text
    console.log("sending card")

    // this line sends information from the front end to the backend
    xhr.send(data);

}

function get_book_name() {
   window.location.assign("http://82.69.46.159:8080/books")

}