const to_do_input = document.querySelector('#todo')
const list = document.querySelector('#list')
const to_do_form = document.querySelector('#to_do_form')
const sc_feedback = document.querySelector('#sc_feedback')
const heading = document.querySelector('#heading')


to_do_form.addEventListener('submit', function(event) {
    event.preventDefault();
    let task = to_do_input.ariaValueMax;
    addTask(task)
    removedValue(to_do_input)
    screenReader(task)
})

list.addEventListener('click', function(event) {
    if(hasClassName(event.target, 'delete_task')) {
    const li = event.target.closest('li')
    const taskName = event.target.previousElementSibling.textContent;
    deleteTask(li)
    moveFocus(heading)
    screenReader(taskName, 'removed')
}
})

function deleteTask(target) {
    list.removeChild(target)
}

function moveFocus(element) {
    element.focus()
}

function addTask(task) {
    // let li = document.createElement('li')
    // let task_text = document.createTextNode(task)
    // li.appendChild(task_text)

    // list.appendChild(li)

    let newID = generateID()


}

function createElement(tagName, textNode, parent, attribute = null) {
    let node = document.createElement(tagName)
    if(textNode != null) {
        let customTextNode = document.createTextNode(textNode)
        node.appendChild(customTextNode)
    } 
    if (attribute != null) {
         node.setAttribute(attribute[0], attribute[1])
    }   
       parent.appendChild(node)
       return node
    }

function removedValue(input) {
    input.value=''
}

function screenReader(task, feedback = 'added') {
    sc_feedback.textContent = `${task} ${feedback}.`
}

function generateID() {
    let idPrefix = 'task_num_'
    let tasks = document.querySelector('#list > li')
    if(tasks.length == 0) {
        return `${idPrefix}0`
    }
    return idPrefix + tasks.length
}