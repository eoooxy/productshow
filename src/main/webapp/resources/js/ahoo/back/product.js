/**
 * Created by Administrator on 2017-1-12 0012.
 */


$(function () {
    back_getChildType();
});

function back_getProDes() {

}


function back_getChildType() {
    var fkRecId = $("#fatherselect option:selected").val();
    console.log(fkRecId);
    var data = {"fkRecId": fkRecId};

    $.ajax({
        type: "post",
        url: "childType.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var obj = data.childTypeDto;
            console.log(obj);
            $("#childselect").empty();
            for (var i = 0; i < obj.length; i++) {
                $("#childselect").append("<option value='" + obj[i].recId + "'>" + obj[i].productChildType + "</option>");
            }
        }
    });

}

function back_getParam() {
    var fkRecId = $("#childselect option:selected").val();
    console.log(fkRecId);
    var data = {"fkRecId": fkRecId};

    $.ajax({
        type: "post",
        url: "selectA.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var obj = data.mapList;
            console.log(obj);
            $("#parameterselect").empty();

            for(var o in  obj){
                $("#parameterselect").append("<option value='" + o.recId + "'>" + o.name + "</option>");
            }
        }
    });
}