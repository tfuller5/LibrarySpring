function add_book () {
    input_box = document.getElementById("book_title")

    console.log(input_box.value)
    let xhr = new XMLHttpRequest();

    // on the frontend this is what POST looks like
    xhr.open("POST", "http://82.69.46.159:8080/add_book?book_title="+input_box.value);
    xhr.onload = () => console.log(xhr.responseText);

    xhr.send();
}