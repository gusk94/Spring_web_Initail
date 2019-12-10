$(document).ready(function() {
    alert("test");
});
$('#signInBtn').click(function() {
    var id = $('#userId').val();
    var pwd = $('#userPwd').val();

    alert(id+", "+pwd);

    $.get('/signin', {
        userId: id,
        userPwd: pwd
    }, function(result) {
        console.dir(result);
        if(result == "{\"result\":true}") {

        }
        else {

        }

        // console.log(result);
    });
});

