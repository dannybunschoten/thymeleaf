document.querySelectorAll('.faq-item .question').forEach(question => {
    question.addEventListener('click', event => {
        const activeQuestion = event.currentTarget;
        activeQuestion.classList.toggle('active');
        
        const answer = activeQuestion.nextElementSibling;
        if(answer.style.maxHeight){
            answer.style.maxHeight = null;
        } else {
            answer.style.maxHeight = answer.scrollHeight + 'px';
        }
    });
});

document.addEventListener('DOMContentLoaded', function () {
    const menuIcon = document.querySelector('.menu-icon');
    const menuItems = document.querySelector('.menu-items');
  
    menuIcon.addEventListener('click', function () {
        menuItems.style.display = menuItems.style.display === 'block' ? 'none' : 'block';
    });
});

// When the user scrolls the page, execute myFunction
window.onscroll = function() {myFunction()};

// Get the header
var header = document.getElementById("myHeader");

// Get the offset position of the navbar
var sticky = header.offsetTop;

// Add the sticky class to the header when you reach its scroll position. Remove "sticky" when you leave the scroll position
function myFunction() {
  if (window.scrollY > sticky) {
    header.classList.add("sticky");
  } else {
    header.classList.remove("sticky");
  }
}