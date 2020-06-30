$(document).ready(function () {
    $.ajax({
        url: "http://localhost:8080/webshop/products"
    }).then(function (data) {
        $('.name').append(data.name);
        $('.description').append(data.description)
        $('.price').append(data.price);

    });

});