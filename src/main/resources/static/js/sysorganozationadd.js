function back() {
    parent.layer.closeAll();
}

function validationO_Code() {
    var flag = false;
    if($("#o_Code").val().trim().length!=0){
        $.ajax({
            type:"POST",
            url:"/validationOrganization",
            async:false,
            data:{o_Code:$("#o_Code").val(),o_Id:$("#o_Id").val()},
            dataType:"JSON",
            success:function (data){
                if(data==true){
                    $("#o_CodePrompt").removeAttr("hidden");
                }else{
                    $("#o_CodePrompt").attr("hidden","hidden");
                    flag = true;
                }
            }
        })
    }else{
        $("#o_CodePrompt").attr("hidden","hidden");
    }
    return flag;
}

function validationO_Name() {
    var flag = false;
    if($("#o_Name").val().trim().length!=0){
        $.ajax({
            type:"POST",
            url:"/validationOrganization",
            async:false,
            data:{o_Name:$("#o_Name").val(),o_Id:$("#o_Id").val()},
            dataType:"JSON",
            success:function (data){
                if(data==true){
                    $("#o_NamePrompt").removeAttr("hidden");
                }else{
                    $("#o_NamePrompt").attr("hidden","hidden");
                    flag = true;
                }
            }
        })
    }else{
        $("#o_NamePrompt").attr("hidden","hidden");
    }
    return flag;
}

function validationO_FullName() {
    var flag = false;
    if($("#o_FullName").val().trim().length!=0){
        $.ajax({
            type:"POST",
            url:"/validationOrganization",
            async:false,
            data:{o_FullName:$("#o_FullName").val(),o_Id:$("#o_Id").val()},
            dataType:"JSON",
            success:function (data){
                if(data==true){
                    $("#o_FullNamePrompt").removeAttr("hidden");
                }else{
                    $("#o_FullNamePrompt").attr("hidden","hidden");
                    flag = true;
                }
            }
        })
    }else{
        $("#o_FullNamePrompt").attr("hidden","hidden");
    }
    return flag;
}

function addOrganization() {
    $.ajax({
        type: "POST",
        url: "/AddOrganization",
        data: $("#form1").serialize(),
        dataType: "JSON",
        success: function (data) {
            if (data = "true") {
                layer.msg("添加成功!");
                parent.$("#organization").DataTable().ajax.reload();
            } else {
                layer.msg("添加失败!");
            }
        }
    });
}