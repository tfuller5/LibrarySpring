function responded(text) {
    if (text === "success") {
        window.location.assign("http://82.69.46.159:8080/success")
    }
    if (text === "fail") {
        window.location.assign("http://82.69.46.159:8080/fail")
    }
}

function send_deets() {
    // this function "send_deets" is called when they press the button on
    // the login.html
    elm1 = document.getElementById("username")
    elm2 = document.getElementById("password")
    console.log(elm1.value)
    console.log(elm2.value)

    ////////////////////////////////
    let xhr = new XMLHttpRequest();
    xhr.onload = () => responded(xhr.responseText);

    // this is POST on the front end!
    const URL = "http://82.69.46.159:8080/delivery?passwordAttempt="+elm2.value+"&usernameAttempt="+elm1.value
    xhr.open("POST", URL);
    xhr.send();
    console.log("Made a POST request to: "+URL)

}

function get_book_name() {
   window.location.assign("http://82.69.46.159:8080/books")
}