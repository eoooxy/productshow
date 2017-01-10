/**
 * Created by Administrator on 2017-1-9 0009.
 */

function ArtDialogCommon(options) {
    var defaults = {
        background: '#bcc7d8', // 背景色
        opacity: 0.2, // 透明度
        esc: true,
        lock: true,
        padding: "5px",
        title: "弹出层",
        width: 480,
        height: 320,
        close: function () {
        }
    };

    var params = $.extend({}, defaults, options);
    dialog({
        background: params.background, // 背景色
        opacity: params.opacity, // 透明度
        id: params.id,
        esc: params.esc,
        lock: params.lock,
        content: params.content,
        padding: params.padding,
        title: params.title,
        width: params.width,
        height: params.height,
        button: params.button,
        fixed: true,
        close: params.close,
        init: params.init
    });
    //彈出窗口后的初始化操作
    if (typeof params.initfunction == "function") {
        params.initfunction();
    }
    //        $(".aui_content").removeClass("w99percent");
}

function Loading() {

    dialog({
        title: "正在加载...",
        id: "loading",
        lock: true,
        background: '#000', // 背景色
        opacity: 0.2, // 透明度
        esc: false,
        padding: "20px 50px",
        drag: false,
        resize: false,
        init: function () {
            $(".aui_close").hide();
        },
        fixed: true
    });
}