function back() {
    parent.layer.closeAll();
}

function updEmployees() {
    $.ajax({
        type:"POST",
        url:"/modifyEmployees",
        data:$("#form1").serialize(),
        dataType:"JSON",
        success:function (data) {
            if(data="true"){
                layer.msg("修改成功!");
                parent.$("#employees").DataTable().ajax.reload();
            }else{
                layer.msg("修改失败!");
            }
        }
    });
}