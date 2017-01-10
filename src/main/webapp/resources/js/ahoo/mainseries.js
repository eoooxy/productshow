/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:42
 */


function queryDes(value) {
    switch (value) {
        case "导体":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '导体', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "模具型号":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '模具型号', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "价格体系":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '价格体系', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "焊粉型号":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '焊粉型号', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "模具夹":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '模具夹', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "套管":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '套管', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "整形模具":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '整形模具', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "工具箱":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '工具箱', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "点火枪":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '点火枪', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "喷灯":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '喷灯', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "清模铜刷":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '清模铜刷', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "清模毛刷":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '清模毛刷', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "C型夹":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: 'C型夹', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;
        case "F型夹":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: 'F型夹', height: 600, width: 800,
                        close: function () {
                        }
                    });
                }
            });
            break;


    }
}

function alertResult(list) {
    console.log(list)
    console.log(list.size())
    $.each(list, function (n, value) {
        console.log(n + ' ' + value);
    })
    /* var html = "<div align='center'><h2>选择的型号是：" + type + "</h2>" +


     +"</div>";


     ArtDialogCommon({
     id: 'edit', content: html, title: '选择结果', height: 300, width: 400,
     close: function () {
     }
     });*/
}

function select_checkbox() {

    var flag = 0;
    var list = new Array;
    $("input[name='m']:checkbox").each(function () {
        if ($(this).prop("checked")) {
            console.log(($(this).parent().text()).split(':')[0] + ":" + $(this).parent().text());
            list.push("{" + ($(this).parent().text()).split(':')[0] + ":" + $(this).parent().text() + "}");
            flag += 1;
        } else {
            list.push("{" + ($(this).parent().text()).split(':')[0] + ":" + '' + "}");
        }
    });

    if (flag < 1) {
        art.dialog({
            title: '提示',
            id: 'alert',
            left: '50%',
            top: '20%',
            background: '#000', // 背景色
            opacity: 0.2, // 透明度
            content: '至少要选中一个！',
            lock: true,
            drag: false,
            resize: false,
            fixed: true
        });
    }

    //
    alertResult(list);

}


function getParamB() {
    var fkId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var data = {"fkId": fkId, "paramA": paramA};

    $.ajax({
        type: "post",
        url: "selectB.json",
        dataType: "json",
        data: data,
        success: function (data) {

            var obj = data.dtoB;
            $("#parameterB").empty();
            $("#parameterB").append("<option>请选择您需要导体B</option>");
            for (var i = 0; i < obj.length; i++) {
                //console.log(obj[i].conductorB);
                $("#parameterB").append("<option>" + obj[i].conductorB + "</option>");
            }
        }
    });

}

function getOneParam() {

    var fkId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var paramB = $("#parameterB option:selected").text();
    if (paramB == undefined) {
        var data = {"fkId": fkId, "paramA": paramA, "paramB": null};
    } else {
        var data = {"fkId": fkId, "paramA": paramA, "paramB": paramB};
    }

    $.ajax({
        type: "post",
        url: "queryOne.do",
        dataType: "html",
        data: data,
        success: function (data) {
            $("#oneDesParam").html(data);
        }
    });

}

function getMainSeriesProduct() {
    Loading();
    $.ajax({
        type: "post",
        url: "proTotal.do",
        dataType: "html",
        //data:data,
        success: function (data) {
            art.dialog.list['loading'].close();
            $("#convert").html(data);

            $("#convert-ul").find("#child-li").remove();
            $("#convert-ul").find("#des-li").remove();
        }
    });
}

function getChildSeriesProduct(id) {
    Loading();
    var data = {"fkRecId": id};
    $.ajax({
        type: "post",
        url: "proChild.do",
        dataType: "html",
        data: data,
        success: function (data) {
            art.dialog.list['loading'].close();
            $("#convert").html(data);

            $("#convert-ul").find("#child-li").remove();
            $("#convert-ul").find("#des-li").remove();
            var li = "<li id='child-li'><a href='#' onclick='getChildSeriesProduct(" + id + ")'>分类选择</a></li>";
            $("#convert-ul").append(li);
        }
    });

}


function getDesProductParam(id) {
    Loading();

    var data = {"childFkId": id};
    $.ajax({
        type: "post",
        url: "desParam.do",
        dataType: "html",
        data: data,
        success: function (data) {
            art.dialog.list['loading'].close();

            $("#convert").html(data);

            $("#convert-ul").find("#des-li").remove();
            var li = "<li id='des-li'><a href='#' onclick='getDesProductParam(" + id + ")'>参数选择</a></li>";
            $("#convert-ul").append(li);
        }
    });

}