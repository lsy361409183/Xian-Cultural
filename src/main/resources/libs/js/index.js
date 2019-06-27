$(function(){
    setHeight();
})
$(window).resize(function(){
    setHeight();
})

function setHeight(){
     // 获取浏览器高度，设置首页的高度，来一屏展示
     var clientHeight = $(window).height();
     var body_warp = $(".index_body_warp");
     body_warp.css("height", clientHeight + "px");
}