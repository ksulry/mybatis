
//获取插件版本
function getPluginVersion(){
    var ocx = document.getElementById("HWPostil1");
    alert(ocx.getPluginVersion());

}
//隐藏组件
function setCompositeVisible(){
    //ocx.setCompositeVisible("menubar", true);
    var ocx = document.getElementById("HWPostil1");
    ocx.setCompositeVisible("open", false);
}
//显示组件
function queryCompositeVisible(){
    var ocx = document.getElementById("HWPostil1");
    ocx.setCompositeVisible("open", true);
}
//禁用组件
function setCompositeEnable(){
    var ocx = document.getElementById("HWPostil1");
    ocx.setCompositeEnable("open", false);
}
//启用组件
function startCompositeEnable(){
    var ocx = document.getElementById("HWPostil1");
    ocx.setCompositeEnable("open", true);
}

//设置视图首选项
function setViewPreference(){//不好用
    var ocx = document.getElementById("HWPostil1");
    ocx.setViewPreference("navigator","thumbnail");
}
//打开文件
function openFile()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.openFile("");
    }
}
//打开服务器文档
function openFileServer()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.openFile("http://192.168.1.220:8082/uploadPDF/black.ofd");
    }
}
//保存文件
function saveFile()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.saveFile("");
    }
}
//上传服务器
function saveFileServer()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.saveFile("http://192.168.1.220:8082/uploadPDF/saveTo.jsp");
    }
}
//另存为文件
function saveFileAs()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.performClick("file_saveas");
    }
}
//关闭文件
function closeFile()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.closeFile();
    }
}
//打印文件
function printFile()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.printFile("", false);
    }
}

function addFreeText()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        var reVer = ocx.addFreeText("{\"text\":\"Dianju Freetext Demo!\",\"page-index\":\"1\",\"pos-x\":10,\"pos-y\":100,\"width\":50,\"height\":40,\"font-family\":\"simsun\",\"font-size\":8,\"font-style\":\"italic\",\"font-weight\":\"bold\",\"font-color\":\"#ff0000\"}");
        alert(reVar);
    }
}
function getFreeTextContentById()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        var reVer = ocx.getFreeTextContentById("");
        alert(reVar);
    }
}
function modifyFreeTextById()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.modifyFreeTextById("","");
    }
}
function deleteAllFreeText()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.deleteAllFreeText("", "");
    }
}
function sealSignBySetting()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.sealSignBySetting("{\"oesname\":\"Dianju\",\"sealid\":\"1\",\"passwd\":\"12345678\",\"range\":\"0-2\",\"xpos\":100,\"ypos\":180}");
    }
}
function getSignaturesCount()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        var reVar = ocx.getSignaturesCount("");
        alert(reVar);
    }
}
function validSignature()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.validSignature(false, "");
    }
}
function addColorTemplate()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.addColorTemplate("{\"page-index\":\"1\",\"pos-x\":0,\"pos-y\":0,\"width\":210,\"height\":110,\"color-range\":\"#000000-#ffffff\",\"dst-color\":\"#ff0000\"}");
    }
}
function adjustColor()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.adjustColor("0");
    }
}

//设置页面显示比例
function setZoomRadio(){
    var ocx = document.getElementById("HWPostil1");
    ocx.setZoomRadio(120);
}

//获取页面显示比例
function getZoomRadio(){
    var ocx = document.getElementById("HWPostil1");
    var reVar = ocx.getZoomRadio();
    alert(reVar);
}

//设置用户名
function setUserName(){
    var ocx = document.getElementById("HWPostil1");
    var reVar = ocx.setUserName("HWSEALDEMO");
    alert(reVar);
}

//获取用户名
function getUserName(){
    var ocx = document.getElementById("HWPostil1");
    var reVar = ocx.getUserName();
    alert(reVar);
}

//设置印章标识
function setSealId(){
    var ocx = document.getElementById("HWPostil1");
    ocx.setSealId("01");
    alert("设置成功");
}

//获取印章标识
function getSealId(){
    var ocx = document.getElementById("HWPostil1");
    ocx.getSealId();
}

//设置文档元数据
function setMetaData(){
    var ocx = document.getElementById("HWPostil1");
    ocx.setMetaData("title","123");
}

//获取文档元数据
function getMetaData(){
    var ocx = document.getElementById("HWPostil1");
    alert(ocx.getMetaData("title"));
}

//设置日志服务器地址
function setLogSvrURL(){
    var ocx = document.getElementById("HWPostil1");
    var reVar = ocx.setLogSvrURL("http://192.168.1.234:8080/Seal/doc/saveTo.jsp");
    alert(reVar);
}

//添加追踪水印
function addTrackInfo(){
    var ocx = document.getElementById("HWPostil1");
    var xmlstr="<trackinfo type=\"image\" patterntype=\"center\" imagefile=\"/opt/dianju/seal.png\" rotate=\"0\" opacity=\"100\"  fontname=\"simsun\"  fontsize=\"10.5\" fontcolor=\"#00ff00\" zoom=\"1\" offsetx=\"0\" offsety=\"0\"/>";
    ocx.addTrackInfo(xmlstr);
}

//添加文字水印
function addTrackInfoText(){
    var ocx = document.getElementById("HWPostil1");
    var xmlstr="<trackinfo type=\"text\" patterntype=\"center\" content=\"测试\" rotate=\"0\" opacity=\"100\"    fontsize=\"10.5\" fontcolor=\"#00ff00\" zoom=\"1\" offsetx=\"0\" offsety=\"0\"/>";
    ocx.addTrackInfo(xmlstr);
}

//base64水印
function addTrackInfoData(){
    var ocx = document.getElementById("HWPostil1");
    var xmlstr="<trackinfo type=\"image\" patterntype=\"center\"  rotate=\"0\" opacity=\"10\"  fontname=\"simsun\"  fontsize=\"10.5\" fontcolor=\"#00ff00\" zoom=\"1\" offsetx=\"0\" offsety=\"0\"/>";
    //var base64Data = ocx.fileToBase64("/mnt/hgfs/OFDReader/file/timg.png");
    var base64Data = ocx.fileToBase64("/opt/dianju/seal.png");
    alert(base64Data);
    ocx.addTrackInfo(xmlstr, base64Data);
}

//清除追踪水印
function clearTrackInfo(){
    var ocx = document.getElementById("HWPostil1");
    ocx.clearTrackInfo();
}

//获取语义内容
function getTaggedText(){
    var ocx = document.getElementById("HWPostil1");
    var reVar = ocx.getTaggedText("公文体/版头/密级");
    alert(reVar);
}

//获取日志文件路径
function getLogFilePath(){
    var ocx = document.getElementById("HWPostil1");
    var reVar = ocx.getLogFilePath();
    alert(reVar);
}
//添加打印监听
function registListener(){
    var ocx = document.getElementById("HWPostil1");
    ocx.registListener("file_print", "print_callback", false);
    //ocx.registListener("file_save", "print_callback", false);
    //ocx.registListener("file_saveurl", "print_callback", false);
    //ocx.registListener("file_saveas", "print_callback", false);
    //ocx.registListener("edit_copy", "print_callback", false);
    //ocx.registListener("file_export", "print_callback", false);

    //ocx.registListener("file_print", "print_callback", true);
    //ocx.registListener("file_save", "print_callback", true);
    //ocx.registListener("file_saveurl", "print_callback", true);
    //ocx.registListener("file_saveas", "print_callback", true);
    //ocx.registListener("edit_copy", "print_callback", true);
    //ocx.registListener("file_export", "print_callback", true);
}
function print_callback(str1)
{
    var ocx = document.getElementById("HWPostil1");
    alert(str1);
    return "{\"end\":1}";   //end operate,not allowed print
//\"tips\":\"11111111\"

}
//添加二维码
function insertPictureCode(){
    var ocx = document.getElementById("HWPostil1");
    ocx.insertPictureCode("QRBARUTF8DATA:12dafsdfsfs34", 1, 100.0, 10.0, 300);
}
function clearPictureCode(){
    var ocx = document.getElementById("HWPostil1");
    ocx.clearPictureCode();
}
function performClick(){
    var ocx = document.getElementById("HWPostil1");
    ocx.performClick("file_print");
}

//保存监听
function saveFileListener(){
    var ocx = document.getElementById("HWPostil1");
    ocx.registListener("file_save", "saveFile_callback", false);

}
function saveFile_callback(str1)
{
    var ocx = document.getElementById("HWPostil1");
    alert(str1);
    return "{\" \":1}";
}




//=================================================
var annotId;
var annotContent;
function addFreeText()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        annotId = ocx.addFreeText("{\"text\":\"Dianju Freetext Demo!\",\"page-index\":\"0\",\"pos-x\":20,\"pos-y\":20,\"width\":100,\"height\":40,\"font-family\":\"simsun\",\"font-size\":12,\"font-style\":\"italic\",\"font-weight\":\"bold\",\"font-color\":\"#ff0000\"}");

        alert(annotId);
    }
}
function getFreeTextContentById()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        annotContent = ocx.getFreeTextContentById(annotId);
        alert(annotContent);
    }
}
function modifyFreeTextById()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.modifyFreeTextById(annotId,"{\"text\":\"Dianju Freetext Demo1111111111!\"}");
    }
}

function deleteAllFreeText()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.deleteAllFreeText("", "");
    }
}
var sealret;
function sealSignBySetting()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        //sealret = ocx.sealSignBySetting("{\"oesname\":\"Dianju\",\"sealid\":\"1\",\"passwd\":\"12345678\",\"range\":\"0-3\",\"xpos\":30,\"ypos\":30}");
        ocx.performClick("doc_sealsign");

    }
}
var sigcount;
function getSignaturesCount()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        sigcount = ocx.getSignaturesCount("");
        alert(sigcount);
    }
}
var vaildret;
function validSignature()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        vaildret = ocx.getSignatureID(1);
        //alert(vaildret);
        vaildret = ocx.validSignature(false, vaildret);
        alert(vaildret);
    }
}
function addColorTemplate()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.addColorTemplate("{\"page-index\":\"0\",\"pos-x\":0,\"pos-y\":0,\"width\":210,\"height\":70,\"color-range\":\"#000000-#000000\",\"dst-color\":\"#ff0000\"}");
    }
}
function adjustColor()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.adjustColor("0");
    }
}
function registListener(){
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        //事前监听
        ocx.registListener("file_print", "listener_callback", false);
        ocx.registListener("file_save", "listener_callback", false);
        ocx.registListener("file_saveurl", "listener_callback", false);
        ocx.registListener("file_saveas", "listener_callback", false);
        ocx.registListener("edit_copy", "listener_callback", false);
        ocx.registListener("file_export", "listener_callback", false);

        //事后监听
        ocx.registListener("file_print", "listener_aftercallback", true);
        ocx.registListener("file_save", "listener_aftercallback", true);
        ocx.registListener("file_saveurl", "listener_aftercallback", true);
        ocx.registListener("file_saveas", "listener_aftercallback", true);
        ocx.registListener("edit_copy", "listener_aftercallback", true);
        ocx.registListener("file_export", "listener_aftercallback", true);
    }
}
var str_2;
function listener_callback(str1)
{
    var con;
    str_2 = "事前监听 是否允许该操作执行：" + str1;
    con = confirm(str_2);
    if(con==false) return "{\"end\":1,\"tips\":\"Stop operate!\"}";   //终止操作，停止打印等操作
}
function listener_aftercallback(str1)
{
    var con;
    str_2 = "事后监听：" + str1;
    con = alert(str_2);
}
function getPageTxt()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        str_2 = ocx.getPageTxt(0, true);
        alert(str_2);
    }
}
function getPageImgData()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        str_2 = ocx.getPageImgData(0, 96, "png");
        alert(str_2);
    }
}
function extractPage()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        ocx.extractPage("0-1", "/tmp/dj_extract.ofd");
        alert("extract to /tmp/dj_extract.ofd");
    }
}
function mergeFile()
{
    var ocx = document.getElementById("HWPostil1");
    if (ocx!=null)
    {
        alert("mergefile /tmp/111.ofd");
        ocx.mergeFile("/tmp/111.ofd", -1);
    }
}
