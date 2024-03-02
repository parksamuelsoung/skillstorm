

// DOM
let header = document.getElementById("header");
let button = document.getElementById("buy-button");
let image = document.getElementById("image");
let description = document.getElementById("description");
let fallButton = document.getElementById("fall-button");
let fall = document.getElementById("fall");
let fallImage = document.getElementById("fall-image");
let fallImageLarge = document.getElementById("fall-image-large");
let springButton = document.getElementById("spring-button");
let spring = document.getElementById("spring");
let springImage = document.getElementById("spring-image");
let springImageLarge = document.getElementById("spring-image-large");
let summerButton = document.getElementById("summer-button");
let summer = document.getElementById("summer");
let summerImage = document.getElementById("summer-image");
let summerImageLarge = document.getElementById("summer-image-large");
let winterButton = document.getElementById("winter-button");
let winter = document.getElementById("winter");
let winterImage = document.getElementById("winter-image");
let winterImageLarge = document.getElementById("winter-image-large");

// Event Listeners
button.addEventListener("click", soldOut);
fallButton.addEventListener("click", soldOut);
springButton.addEventListener("click", soldOut);
summerButton.addEventListener("click", soldOut);
winterButton.addEventListener("click", soldOut);
fallImage.addEventListener("click", fallPage);
springImage.addEventListener("click", springPage);
summerImage.addEventListener("click", summerPage);
winterImage.addEventListener("click", winterPage);

// Functions
function soldOut() {
    button.innerText = "sold out";
}

function fallPage() {
    image.src = fallImageLarge.src;
    header.innerText = fall.querySelector("h1").innerText;
    description.innerText = fall.querySelector("p").innerText;
}
function springPage() {
    image.src = springImageLarge.src;
    header.innerText = spring.querySelector("h1").innerText;
    description.innerText = spring.querySelector("p").innerText;
}
function summerPage() {
    image.src = summerImageLarge.src;
    header.innerText = summer.querySelector("h1").innerText;
    description.innerText = summer.querySelector("p").innerText;
}
function winterPage() {
    image.src = winterImageLarge.src;
    header.innerText = winter.querySelector("h1").innerText;
    description.innerText = winter.querySelector("p").innerText;
}