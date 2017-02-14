/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:42
 */

var pageFlag = 0;

function queryDes(value) {
    switch (value) {
        case "导体":
            $.ajax({
                type: "post", url: "getParameDes.do", dataType: "html",//data: data,
                success: function (data) {
                    ArtDialogCommon({
                        id: 'edit', content: data, title: '导体', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '模具型号', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '价格体系', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '焊粉型号', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '模具夹', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '套管', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '整形模具', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '工具箱', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '点火枪', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '喷灯', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '清模铜刷', height: 500, width: 700,
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
                        id: 'edit', content: data, title: '清模毛刷', height: 500, width: 700,
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
                        id: 'edit', content: data, title: 'C型夹', height: 500, width: 700,
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
                        id: 'edit', content: data, title: 'F型夹', height: 500, width: 700,
                        close: function () {
                        }
                    });
                }
            });
            break;


    }
}

function alertResult(map) {
    var mapUri = {
        "导体A": "导体A-url", "导体B": "导体B-url", "模具型号": "模具型号-url"
        , "价格体系": "价格体系-url", "焊粉型号": "焊粉型号-url", "模具夹": "模具夹-url"
        , "工具箱": "工具箱-url", "点火枪": "点火枪-url", "喷灯(套装)": "喷灯(套装)-url"
        , "清模铜刷": "清模铜刷-url", "清模毛刷": "清模毛刷-url", "C型夹": "C型夹-url"
        , "F型夹": "F型夹-url", "套管(迷你模具)": "套管(迷你模具)-url"
        , "整形模具(防漏材料)": "整形模具(防漏材料)-url"
    };

    var html = "<div align='center'>"
    for (var key in map) {
        //var html =new StringBuffer();
        if (map.hasOwnProperty(key)) {
            if (map[key] != null && map[key] != '') {
                var info = key + "的购买链接地址为：" + mapUri[key] + "备注为:" + map[key];
                console.log(key + "的购买链接地址为：" + mapUri[key] + "备注为:" + map[key]);
                html += "<span style='font-size: 14px'>" + info + "</span><br/>";
            }
        }
    }
    html += "</div>";


    ArtDialogCommon({
        id: 'edit', content: html, title: '选择结果', height: 300, width: 550,
        close: function () {
        }
    });
}

function select_checkbox() {

    var flag = 0;
    var map = {};
    $("input[name='m']:checkbox").each(function () {
        if ($(this).prop("checked")) {
            //console.log(($(this).parent().text()).split(':')[0] + ":" + $(this).parent().text());
            map[($(this).parent().text()).split(':')[0]] = $(this).parent().text();

            //list.push("{" + ($(this).parent().text()).split(':')[0] + ":" + $(this).parent().text() + "}");
            flag += 1;
        } else {
            map[($(this).parent().text()).split(':')[0]] = '';
            //list.push("{" + ($(this).parent().text()).split(':')[0] + ":" + '' + "}");
        }
    });

    if (flag < 1) {
        art.dialog({
            title: '提示',
            id: 'alert',
            left: '50%',
            top: '10%',
            background: '#000', // 背景色
            opacity: 0.2, // 透明度
            content: '至少要选中一个！',
            lock: true,
            drag: false,
            resize: false,
            fixed: true
        });
    } else {
        alertResult(map);
    }


}


function getParamB() {
    var fkRecId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var data = {"fkRecId": fkRecId, "paramA": paramA};

    $.ajax({
        type: "post",
        url: "threeSelectB.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var obj = data.dtoB;
            $("#parameterB").empty();
            $("#parameterB").append("<option>请选择规格B</option>");
            for (var i = 0; i < obj.length; i++) {
                //console.log(obj[i].conductorB);
                $("#parameterB").append("<option>" + obj[i].productNormsB + "</option>");
            }
        }
    });

}

function getOneParam() {

    pageFlag = 0;
    var fkRecId = $("#fkId").val();
    var data = {"fkRecId": fkRecId};
    var paramA = $("#parameterA option:selected").val();
    var paramB = $("#parameterB option:selected").val();
    if (paramA != undefined && paramA != '请选择规格A') {
        data.paramA = paramA;
    }
    if (paramB != undefined && paramB != '请选择规格B') {
        data.paramB = paramB;
    }

    $.ajax({
        type: "post",
        url: "threeQueryOne.do",
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
        url: "threeTotal.do",
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
        url: "threePros.do",
        dataType: "html",
        data: data,
        success: function (data) {
            art.dialog.list['loading'].close();
            $("#convert").html(data);

            $("#convert-ul").find("#child-li").remove();
            $("#convert-ul").find("#des-li").remove();
            var li = "<li id='child-li'><a href='#' onclick='getChildSeriesProduct(" + id + ")'>详细参数</a></li>";
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
            var li = "<li id='des-li'><a href='#' onclick='getDesProductParam(" + id + ")'>详细参数</a></li>";
            $("#convert-ul").append(li);
        }
    });

}

//1/${dto.productParameterList.size()}
function subPage(listSize) {
    pageFlag -= 1;
    if (pageFlag < 0) {
        art.dialog({
            title: '提示',
            id: 'alert',
            left: '50%',
            top: '10%',
            background: '#000', // 背景色
            opacity: 0.2, // 透明度
            content: '已经是第一页啦！',
            lock: true,
            drag: false,
            resize: false,
            fixed: true
        });
        pageFlag = 0;
    } else {
        getOneProTab(pageFlag, listSize);
    }

}
function addPage(listSize) {
    pageFlag += 1;
    if (pageFlag > listSize - 1) {
        art.dialog({
            title: '提示',
            id: 'alert',
            left: '50%',
            top: '10%',
            background: '#000', // 背景色
            opacity: 0.2, // 透明度
            content: '已经是最后一页啦！',
            lock: true,
            drag: false,
            resize: false,
            fixed: true
        });
        pageFlag -= 1;
    } else {
        getOneProTab(pageFlag, listSize);
    }

}

function getOneProTab(pageFlag, listSize) {

    var fkId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var paramB = $("#parameterB option:selected").text();
    var data = {"page": pageFlag, "fkId": fkId, "paramA": paramA, "paramB": paramB};

    $.ajax({
        type: "post",
        url: "page.do",
        dataType: "html",
        data: data,
        success: function (data) {

            $("#tableDiv").html(data);

            $("#pageNum").text("");
            var lables = pageFlag + 1 + "/" + listSize;
            $("#pageNum").html(lables);
        }
    });
}