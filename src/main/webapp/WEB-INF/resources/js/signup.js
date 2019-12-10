$(document).ready(function() {
    alert("test");
});
$('#signupBtn').click(function() {
    var id = $('#userId').val();
    var pwd = $('#userPwd').val();
    var repwd = $('#rePwd').val();
    var nickname = $('#userNickname').val();
    var phone = $('#userPhone').val();
    if (pwd !== repwd)
        alert("password is not same value");
    else {
        $.post('/signup', {
            userId: id,
            userPwd: pwd,
            userNickname: nickname,
            userPhone: phone
        }, function () {
            console.dir("Success")
        });
    }
});
