## How to Target Input Value with **ID** or **Name** Attribute

    `const form = document.querySelector('.signup-form');
     const username = document.querySelector('#username');
     
     form.addEventListener('submit', e => {
        e.preventDefault();
        const value = username.value }) 
    --------------------------------------------------------    
     const form = document.querySelector('.signup-form')

     form.addEventListener('submit', e => {
        e.preventDefault();
        const value = form.username.value }) 
    --------------------------------------------------------  
     const form = document.querySelector('.signup-form');

     form.addEventListener('submit', e => {
        e.preventDefault();
        const value = e.target.elements.username.value }) `


