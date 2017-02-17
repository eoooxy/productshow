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
    var text = $("#fatherselect  option:selected").text();

    console.log(recId + "   " + text);

    var data = {"recId": recId};
    $.ajax({
        type: "post",
        url: "getProDes.do",
        dataType: "html",
        data: data,
        success: function (data) {
            if (data && data.htmlDes) {
                tinyMCE.activeEditor.setContent(data.htmlDes);
            }
        }
    });
}

function back_saveProDes() {
    var str = tinyMCE.activeEditor.getContent();
    var recId = $("#fatherselect").val();
    var data = {"htmlDes": str, "recId": recId};

    $.ajax({
        type: "post",
        url: "saveProDes.do",
        dataType: "html",
        data: data,
        success: function (data) {
            /*$("#tableDiv").html(data);
             if (mark == true) {
             $("#pageNum").text("");
             var lables = page + 1 + "/" + totalPage;
             $("#pageNum").html(lables);
             }*/
        }
    });
}