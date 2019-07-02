var cl_map = new AMap.Map("wl_map_warp",{
    zoom:11,//级别
    center: [108.947016,34.270124],//中心点坐标
    // viewMode:'3D'//使用3D视图
});

// 设置地图高度
function setHeight () {
    var clientHeight = $(window).height();
    var dom_map = $('#wl_map_warp');
    dom_map.css("height", clientHeight + "px");
}
setHeight();

$(window).resize(function(){
    setHeight();
})

// 创建可视化图层
var layer = new Loca.PointLayer({
    map: cl_map
});

// 初始显示文地点
function getData() {
    $.ajax({
        type:"get",
        url:"/getdata",
        dataType:"json",
        success:function(res){
           renderMap(res)
        }
    })
}
getData()

function getDataByRegion () {
    // layer.setMap(null);
    $.ajax({
        type:"get",
        url:"/getRegionData",
        data: {CulturalRegion: "'长安区','临潼区'"},
        dataType:"json",
        success:function(res){
            renderMap(res)
        }
    });
}

function renderMap (data) {
    var dataSource = [];
    dataSource = data.map(function (item){
        var tempArr = item.culturalCoordinate.split(",");
        tempArr[0] = parseFloat(tempArr[0]);
        tempArr[1] = parseFloat(tempArr[1]);
        return {
            lnglat: tempArr,
            name: item.culturalName,
        }
    });
    console.log("dataSource", dataSource)

    layer.setData(dataSource, {
        lnglat: 'lnglat'
    });
    layer.setOptions({
        style: {
            radius: 5,
            color: '#9999ff',
            borderColor: '#5a6aff',
            borderWidth: 1,
            opacity: 0.9,
        }
    });
    layer.render();
}

