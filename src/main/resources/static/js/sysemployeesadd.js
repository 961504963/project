function back() {
    parent.layer.closeAll();
}

function checkdeptNo() {
    var deptNo = $("#deptNo").val();
    if(deptNo==0){
        layer.msg("所属部门必须选择!");
        return false;
    }
    return true;
}

function checksuper() {
    var supern = $("#super").val();
    if(supern==0){
        layer.msg("所属上级必须选择!");
        return false;
    }
    return true;
}

function checkroleNo() {
    var roleNo = $("#roleNo").val();
    if(roleNo==0){
        layer.msg("角色身份必须选择!");
        return false;
    }
    return true;
}

function addEmployee() {
    if (checkdeptNo()&&checksuper()&&checkroleNo()) {
        $.ajax({
            type: "POST",
            url: "/AddEmployees",
            data: $("#form1").serialize(),
            dataType: "JSON",
            success: function (data) {
                if (data = "true") {
                    layer.msg("添加成功!");
                    parent.$("#employees").DataTable().ajax.reload();
                } else {
                    layer.msg("添加失败!");
                }
            }
        });
    }
}

$(function () {
    var e_Code = $("#e_Code");
    var e_LoginName = $("#e_LoginName");

    e_Code.bind("blur", function () {
        $.ajax({
            type: "POST",//请求类型
            url: "/ExistCode",//请求的url
            data: {e_Code: e_Code.val()},//请求参数
            dataType: "json",//ajax接口（请求url）返回的数据类型
            success: function (data) {//data：返回数据（json对象）
                if (data == "null") {//账号可用，正确提示

                } else if (data == "") {//账号不可为空，错的提示
                    layer.msg("编号不能为空!");
                } else {//账号已存在，错的提示
                    layer.msg("编号已存在!");
                }
            }
        });
    });

    e_LoginName.bind("blur", function () {
        $.ajax({
            type: "POST",//请求类型
            url: "/ExistLoginName",//请求的url
            data: {e_LoginName: e_LoginName.val()},//请求参数
            dataType: "json",//ajax接口（请求url）返回的数据类型
            success: function (data) {//data：返回数据（json对象）
                if (data == "null") {//账号可用，正确提示

                } else if (data == "") {//账号不可为空，错的提示
                    layer.msg("账号不能为空!");
                } else {//账号已存在，错的提示
                    layer.msg("账号已存在!");
                }
            }
        });
    });
})

