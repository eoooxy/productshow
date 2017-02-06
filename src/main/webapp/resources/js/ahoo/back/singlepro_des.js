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