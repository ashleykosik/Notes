
const addBtn = document.getElementById('addBtn')
const mobileAdd = document.getElementById('mobileAddBtn')
const container = document.querySelector('.container')

let content;

function showForm() {
    console.log('form create')
    content = document.createElement('section');
    content.classList.add('grid')
    content.innerHTML =  `
    <h3 class="date">Day #/#</h3>
    <p class="breakfastMeal meal">Breakfast food </p>
    <p class="lunchMeal meal">Lunch food </p>
    <p class="dinnerMeal meal">Dinner food</p>
    `

    container.appendChild(content)
}

function log() {
    console.log('button works')
}

addBtn.addEventListener('click', log)
mobileAdd.addEventListener('click', log)
