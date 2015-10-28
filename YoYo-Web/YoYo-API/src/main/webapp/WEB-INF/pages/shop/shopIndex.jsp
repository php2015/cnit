<%@ page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>  
<%
    String path = "/"+ request.getContextPath().substring(1).split("\\/")[0];
			request.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title><sitemesh:write property='title' /></title>
<script type="text/javascript" src="${path}/resources/scripts/jquery/jquery-1.11.2.js"></script>
<script type="text/javascript" src="${path}/resources/scripts/cookie/jquery.cookie.js"></script>
<script type="text/javascript" src="${path}/resources/scripts/layer1.9.3/layer.js"></script>
<script type="text/javascript" src="${path}/resources/scripts/common/yoyo.js"></script>
<link rel="stylesheet" type="text/css" href="${path}/resources/styles/base.css" />
<link rel="stylesheet" type="text/css" href="${path}/resources/styles/common.css" />
<script type="text/javascript" src="${path}/resources/scripts/biz/common.js"></script>
<link rel="stylesheet" type="text/css" href="${path}/resources/styles/index.css" />
<link rel="stylesheet" type="text/css" href="${path}/resources/styles/sellIndex.css" />
<script type="text/javascript" src="${path}/resources/scripts/biz/shop/shop_index.js"></script>
<script type="text/javascript">
	var company="${company.companyId}";	
</script>
 <style>
.nContanier{clear:both;width:100%;position:relative;z-index:1;background:#ededed}.skSlider{width:100%;height:500px;position:relative;background:#000}.mtsBanner{width:auto;height:500px;background:#f6f6f6;overflow:hidden}.mtsBanner .bannerWrap{position:relative;width:auto;height:500px;overflow:hidden;box-shadow:inset 0 -2px 5px #dedede}.mtsBanner .bannerWrap li img{-webkit-transition:all .3s ease-in;-moz-transition:all .3s ease-in;-ms-transition:all .3s ease-in;transition:all .3s ease-in}.mtsBanner .bannerWrap li img{position:absolute}.mtsBanner .bannerWrap li img.mts_big{left:50%;margin-left:-430px}.mtsBanner .bannerWrap li img.mts_small{left:50%;margin-left:160px}.mtsBanner .bannerWrap li.on img.mts_big{animation:img-move-right 2s forwards;-o-animation:img-move-right 2s forwards;-moz-animation:img-move-right 2s forwards;-webkit-animation:img-move-right 2s forwards}.mtsBanner .bannerWrap li.on img.mts_small{animation:img-move-left 1s forwards;-o-animation:img-move-left 1s forwards;-moz-animation:img-move-left 1s forwards;-webkit-animation:img-move-left 1s forwards}@keyframes img-move-right{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(10px,0)}}@-o-keyframes img-move-right{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(10px,0)}}@-moz-keyframes img-move-right{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(10px,0)}}@-webkit-keyframes img-move-right{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(10px,0)}}@keyframes img-move-left{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(-10px,0)}}@-o-keyframes img-move-left{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(-10px,0)}}@-moz-keyframes img-move-left{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(-10px,0)}}@-webkit-keyframes img-move-left{0%{-webkit-transform:translate(0,0)}100%{-webkit-transform:translate(-10px,0)}}.slide_control{position:absolute;z-index:20;left:10px;bottom:15px}.mtsBanner a.move_left,.mtsBanner a.move_right{display:none;position:absolute;width:40px;height:100px;background:url(http://pic10.secooimg.com/imagesPic/homePic/slide_btn.png) no-repeat;left:50%;top:50%;margin-top:-50px;z-index:10;opacity:.5;filter:alpha(opacity=50)}.mtsBanner a.move_left{margin-left:-600px}.mtsBanner a.move_right{margin-left:560px;background-position:right 0}.mtsBanner a:hover.move_left,.mtsBanner a:hover.move_right{opacity:1;filter:alpha(opacity=100)}.mtsBanner .slide_control{position:absolute;z-index:20;bottom:10px;left:50%;margin-left:-230px;background:rgba(0,0,0,0.2)!important;filter:Alpha(opacity=50);background:#000;border-radius:10px;*padding:2px 0}.bgty{width:100%;height:10px;position:absolute;top:0;left:0;background:url(http://pic10.secooimg.com/imagesPic/homePic/pic31.png) repeat-x;z-index:7}.mtsBanner .bannerWrap li a{width:100%;height:500px;display:block}.mtsBanner .mall_dot,.mtsBanner .mall_dot_hover{width:10px;height:10px;line-height:15px;text-decoration:none;float:inherit;display:inline-block}.mtsBanner .mall_dot{background:#fff;text-indent:-20px;position:relative}.mtsBanner .mall_dot_hover{background:#463b7f;text-indent:-20px;-moz-opacity:1;opacity:1;filter:alpha(opacity=100)}.mall_dot,.mall_dot_hover{float:left;margin:0 5px;width:14px;overflow:hidden;height:14px;line-height:100px;text-align:center;font-weight:800;font-size:12px;color:white;cursor:pointer;font-family:Tahoma;text-decoration:none;background:#9d9fa2;border-radius:50%}.mall_dot_hover{background:#ed145b}.slidearrow{position:absolute;cursor:pointer;width:36px;height:36px;opacity:.3;top:50%;margin-top:-18px;background:#000;display:block;filter:alpha(opacity=30);color:#fff;text-align:center;font:bold 24px \5b8b\4f53,Hei;line-height:36px}.slidearrow:hover{opacity:.7;cursor:pointer}.slidearrow_l{left:0}.slidearrow_r{right:0}.silderBar{width:162px;height:350px;margin-left:430px;padding:0 10px;background:url(http://pic11.secooimg.com/imagesPic/homePic/navBg02.png) repeat;position:absolute;top:0;left:50%;z-index:8;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out}.silderBar ul{width:160px;border-top:1px solid #f1f1f1;padding-top:3px}.silderBar ul li{width:152px;height:133px;position:relative;margin:0 auto 0 auto;padding-bottom:8px}.silderBar ul li span img{border:1px solid #d8d4cd}.silderBar ul li.active{background:url(http://pic12.secooimg.com/imagesPic/homePic/pic30.png) no-repeat center bottom}.silderBar ul li p{color:#999}.silderBar ul li.active p{background-color:#9c003f;color:#fff}.silderBar ul li.actives p{background-color:#9c003f;color:#fff}.silderBar ul li.active p a{color:#fff}.silderBar .silderBarLink{width:150px;height:133px;display:block;position:absolute;left:0;top:0;background:url(about:blank)}.silderBar .silderBarLink01{width:150px;height:105px;display:block;position:absolute;left:0;top:0;background:url(about:blank)}.silderBar p{width:95%;height:20px;line-height:19px;text-align:center;position:absolute;bottom:12px;left:4px}.silderBar p a{display:inline-block;padding:0 5px;color:#999}.silderBar i{position:absolute;background:url(http://pic13.secooimg.com/imagesPic/homePic/pic27.png) no-repeat top center;-webkit-animation-duration:1s;animation-duration:1s;-webkit-animation-fill-mode:both;animation-fill-mode:both}.silderBar i.iM01{width:27px;height:26px;background-position:-166px -17px;left:74px;top:16px;display:block}.silderBar i.iM02{width:12px;height:6px;background-position:-143px -24px;left:69px;top:15px;display:block}.silderBar i.iM03{width:15px;height:16px;background-position:-117px -17px;left:78px;top:33px;display:block}.silderBar i.iM04{width:33px;height:38px;background-position:-67px -11px;left:60px;top:27px;display:block}.silderBar i.iM05{width:55px;height:55px;background-position:0 0;left:50px;top:17px;display:block}.active .iM01{-webkit-animation-name:slideInLeft;animation-name:slideInLeft}.active .iM02{-webkit-animation-name:bounceInDown;animation-name:bounceInDown}.active .iM03{-webkit-animation-name:rotateIn;animation-name:rotateIn}.active .iM04{-webkit-transform-origin:top right;-ms-transform-origin:top right;transform-origin:top right;-webkit-animation-name:swing;animation-name:swing}.active .iM05{-webkit-animation-name:rotateIn01;animation-name:rotateIn01}@keyframes slideInLeft{0%{opacity:0;-webkit-transform:translateX(-75px);-ms-transform:translateX(-75px);transform:translateX(-75px)}100%{-webkit-transform:translateX(0);-ms-transform:translateX(0);transform:translateX(0)}}@-webkit-keyframes slideInLeft{0%{opacity:0;-webkit-transform:translateX(-75px);-ms-transform:translateX(-75px);transform:translateX(-75px)}100%{-webkit-transform:translateX(0);-ms-transform:translateX(0);transform:translateX(0)}}@-webkit-keyframes bounceInDown{0%{-webkit-transform:translateY(1px);transform:translateY(1px)}60%{-webkit-transform:translateY(2px);transform:translateY(2px)}80%{-webkit-transform:translateY(0px);transform:translateY(0px)}100%{-webkit-transform:translateY(0);transform:translateY(0)}}@keyframes bounceInDown{0%{-webkit-transform:translateY(1px);transform:translateY(1px)}60%{-webkit-transform:translateY(2px);transform:translateY(2px)}80%{-webkit-transform:translateY(0px);transform:translateY(0px)}100%{-webkit-transform:translateY(0);transform:translateY(0)}}@-webkit-keyframes rotateIn{0%{-webkit-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(0);transform:rotate(0);opacity:1}}@keyframes rotateIn{0%{-webkit-transform-origin:left bottom;-ms-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(-200deg);-ms-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:left bottom;-ms-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(0);-ms-transform:rotate(0);transform:rotate(0);opacity:1}}@-webkit-keyframes rotateIn01{0%{-webkit-transform-origin:center center;transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:center center;transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(0);transform:rotate(0);opacity:1}}@keyframes rotateIn01{0%{-webkit-transform-origin:center center;-ms-transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(-200deg);-ms-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:center center;-ms-transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(0);-ms-transform:rotate(0);transform:rotate(0);opacity:1}}@-webkit-keyframes swing{20%{-webkit-transform:rotate(15deg);transform:rotate(15deg)}40%{-webkit-transform:rotate(-10deg);transform:rotate(-10deg)}60%{-webkit-transform:rotate(5deg);transform:rotate(5deg)}80%{-webkit-transform:rotate(-5deg);transform:rotate(-5deg)}100%{-webkit-transform:rotate(0deg);transform:rotate(0deg)}}@keyframes swing{20%{-webkit-transform:rotate(15deg);-ms-transform:rotate(15deg);transform:rotate(15deg)}40%{-webkit-transform:rotate(-10deg);-ms-transform:rotate(-10deg);transform:rotate(-10deg)}60%{-webkit-transform:rotate(5deg);-ms-transform:rotate(5deg);transform:rotate(5deg)}80%{-webkit-transform:rotate(-5deg);-ms-transform:rotate(-5deg);transform:rotate(-5deg)}100%{-webkit-transform:rotate(0deg);-ms-transform:rotate(0deg);transform:rotate(0deg)}}.floorList{width:1200px;padding:0 0 50px 0;margin:0 auto}.floor{margin:15px 0px;border:1px solid #f0f0f0;width:100%;overflow:hidden}.h3{height:46px;width:100%;position:relative;border-bottom:3px solid #333 !important;}.h3 i{width:215px;height:19px;display:block;background:url(http://pic14.secooimg.com/imagesPic/homePic/pic150518.png) no-repeat}.h3 .ftit01{background:0;width:auto}.h3 .ftit01 a,.h3 .ftit02 a,.h3 .ftit03 a,.h3 .ftit04 a,.h3 .ftit05 a,.h3 .ftit06 a,.h3 .ftit08 a,.h3 .ftit09 a{width:215px;height:19px;display:block}.h3 .ftit02{background-position:0 -31px}.h3 .ftit03{background-position:0 -58px}.h3 .ftit04{background-position:0 -84px}.h3 .ftit05{background-position:0 -111px}.h3 .ftit06{background-position:0 -138px}.h3 .ftit07{background-position:0 -164px}.h3 .ftit08{background-position:0 -5px}.h3 .ftit09{background-position:0 -422px}.h3 p{line-height:20px}.h3 p a{color:#999;padding:0 0 0 8px;white-space:nowrap}.h3 p a:hover{color:#9c003f}.h3 p.floorMore{padding-left:8px}.h3 p.floorMore .pipe{color:#999}.floor01{width:100%;overflow:hidden;padding-top:12px;font-size:0;text-align:right}.floor01 p{display:inline-block;*zoom:1;*display:inline;width:330px;height:166px;margin-left:10px;_display:inline;-webkit-transition:width .4s ease-in-out,height .4s ease-in-out;-moz-transition:width .4s ease-in-out,height .4s ease-in-out;-ms-transition:width .4s ease-in-out,height .4s ease-in-out;transition:width .4s ease-in-out,height .4s ease-in-out}.skSmallStyle .floor01{height:314px}.floor01 img{-webkit-transition:width .4s ease-in-out,height .4s ease-in-out;-moz-transition:width .4s ease-in-out,height .4s ease-in-out;-ms-transition:width .4s ease-in-out,height .4s ease-in-out;transition:width .4s ease-in-out,height .4s ease-in-out}.skSmallStyle .floor01 .firPic img{width:241px;height:314px}.skSmallStyle .floor01 .secPic img{width:241px;height:314px}.skSmallStyle .floor01 .twice img{width:279px;height:152px}.skSmallStyle .floor01 .lastPic img{width:210px;height:314px}.twice a{display:block}.floor02{width:100%;height:530px;position:relative}.classify{width:135px;padding:0 11px 0 14px;background-color:#fff;height:530px;overflow:hidden;position:absolute;left:0;top:0}.skSmallStyle .classify{width:165px;padding:0 21px 0 24px}.classify dl{padding:19px 0 15px 0;border-top:1px dashed #eee;margin-top:-1px}.classify dl dt{font-size:14px;color:#c69c6d;font-weight:bold;height:23px}.classify dl a{width:62px;padding-right:5px;display:inline-block;height:21px;line-height:21px;overflow:hidden;white-space:nowrap;float:left}.skSmallStyle .classify dl a{width:76px}.lastDl{position:relative;z-index:1}.classify img{position:absolute;left:0;bottom:0;width:160px;height:108px}.floorBanner{width:85.83%;height:530px;overflow:hidden;position:relative;margin-left:14.17%}.skSmallStyle .floorBanner{width:76.76%;margin-left:23.24%}.floorBanner a{position:absolute;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;opacity:1}.flbanner01{left:0;top:0}.flbanner02{left:0;top:360px}.flbanner03{left:520px;top:0}.flbanner04{left:520px;top:180px}.flbanner05{left:780px;top:0}.flbanner06{left:780px;top:180px}.flbanner07{left:780px;top:360px}.skSmallStyle .flbanner02{left:0;top:660px;opacity:0}.skSmallStyle .flbanner05{left:0;top:360px}.skSmallStyle .flbanner06{left:260px;top:360px}.skSmallStyle .flbanner07{left:1000px;top:360px;opacity:0}.floor03{width:100%}.jmCenter{width:780px;height:350px;overflow:hidden;position:relative}.skSmallStyle .jmCenter{width:570px}.jmCenterList{width:250px;float:left;margin-left:10px;_display:inline;background-color:#fff;height:350px;position:relative;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out}.skSmallStyle .jmCenterList{width:275px}.es-carousel-wrapper{position:relative}.es-carousel{overflow:hidden}.es-carousel ul{display:none}.es-carousel ul li{height:100%;float:left;display:block}.skSmallStyle .es-carousel ul li{padding-left:8px}.es-nav span{position:absolute;top:50%;left:12px;background:url(http://pic14.secooimg.com/imagesPic/homePic/pic32.png) no-repeat 0 0;width:14px;height:23px;margin-top:-12px;text-indent:-9000px;cursor:pointer;opacity:.5;filter:alpha(opacity=50)}.es-nav span.es-nav-next{right:12px;left:auto;background-position:-14px 0}.es-nav span:hover{opacity:1.0;filter:alpha(opacity=100)}.esTit{font:500 16px/1.5 microsoft yahei;color:#9c003f;width:100%;text-align:center;position:absolute;left:0;top:20px;z-index:55}.epic{width:100%;text-align:center;margin-top:35px}.ename{height:36px;line-height:18px;overflow:hidden;width:70%;text-align:center;padding-top:8px;margin:0 auto}.ename a{color:#666}.eskprice{color:#666;width:70%;text-align:center;margin:0 auto;padding-top:5px}.rmb{font-family:microsoft yahei}.jmRight{width:170px}.topai,.tosell{width:100%;height:42px;text-align:center;background:url(http://pic14.secooimg.com/imagesPic/homePic/pic150518.png) no-repeat;display:block;text-indent:-9999px}.topai{background-position:0 -240px}.tosell{background-position:0 -283px}.topai:hover{background-position:0 -326px}.tosell:hover{background-position:0 -369px}.topai:hover,.tosell:hover{color:#fff}.skSmallStyle .fsFixedTopContent{margin-left:505px}.fsFixedTopContent{margin-left:610px;z-index:999998;display:none;overflow:visible;width:40px;height:500px;position:fixed;left:50%;top:50%;margin:-250px 0 0 610px;z-index:3333;padding-bottom:60px}.fsFixedTop{width:40px;height:500px;-webkit-transform:scale(1.2);-moz-transform:scale(1.2);transform:scale(1.2);opacity:0;-webkit-transition:all .3s ease;-moz-transition:all .3s ease;transition:all .3s ease;position:absolute;left:0;top:0}.fsFixedTop a{width:40px;height:35px;line-height:35px;display:block;position:relative;margin-top:1px;cursor:pointer}.fsFixedTop a.fsa{background-color:#eaeaea}.fsFixedTop b{width:18px;height:18px;position:absolute;background:url(http://pic14.secooimg.com/imagesPic/homePic/pic150518.png) no-repeat;left:50%;top:50%;margin:-9px 0 0 -9px;z-index:1}.fsFixedTop a.fasApp:hover{background-color:#c69c6d}.fsFixedTop a.fasApp:hover b{background-position:-192px -392px}.fsFixedTop a.fasApp span{width:75px;background:#fff;padding:5px;position:absolute;left:-85px;top:0;display:none;box-shadow:-2px 0 15px #d1d1d1;line-height:20px;text-align:center;color:#333}.fsFixedTop a.fasApp:hover span{display:inline-block}.fsFixedTop b.fs01{background-position:0 -457px}.fsFixedTop b.fs02{background-position:-18px -457px}.fsFixedTop b.fs03{background-position:-36px -457px}.fsFixedTop b.fs04{background-position:-54px -457px}.fsFixedTop b.fs05{background-position:-72px -457px}.fsFixedTop b.fs06{background-position:-90px -457px}.fsFixedTop b.fs07{background-position:-108px -457px}.fsFixedTop b.fs08{background-position:-126px -457px}.fsFixedTop b.fs09{background-position:-144px -457px}.fsFixedTop b.fs10{background-position:-162px -455px;width:20px;height:20px;margin:-10px 0 0 -10px}.fsFixedTop b.fs11{background-position:-182px -457px}.fsFixedTop .fs-name{width:40px;height:35px;line-height:35px;color:#fff;background:#c69c6d;display:inline-block;text-align:center;position:absolute;left:0;top:0;z-index:2;display:none}.fsFixedTop em.fs-name-ad{height:25px;line-height:12px;padding:5px 0;vertical-align:text-top}.fsFixedTop .fs-line{display:block;width:10px;margin-left:-5px;height:0;line-height:0;font-size:0;border-top:1px solid #e5e5e5;position:absolute;left:50%;top:34px;z-index:3}.fsFixedTop a.active .fs-name{background:#f6f6f6;color:#9c003f;display:block}.fsFixedTop a.active .fs{display:none}.fsFixedTop a.active .fs-name:hover{background:#c69c6d;color:#fff}.fsFixedTop a:hover .fs-name{display:block}.fsFixedTop a:hover .fs-line{display:none}.skSmallStyle .floor01 .firPic01 img{width:490px;height:198px}.skSmallStyle .floor01 .secPic01 img{width:490px;height:198px}.skSmallStyle .floor01{height:198px;text-align:left;padding-left:180px}.floorBanner a:hover .bannrPrice{color:#737373}.bannrPrice{line-height:1;white-space:nowrap;position:absolute;font-style:normal;font-family:microsoft yahei;color:#737373}.flbanner03 i{left:15px;top:62px}.flbanner04 i{width:250px;text-align:center;left:0;top:41px}.flbanner05 i{left:15px;top:62px}.flbanner06 i{left:15px;top:59px}.flbanner07 i{left:15px;top:61px}.sliderDitui{width:826px;height:498px;padding:10px;background:#fbfbfb;box-shadow:0 0 5px #333;position:fixed;left:50%;top:50%;margin:-1200px 0 0 -413px;z-index:99999;-webkit-transition:all .3s ease;-moz-transition:all .3s ease;transition:all .3s ease}.sliderDitui img{vertical-align:top}.sliderDitui span{width:28px;height:28px;position:absolute;cursor:pointer;right:-10px;top:-10px;-webkit-transition:all .3s ease;-moz-transition:all .3s ease;transition:all .3s ease}.sliderDitui span:hover{-webkit-transform:rotate(180deg);-moz-transform:rotate(180deg);transform:rotate(180deg)}.sliderDituiBgs{width:100%;position:absolute;left:0;top:0;z-index:4444;background-color:#000;box-shadow:0 1px 0 rgba(0,0,0,.1),0 1px 2px rgba(0,0,0,.1);opacity:.6;filter:alpha(opacity=60);display:none}.classify dl a.active{color:#9b0141}.flashBuy{width:100%;position:relative;height:580px}.flashBuyList{width:940px;overflow:hidden}.flashPro{width:250px;position:absolute;right:0;top:-10px}.flashPro a{width:250px;height:186px;display:block;position:relative;margin-top:10px}.flashPro i{left:15px;top:62px}.flashListCon{width:100%;overflow:hidden}.flashListCon ul{margin-left:-10px}.flashListCon ul li{width:465px;height:250px;overflow:hidden;float:left;background:#fff;margin:10px 0 0 10px;display:inline}.flash_tips dl{padding:12px 0 13px 0}.flash_tips dt{padding:5px 36px 3px;border-right:1px dashed #eaeaea}.flash_tips dd{padding:0 0 0 20px}.flash_zk{font-size:18px;font-family:microsoft yahei;color:#9c003f;line-height:1}.flash_zk strong{font-size:24px;font-weight:normal}.flash_tips .padTop_10{padding-top:6px}.flash_wo a{color:#333}.flashBrand{width:100%;height:38px;background:#fff;padding:10px 20px}.thumbCon{margin-left:-12px}.thumb{display:block;width:118px;height:38px;position:relative;float:left;margin-left:12px;_display:inline}.thumb-wrapper{display:block;width:100%;height:100%}.thumb img{width:100%;height:100%;position:absolute;display:block}.thumb .thumb-detail{display:block;width:100%;height:100%;position:absolute;background:#fff;font-family:arial;font-weight:bold;font-size:16px}.thumb .thumb-detail a{display:block;width:100%;height:36px;text-align:center;line-height:36px;border:1px solid #f2f2f2;background-color:#f6f6f6}.thumb .thumb-detail span{font-family:microsoft yahei;font-size:16px}.thumb.scroll{overflow:hidden}.thumb.scroll .thumb-detail{bottom:-280px}.thumb.flip{-webkit-perspective:800px;-moz-perspective:800px;-ms-perspective:800px;-o-perspective:800px;perspective:800px}.thumb.flip .thumb-wrapper{-webkit-transition:-webkit-transform .5s;-moz-transition:-moz-transform .5s;-ms-transition:-moz-transform .5s;-o-transition:-moz-transform .5s;transition:-moz-transform .5s;-webkit-transform-style:preserve-3d;-moz-transform-style:preserve-3d;-ms-transform-style:preserve-3d;-o-transform-style:preserve-3d;transform-style:preserve-3d}.thumb.flip .thumb-detail{-webkit-transform:rotateY(-180deg);-moz-transform:rotateY(-180deg);-ms-transform:rotateY(-180deg);-o-transform:rotateY(-180deg);transform:rotateY(-180deg)}.thumb.flip img,.thumb.flip .thumb-detail{-webkit-backface-visibility:hidden;-moz-backface-visibility:hidden;-ms-backface-visibility:hidden;-o-backface-visibility:hidden;backface-visibility:hidden}.thumb.flip .flipIt{-webkit-transform:rotateY(-180deg);-moz-transform:rotateY(-180deg);-ms-transform:rotateY(-180deg);-o-transform:rotateY(-180deg);transform:rotateY(-180deg)}.skSmallStyle .flashPro{display:none}.skSmallStyle .flashBuyList{width:990px}.skSmallStyle .flashListCon ul li{width:490px}.skSmallStyle .flash_pic img{width:490px;height:189px}.skSmallStyle .flash_tips dl{padding:6px 0 7px 0}.skSmallStyle .thumb{margin-left:18px}.side-bar{position:absolute;top:0;right:50%;margin-right:373px;width:50%;height:350px}.side-bar .side-b-con{width:100%;height:350px;background:url(http://pic14.secooimg.com/home/p_08.png) repeat;position:absolute;top:0}.side-bar .side-bd{width:203px;height:350px;float:right;margin-right:24px}.side-bar .side-bg{width:203px;height:60px;background:url(http://pic12.secooimg.com/home/p_07.png?t=20150115) no-repeat;display:block}.side-bar .side-bg-01{background-position:-203px -55px}.side-bar .side-bg-02{background-position:-203px -135px}.side-bar .side-bg-03{background-position:-203px -215px}.active .side-bg-01{background-position:0 -55px}.active .side-bg-02{background-position:0 -135px}.active .side-bg-03{background-position:0 -215px}.side-bar i{position:absolute;background:url(http://pic14.secooimg.com/home/p_09.png?20141202) no-repeat top center;-webkit-animation-duration:1s;animation-duration:1s;-webkit-animation-fill-mode:both;animation-fill-mode:both}.side-bar i.iM01{width:24px;height:34px;background-position:-76px 0;left:36px;top:13px;display:block}.side-bar i.iM02{width:9px;height:5px;background-position:-101px 0;left:35px;top:10px;display:block}.side-bar i.iM03{width:10px;height:10px;background-position:-115px 0;left:38px;top:22px;display:block}.side-bar i.iM04{width:26px;height:28px;background-position:-48px 0;left:33px;top:21px;display:block}.side-bar i.iM05{width:33px;height:33px;background-position:0 0;left:25px;top:12px;display:block}.active .iM01{-webkit-animation-name:slideInLeft;animation-name:slideInLeft}.active .iM02{-webkit-animation-name:bounceInDown;animation-name:bounceInDown}.active .iM03{-webkit-animation-name:rotateIn;animation-name:rotateIn}.active .iM04{-webkit-transform-origin:top right;-ms-transform-origin:top right;transform-origin:top right;-webkit-animation-name:swing;animation-name:swing}.active .iM05{-webkit-animation-name:rotateIn01;animation-name:rotateIn01}.side-bd .side-tit{font:16px microsoft yahei;color:#fff;margin-top:26px;margin-bottom:16px}.side-bar .side-bd li{width:203px;height:60px;position:relative;margin:0 auto 20px auto;overflow:hidden}.side-bar p{position:absolute;bottom:8px;left:72px;width:95%;height:20px;color:#7f69b3;text-align:left;line-height:20px}.side-bar .side-bd li{width:203px;height:60px;position:relative;margin:0 auto 20px auto;overflow:hidden}.side-bar .silderBarLink{position:absolute;top:0;left:0;display:block;width:203px;height:60px;background:url(about:blank)}.side-bar p a{display:inline-block;padding:0 4px 0 0;color:#7f69b3}.side-link a{padding:0 7px;color:#999}.side-link a:hover{color:#d7ab70}.side-bar ul li p a:hover,.side-bar ul li.active p{color:#fff}.nheader{box-shadow:0 0 3px #ccc}@keyframes slideInLeft{0%{opacity:0;-webkit-transform:translateX(-75px);-ms-transform:translateX(-75px);transform:translateX(-75px)}100%{-webkit-transform:translateX(0);-ms-transform:translateX(0);transform:translateX(0)}}@-webkit-keyframes slideInLeft{0%{opacity:0;-webkit-transform:translateX(-75px);-ms-transform:translateX(-75px);transform:translateX(-75px)}100%{-webkit-transform:translateX(0);-ms-transform:translateX(0);transform:translateX(0)}}@-webkit-keyframes bounceInDown{0%{-webkit-transform:translateY(1px);transform:translateY(1px)}60%{-webkit-transform:translateY(2px);transform:translateY(2px)}80%{-webkit-transform:translateY(0px);transform:translateY(0px)}100%{-webkit-transform:translateY(0);transform:translateY(0)}}@keyframes bounceInDown{0%{-webkit-transform:translateY(1px);transform:translateY(1px)}60%{-webkit-transform:translateY(2px);transform:translateY(2px)}80%{-webkit-transform:translateY(0px);transform:translateY(0px)}100%{-webkit-transform:translateY(0);transform:translateY(0)}}@-webkit-keyframes rotateIn{0%{-webkit-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(0);transform:rotate(0);opacity:1}}@keyframes rotateIn{0%{-webkit-transform-origin:left bottom;-ms-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(-200deg);-ms-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:left bottom;-ms-transform-origin:left bottom;transform-origin:left bottom;-webkit-transform:rotate(0);-ms-transform:rotate(0);transform:rotate(0);opacity:1}}@-webkit-keyframes rotateIn01{0%{-webkit-transform-origin:center center;transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:center center;transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(0);transform:rotate(0);opacity:1}}@keyframes rotateIn01{0%{-webkit-transform-origin:center center;-ms-transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(-200deg);-ms-transform:rotate(-200deg);transform:rotate(-200deg);opacity:0}100%{-webkit-transform-origin:center center;-ms-transform-origin:center center;transform-origin:center center;-webkit-transform:rotate(0);-ms-transform:rotate(0);transform:rotate(0);opacity:1}}@-webkit-keyframes swing{20%{-webkit-transform:rotate(15deg);transform:rotate(15deg)}40%{-webkit-transform:rotate(-10deg);transform:rotate(-10deg)}60%{-webkit-transform:rotate(5deg);transform:rotate(5deg)}80%{-webkit-transform:rotate(-5deg);transform:rotate(-5deg)}100%{-webkit-transform:rotate(0deg);transform:rotate(0deg)}}@keyframes swing{20%{-webkit-transform:rotate(15deg);-ms-transform:rotate(15deg);transform:rotate(15deg)}40%{-webkit-transform:rotate(-10deg);-ms-transform:rotate(-10deg);transform:rotate(-10deg)}60%{-webkit-transform:rotate(5deg);-ms-transform:rotate(5deg);transform:rotate(5deg)}80%{-webkit-transform:rotate(-5deg);-ms-transform:rotate(-5deg);transform:rotate(-5deg)}100%{-webkit-transform:rotate(0deg);-ms-transform:rotate(0deg);transform:rotate(0deg)}}.skSmallStyle .side-bar{margin-right:20%}.skSmallStyle .floor01 p{width:260px;overflow:hidden}.orderDivShow{display:block}.orderDivMain a i{border-left:4px solid transparent;border-right:4px solid transparent;border-bottom:4px solid transparent;border-top:4px solid #fff;top:16px;display:none;}.fixedOn{position:fixed;width:100%;height:50px;background:#fff url(http://pic12.secooimg.com/home/secoo_min_logo.png) no-repeat center;top:0;left:0;display:none;z-index:92;box-shadow: 0 0 3px #ccc;}.fixedOn .searchCont{left:50%;top:8px;margin-left:-367px}.fixedOn .searchInput .typeInput{width:584px}.fixedOn .searchHot,.fixedOn .head_navBar,.fixedOn .navApps{display:none!important;*zoom:1;}
.skSmallStyle .mtsBanner .bannerWrap li img.mts_big{margin-left:-325px;}
.skSmallStyle .fixedOn {width: 100%;background-position: left;}
.skSmallStyle .mtsBanner a.move_right{right:0; left:auto;}
.skSmallStyle .fixedOn .searchCont{left:267px;margin-left: -100px;}.banner-container{width: 1200px;height: 500px;overflow: hidden;margin: auto; position:relative; z-index:1}
.floor .h3 .fl{padding: 5px 15px;}
.floor .h3 .fr{padding: 15px 10px;}
.floor .h3 .fl strong{font-size: 24px; background-color: transparent !important;color: #333 !important;text-align: left !important;}
.flbanner01 img{width: 510px;height: 350px}
.flbanner02 img{width: 510px;height: 170px}
.flbanner03 img{width: 250px;height: 170px}
.flbanner04 img{width: 250px;height: 350px}
.flbanner05 img{width: 250px;height: 170px}
.flbanner06 img{width: 250px;height: 170px}
.flbanner07 img{width: 250px;height: 170px}
</style>
</head>
<body>
<!--header-->
<c:import url="../index/head.jsp"></c:import>
<div class="header">
	<!--店铺评分-->
  <div class="sell_txt">
        <dl class="clearfix fr">
            <dt>${company.storeName}</dt>
<%--             <dd class="sell_ddimg"><img src="${company.image}" alt="" /></dd> --%>
<!--             <dd>9.71分</dd> -->
			<c:if test="${sessionScope.accountType==100}">
            <dd><a class="red" href="javascript:focuseShop(${company.companyId});">加关注</a></dd> 
            </c:if>
<!--             <dd><a class="red" href="javascript:;">给客服留言</a></dd> -->
        </dl>
    </div>

    <!--店铺logo-->
    <div class="billboard ">
    	<h2 class="bill_logo fl"><a href="javascript:;"><img width="145" height="70" src="${company.image}" alt="" /></a></h2>
    	<p class="fl">${company.storeName}</p>
    </div>
    <!--网站主导航-->
  <div class="nav">
    	<div class="nav_in">
        	<ul>
            	<li>
                    <a class="first" href="javascript:;">所有商品分类</a>
                </li>
            	<li>
					<a href="${portalPath}/index">首页</a>
                </li>
            	<li>
                    <a href="javascript:;">聚划算</a>
                </li>
            	<li>
                    <a href="javascript:;">韩日车城</a>
                </li>
            	<li>
                    <a href="javascript:;">通用车城</a>
                </li>
            	<li>
                    <a href="javascript:;">YOYO团</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<!--header end-->

<div class="skSlider">
	<div id="mtsBanner" class="mtsBanner">
		<ul style="position: relative; z-index: 0; margin: 0px; padding: 0px; overflow: hidden; width: 100%;" class="bannerWrap">
			<c:forEach var="focus" items="${shopFocusAd}">
        	<li style="background-color: #f3f3f3">
        		<div class="banner-container">
        		<a href="${focus.focusUrl}" target="_blank">
        			<img src="${focus.focusImg}" alt="${focus.focusTitle}" height="500" width="1200"/>
        		</a>
        		</div>
        	</li>
    		</c:forEach>
		</ul>
	</div>
</div>

<div class="main">
  <!--1F-->
  <c:if test="${fn:length(shopCarCoupon)>0}">
  <div class="f_1">
    	<div class="stor sell_stor">
        	<h2 class="fl">新车优惠</h2>
        </div>
        <div class="car_show">
        	<ul class="clearfix">
        	
        		<c:forEach items="${shopCarCoupon}" var="carCoupon">
            	<li>
                    <a class="clearfix" href="${portalPath}/goodsManager/goodsIndex?goodsId=${carCoupon.goodsId}" target="_blank">
                       <img src="${carCoupon.picturePath}" width="196" height="100" /> 
	                   <h4>${carCoupon.productName}</h4>
	                   <h3 class="red">${carCoupon.price}<span>元起</span></h3>
	                   <h5>${carCoupon.selasTitle}</h5>
                    </a>
	                   <c:if test="${carCoupon.hotIcon eq 1}">    
	                   <b class="tag">人气</b>
	                   </c:if>
                </li>
				</c:forEach>
            </ul>
      </div>
    </div>
    </c:if>
  <c:forEach var="indexPush" items="${shopIndexPush}">
  <div class="floor">
            	<h3 class="h3">
                	<span class="fl">
                		<strong>${indexPush.title}</strong>
                	</span>                	
                    <span class="fr">
                    <c:forEach var="title" items="${indexPush.titlePushs}">
						<a  target="_blank" href="${title.href}">${title.title}</a>
					</c:forEach> 						
                    </span>
                </h3>
                
                <div class="floor02 clearfix">
                    <div class="classify">
						<c:forEach var="left" items="${indexPush.leftPushs}">
                        <dl>
                            <dd class="clearfix">
								<a href="${left.href}" target="_blank">${left.title}</a>
                            </dd>
                        </dl>
                        </c:forEach>
                    </div>
                    
                    <div class="floorBanner">                    	
                    	<c:forEach var="right" items="${indexPush.rightPushs}" varStatus="status">
					    <a class="flbanner0${status.index+1}" target="_blank" href="${right.title}">
                        	<img src="${right.img}" class="lazyImg" style="display: inline; opacity: 1;" />
							<i class="bannrPrice">${right.price}</i>
                        </a>
                        </c:forEach>                
                    </div>
                    
                </div> 
            </div>
  </c:forEach>
</div>
<!--main end-->
</body>
</html>