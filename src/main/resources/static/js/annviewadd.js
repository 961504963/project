function back() {
    parent.layer.closeAll();
}

function addAnnouncement() {
    $.ajax({
        type: "POST",
        url: "/announcementAdd",
        data: $("#form1").serialize(),
        dataType: "JSON",
        success: function (data) {
            if (data = "true") {
                layer.msg("添加成功!");
                parent.$("#datatable").DataTable().ajax.reload();
            } else {
                layer.msg("添加失败!");
            }
        }
    });
}