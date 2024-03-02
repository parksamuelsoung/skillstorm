

// DOM
let page = document.getElementById("page");
let header = page.querySelector("h1");
let button = page.querySelector("p").querySelector("button");
let image = page.querySelector("img");
let description = page.querySelector("p");
let fall = document.getElementById("fall");
let fallImage = document.getElementById("fall-image");
let spring = document.getElementById("spring");
let springImage = document.getElementById("spring-image");
let summer = document.getElementById("summer");
let summerImage = document.getElementById("summer-image");
let winter = document.getElementById("winter");
let winterImage = document.getElementById("winter-image");

// Event Listeners
button.addEventListener("click", soldOut);
fallImage.addEventListener("click", fallPage);
springImage.addEventListener("click", springPage);
summerImage.addEventListener("click", summerPage);
winterImage.addEventListener("click", winterPage);

// Functions
function soldOut() {
    button.innerText = "sold out";
}

function fallPage() {
    image.src = fall.querySelector("img").src;
    header.innerText = fall.querySelector("h1").innerText;
    description.insertBefore(button.innerText = fall.querySelector("p").querySelector("button").innerText);
    description.innerText = fall.querySelector("p").innerText;
}
function springPage() {
    image.src = spring.querySelector("img").src;
    header.innerText = spring.querySelector("h1").innerText;
    description.insertBefore(button.innerText = spring.querySelector("p").querySelector("button").innerText);
    description.innerText = spring.querySelector("p").innerText;
}
function summerPage() {
    image.src = summer.querySelector("img").src;
    header.innerText = summer.querySelector("h1").innerText;
    description.insertBefore(button.innerText = summer.querySelector("p").querySelector("button").innerText);
    description.innerText = summer.querySelector("p").innerText;
}
function winterPage() {
    image.src = winter.querySelector("img").src;
    header.innerText = winter.querySelector("h1").innerText;
    description.insertBefore(button.innerText = winter.querySelector("p").querySelector("button").innerText);
    description.innerText = winter.querySelector("p").innerText;
}