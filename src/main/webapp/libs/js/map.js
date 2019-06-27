var cl_map = new AMap.Map("wl_map_warp",{
    zoom:11,//级别
    center: [116.397428, 39.90923],//中心点坐标
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


var layer = new Loca.PointLayer({
    map: cl_map
});
// $.ajax({
//     type:"get",
//     url:"/getData",
//     data:{"unit": department, "code": centerNum},
//     dataType:"json",
//     success:function(res){
//         if(res.code==0){
          
//         }else{
            
//         }
//     }
// });
var data = [
    { "lnglat": [116.366794, 39.915309], "name": "西城区", "style": 2 }, 
    { "lnglat": [116.486409, 39.921489], "name": "朝阳区", "style": 2 }, 
    { "lnglat": [116.286968, 39.863642], "name": "丰台区", "style": 2 },
]
layer.setData(data, {
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
