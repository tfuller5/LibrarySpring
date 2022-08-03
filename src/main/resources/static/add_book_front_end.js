function add_book () {
    input_box = document.getElementById("book_title")

    console.log(input_box.value)
    //draw_book_image()

    let xhr = new XMLHttpRequest();
    xhr.onload = () => draw_book_images(xhr.responseText);
    draw_book_images('[2, 4, 5]')

    // on the frontend this is what POST looks like
    const URL = "http://82.69.46.159:8080/add_book?book_title="+input_box.value
    xhr.open("POST", URL);
    xhr.send();
    console.log("Made a POST request to: "+URL)
}

function remove_book () {
    input_box = document.getElementById("position")

    console.log(input_box.value)
    //draw_book_image()

    let xhr = new XMLHttpRequest();
    xhr.onload = () => draw_book_images(xhr.responseText);
    draw_book_images('[1, 3, 5]')

    // on the frontend this is what POST looks like
    const URL = "http://82.69.46.159:8080/remove_book?position="+input_box.value
    xhr.open("POST", URL);
    xhr.send();
    console.log("Made a POST request to: "+URL)
}


var elm = document.getElementById("remove")
console.log(elm)
elm.addEventListener("click", remove_book)

function draw_book_images(json_data) {
    console.log(json_data)
    let arr = JSON.parse(json_data)

    var container = document.getElementById("imgs")
    container.innerHTML = ''

    for (const num of arr) {
        var new_image = document.createElement("img")

        //console.log(container)
        container.appendChild(new_image)
        new_image.id = "34"
        new_image.class = "tag"
        new_image.src = "free-book.png"
        new_image.style.left = (20 + (num - 1) * 120) + "px"
        new_image.style.top = "40px"
        new_image.style.float = "left"
        new_image.style.position = "absolute"
    }
    console.log(container)

    var div = document.createElement('div');
    document.body.appendChild(div);

    div.className = 'ui-modal';
    div.id = 'test';
    div.innerHTML = '<span class="msg">Hello world.</span>';
    div.textContent = 'Hello world.';
}