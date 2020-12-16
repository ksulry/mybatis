
var httpaddr = "";

/***************打开文件*******************
 url         文件地址。为空这弹出选择文件框
 ******************************************/
function loadfile(url){
    var ocx = document.getElementById("HWPostil1");
    var IsOpen = ocx.LoadFile(url);
    if (IsOpen != 1) {
        alert("打开文档失败！");
    }
}


/**********保存文件*********
 url         保存的文件路径
 savetype    保存类型
 filecode    0 保存不关闭
 1 保存且关闭
 ***************************/
function saveto(url,savetype,filecode){
    var ocx = document.getElementById("HWPostil1");
    var issave = ocx.SaveTo(url, savetype, filecode);
    if (issave == 0) {
        alert("保存失败！");
    }
}

/******************************关闭文件****************************
 type        0 关闭文档，不保存当前修改
 1 关闭文档，保存当前修改
 2 如果文档已经被修改，显示保存文档对话框，否则直接关闭
 其他 关闭文档，保存当前修改
 ******************************************************************/
function closedoc(type){
    var ocx = document.getElementById("HWPostil1");
    var isclose = ocx.CloseDoc(type);
    if (isclose == 0) {
        alert("关闭文档失败失败！");
    }
}

/**********上传文件**********
 filepath    上传服务器路径
 filecode    上传的字符串变量
 ***************************/
function saveFileServer(filepath,filecode){
    var ocx = document.getElementById("HWPostil1");
    //ocx.SetValue("ADD_FORCETYPE_VALUE2","32768");//保存成ofd、pdf
    ocx.SetValue("SET_CURRENT_COOKIE","COOKIE:LOGIN_TEST=somevalue;KEY=asdasd\r\n"); //设置cookie
    ocx.HttpInit(); //初始化HTTP引擎。
    ocx.HttpAddPostString("FileName", filecode);
    ocx.HttpAddPostCurrFile("FileBlod"); //设置上传当前文件,文件标识为FileBlod。
    var ispost = ocx.HttpPost(filepath); //上传数据。
    if (ispost != kkkkk) {
        alert("文档上传失败！错误代码：" + ispost);
    }
}


/*********************************************************************************************************

 方法名：AddSeal						手动盖章或手写
 参  数：usertype					用户类型：0 测试用户，1 本地key用户，2 服务器key用户，3 服务器口令用户
 doaction					操作类型：0 盖章，1 手写，2 手动插入编辑区
 other						预留参数：
 当usertype为1,2时，值为用户真实姓名，可以为空获则取证书用户名。
 当usertype为3时，值为口令内容。

 说明：httpaddr中

 **********************************************************************************************************/
function addseal(usertype,doaction,other) {
    var ocx = document.getElementById("HWPostil1");
    if(usertype == 0){
        var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    }else if(usertype == 1){
        var islogin = ocx.Login(other,1,65535,"","");
    }else if(usertype == 2){
        var islogin = ocx.Login(other,3,65535,"",httpaddr);
    }else if(usertype == 3){
        var stri = "Use-RemotePfx-Login:"+other;
        var strj = stri.length+1;
        var islogin = ocx.LoginEx(httpaddr, stri, strj);
    }else{
        alert("用户类型参数错误，以测试用户身份登录");
        var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    }
    if (islogin != 0) {
        alert("盖章失败！错误编号：" + islogin);
    } else {
        if(doaction == 0){
            ocx.CurrAction = 2568;
        }else if(doaction == 1){
            ocx.CurrAction = 264;
        }else if(doaction == 2){
            ocx.CurrAction = 1544;
        }
    }
}


/*****************打印文件****************
 printflag    0 不打印节点信息
 1 打印节点信息
 showdlg      0 不显示打印对话框，直接打印
 1 显示打印对话框
 *****************************************/
function printdoc(printflag,showdlg){
    var ocx = document.getElementById("HWPostil1");
    var isprint = ocx.PrintDoc(printflag,showdlg);
}


/************************************登录****************************************
 usertype    用户类型：0 测试用户，1 本地key用户，2 服务器key用户，3 服务器口令用户
 other      预留参数：
 当usertype为1,2时，值为用户真实姓名，可以为空获则取证书用户名。
 当usertype为3时，值为口令内容。
 *********************************************************************************/
function login(usertype,other){
    var ocx = document.getElementById("HWPostil1");
    if(usertype == 0){
        var islogin=ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    }else if(usertype == 1){
        var islogin = ocx.Login(other,1,65535,"","");
    }else if(usertype == 2){
        var islogin = ocx.Login(other,3,65535,"",httpaddr);
    }else if(usertype == 3){
        var stri = "Use-RemotePfx-Login:"+other;
        var strj = stri.length+1;
        var islogin = ocx.LoginEx(httpaddr, stri, strj);
    }else{
        alert("用户类型参数错误，以测试用户身份登录");
        var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    }
}

/*********************************
 ********判断当前是否登录**********
 *********************************/
function islogin(){
    var ocx = document.getElementById("HWPostil1");
    var isLogincode = ocx.IsLogin();
    if(isLogincode == 0){
        alert("未登录");
    }else{
        alert("已登录");
    }
}


/****************************插入图片（用户必须登录）*********************************
 添加一维码
 pcPicName   		节点名称
 pcPicValue      	STRDATA:[图片Base64值]
 BARCODEDATA:二维码信息，控件将自动生成二维码 (仅支持二维码版本有效)
 图片路径，HTTP文件路径， FTP文件路径
 lPage				要插入的页码
 lLeft				图片左边距
 lTop				图片上边距
 lZoom				图片缩放比例(百分比)+二维码类型x1000。(仅对二维码类型)
 二维码类型:
 24 BARCODE_PDF417_MAXCOL
 200 BARCODE_QR
 201 BARCODE_128
 202 BARCODE_39
 203 BARCODE_128SPEC
 204 BARCODE_39SPEC
 205 BARCODE_E39
 206 BARCODE_11
 207 BARCODE_93
 208 BARCODE_93SPEC
 **************************************************************************************/
function InsertYwm(){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("",1,65535,"","");
    ocx.InsertPicture("id001","BARCODEDATA:12121212121",0,0,0,13172836);
}
//添加二维码
function InsertPdf417(){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("",1,65535,"","");
    ocx.InsertPicture("id001","BARCODEDATA:12121212121",0,5000,5000,200);
}
//添加方形码
function InsertQr(){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("",1,65535,"","");
    ocx.InsertPicture("id001","BARCODEDATA:12121212121",0,15000,5000,13107500);
}




/******************查找文字******************
 searchtext		要查的文字
 "" 弹出查找对话框开始新的查找
 MatchCase   	0 区分大小写
 1 不区分大小写
 FindNext		0 从头查找
 1 查找下一个
 *********************************************/
function searchText(searchtext,MatchCase,FindNext){
    var ocx = document.getElementById("HWPostil1");
    ocx.SearchText(searchtext,MatchCase,FindNext);
}

/********查找指定文字并返回文字位置********
 pcText			要查的文字
 blCase   		0 大小写不敏感
 1 大小写敏感
 lPageS			起始页索引
 lPosXS			起始页X坐标
 lPosYS			起始页Y坐标
 lPageE			结束页索引
 lPosXE			结束页X坐标
 lPosYE			结束页Y坐标
 lSearchIndex	找的的第几个文字，通常为1
 ******************************************/
function findtext(pcText,blCase,lPageS,lPosXS,lPosYS,lPageE,lPosXE,lPosYE,lSearchIndex){
    var ocx = document.getElementById("HWPostil1");
    var isFindText = ocx.FindText(pcText,blCase,lPageS,lPosXS,lPosYS,lPageE,lPosXE,lPosYE,lSearchIndex);
    alert(isFindText);
}


/******************插入编辑区******************
 pcName			节点或区域的名字(不可以重复)
 lPageIndex   	在第几页添加(从0开始)
 lType			1 链接
 2 手写区域
 3 编辑区域
 4 自动扩充区域
 5 自动扩充区但不扩充页面
 lPosx			坐标X的数值，单位基于当前坐标系
 lPosy			坐标Y的数值，单位基于当前坐标系
 lWidth			节点宽度
 lHeight			节点高度
 **********************************************/
function insertbjq(pcName,lPageIndex,lType,lPosx,lPosy,lWidth,lHeight){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    ocx.InsertNote(pcName,lPageIndex,lType,lPosx,lPosy,lWidth,lHeight);
    ocx.SetValue(pcName, "<bold>主送：</>刘磊<br/><bold>抄送：</>胡兵 、张磊、刘平");
    //ocx.SetValue(pcName,":PROP:BORDCOLOR:1");
}

//编辑区插入内容
function insertText(pcName){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    ocx.SetValue(pcName, "<bold>主送：</>刘磊<br/><bold>抄送：</>胡兵 、张磊、刘平");
    //ocx.SetValue(pcName,":PROP::LABEL:2");//只读,
    //ocx.SetValue(pcName,":PROP:ZOOMTEXT:0");//设置文字大小不变
    //ocx.SetValue(pcName,":PROP:BORDCOLOR:1");
}

/*****************获取节点个数************
 lNoteType 		1 笔迹批注
 2 文字批注
 3 图片和印章及二维条码
 4 链接
 10 手写区域及编辑区域
 250 图片
 251 印章
 252 条码
 *****************************************/
function getNoteNum(lNoteType){
    var ocx = document.getElementById("HWPostil1");
    var notenum = ocx.GetNoteNum(lNoteType);
    alert(notenum);
}

/******************根据序号获得节点*********************
 lIndex 			序号，从0开始,通过GetNoteNum接口获取序号
 lNoteType		0 NOTE_TYPE_NULL
 1 NOTE_TYPE_PEN
 2 NOTE_TYPE_TEXT
 3 NOTE_TYPE_PIC
 4 NOTE_TYPE_LINK
 5 NOTE_TYPE_CTRL
 6 NOTE_TYPE_GRAPH
 10 NOTE_TYPE_AREA
 11 NOTE_TYPE_EDIT_V1
 13 NOTE_TYPE_AREA_V1
 14 NOTE_TYPE_PENEXT_V1
 20 NOTE_TYPE_VECTOR
 126 NOTE_TYPE_CONTENT
 127 NOTE_TYPE_UNKNOWN
 240 NOTE_TYPE_CHECKBOX
 241 NOTE_TYPE_RADIO
 242 NOTE_TYPE_COMBOX  组合框。
 243 NOTE_TYPE_LISTBOX  列表框。
 244 NOTE_TYPE_BUTTON  按钮。
 248 NOTE_TYPE_PREDEFURLLINK
 249 NOTE_TYPE_FORUSER
 250 NOTE_TYPE_REALPIC
 251 NOTE_TYPE_SEAL  印章。
 252 NOTE_TYPE_BARCODE
 253 NOTE_TYPE_PREDEFSEAL
 254 NOTE_TYPE_PREDEFBARCODE
 ********************************************************/
function getNoteByIndex(lNoteType){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    var notenum = ocx.GetNoteNum(lNoteType);
    for(var i = 1;i <= notenum;i++){
        var isGetNoteByIndex = ocx.GetNoteByIndex(i-1,251);
        alert(isGetNoteByIndex);
    }
}



/***********************插入附件***********************
 lPageStartIndex		添加页的起始位置,0,1,2,..
 = -1 弹出选择页码的的对话框
 大于等于当前页数的数字,添加到尾部
 pcFileName			null 弹出文件选择对话框
 文件名称 可以是Http服务器上面的文件
 "STRDATA:ss" ss为AIP文件的base64值
 ******************************************************/
function mergeFile(lPageStartIndex,pcFileName){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    ocx.MergeFile(lPageStartIndex,pcFileName);
}


/*********************获取下一个节点信息**********************
 pcUserID 			登录用户ID
 lServerID			登录服务器ID，如果值为零则表示不考虑服务器
 pcNoteID			节点名称。如果传 null 则返回第一个节点信息
 *************************************************************/
function getNextNote(pcUserID,lServerID,pcNoteID){
    var ocx = document.getElementById("HWPostil1");
    var islogin = ocx.Login("HWSEALDEMO**",4,65535,"DEMO","");
    var isGetNextNote = ocx.GetNextNote(pcUserID,lServerID,pcNoteID);
    alert(isGetNextNote);
}

/*****************************************
 *****************单步撤销*****************
 *****************************************/
function undo(){
    var ocx = document.getElementById("HWPostil1");
    ocx.Undo();
}

/************************************************
 *****************撤销本次所有操作****************
 ************************************************/
function undoAll(){
    var ocx = document.getElementById("HWPostil1");
    ocx.UndoAll();
}


/******************************************设置页面显示模式********************************************
 sZoomType			1 自定义模式 			放大缩小比例
 2 宽度模式 				无效。
 4 窗口模式 				无效。
 8 多列显示模式 			列数 指定排列的列数。
 16 平滑显示模式 		1 平滑显示。不显示页边界。
 0 非平滑显示。
 32 翻页模式 			1 进入翻页模式。（不可进行插入页操作）
 0 退出翻页模式。
 64 特殊模式 			0 正常模式显示。
 1 放大模式显示(页面中会出现放大的标志，单击则可将页面放大)。
 2 缩小模式显示(页面中会出现缩小的标志，单击则可将页面放大)。
 3 连续页显。
 4 分页模式。
 128 打印预览模式 		0 退出打印预览模式。
 1 进入打印预览模式。

 sZoomPercent
 *******************************************************************************************************/
function setPageMode(sZoomType,sZoomPercent){
    var ocx = document.getElementById("HWPostil1");
    ocx.SetPageMode(sZoomType,sZoomPercent);
}


/************************************************
 ******文件是否被修改（从上一次保存到现在）*******
 ************************************************/
function isSaved(){
    var ocx = document.getElementById("HWPostil1");
    var isSavedcode = ocx.IsSaved();
    if(isSavedcode == 0){
        alert("文档被修改");
    }else{
        alert("文档没修改");
    }
}


function getvalueex(){
    var obj = document.getElementById("HWPostil1");
    var User = obj.JSGetNextUser("");
    //while(User=obj.GetNextUser(User,0)){//循环用户
    var NoteInfo="";
    while(NoteInfo=obj.GetNextNote(User,0,NoteInfo)){//循环节点，印章类型为251
        try{
            var aa = obj.GetValueEx(NoteInfo,2,"",0,"");
            if(obj.GetValueEx(NoteInfo,2,"",0,"")==""){
                //$("#"+NoteInfo.split(".")[1]+"").val()
                obj.SetValue(NoteInfo,"");
            }else{
                $("#"+NoteInfo.split(".")[1]+"").val(obj.GetValueEx(NoteInfo,2,"",0,""))
            }
        }catch(e){
            alert("error");
        }
    }
    //}
}







