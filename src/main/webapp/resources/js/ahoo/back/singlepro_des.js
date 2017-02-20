/**
 * Created by Administrator on 2017/1/24.
 */

tinymce.init({
    selector: '#editHtml',
    width: 700,
    height: 550,
    language: 'zh_CN',
    menubar: false,

    upload_image_url: 'uploadImg.json', //配置的上传图片的路由
    plugins: [
        'advlist autolink autosave lists link image charmap print preview anchor',
        'searchreplace visualblocks code fullscreen textcolor colorpicker textpattern code uploadimage',
        'contextmenu paste'
    ],
    toolbar1: "undo redo | bold italic underline strikethrough | alignleft aligncenter alignright alignjustify | fontselect fontsizeselect ",
    toolbar2: "forecolor backcolor | bullist numlist | outdent indent | removeformat | link unlink uploadimage | preview fullscreen ",
});


function msgShow(title, msgString, msgType) {
    $.messager.alert(title, msgString, msgType);
}


function back_getProDes() {
    var recId = $("#fatherselect").val();
    var text = $("#fatherselect").find("option:selected").text();
//    var text = $("#fatherselect  option:selected").text();

    console.log(recId + "   " + text);

    var data = {"recId": recId};
    $.ajax({
        type: "post",
        url: "getProDes.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var dto = data.dto;
            console.log(dto);
            if (dto && dto.htmlDes) {
                console.log(data);
                tinyMCE.activeEditor.setContent(dto.htmlDes);
            }
        }
    });
}

function back_saveProDes() {
    var str = tinyMCE.activeEditor.getContent();
    var recId = $("#fatherselect").val();

    console.log(recId, str);
    var data = {"htmlDes": str, "recId": recId};

    $.ajax({
        type: "post",
        url: "saveProDes.json",
        dataType: "json",
        data: data,
        success: function (data) {
            console.log(data);
            if(data && data.msg){
                var msg = data.msg;
                msgShow("系统消息", msg.ctx, "info");
                tinyMCE.activeEditor.setContent("");
            }

        }
    });
}