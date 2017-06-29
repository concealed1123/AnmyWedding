package com.org.iii.mywedding;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActWhiptheGroom extends AppCompatActivity {

    private DialogInterface.OnClickListener btnNext_click = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            int randGames = (int)(Math.random()*19+1);
            switch (randGames){
                case 1:
                    AlertDialog.Builder gamesMessage = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage.setTitle("如數家珍");
                    gamesMessage.setMessage("結婚當天，新娘衣著單薄，鬧洞時，賓客可以想法子讓新人互玩划拳遊戲，輸一拳即褪去身上衣物或手飾一件，直到---不能再褪了為止。");
                    gamesMessage.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog1 = gamesMessage.create();
                    dialog1.show();
                    break;
                case 2:
                    AlertDialog.Builder gamesMessage2 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage2.setTitle("高跟杯酒");
                    gamesMessage2.setMessage("慫恿新娘讓新郎為了表示對她愛意深深，想法子讓他用高跟鞋，連喝三杯。");
                    gamesMessage2.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog2 = gamesMessage2.create();
                    dialog2.show();
                    break;
                case 3:
                    AlertDialog.Builder gamesMessage3 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage3.setTitle("圓桌武士");
                    gamesMessage3.setMessage("讓新郎新娘拿凳子坐到桌面上，共飲同心酒。");
                    gamesMessage3.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog3 = gamesMessage3.create();
                    dialog3.show();
                    break;
                case 4:
                    AlertDialog.Builder gamesMessage4 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage4.setTitle("愛的蘋果");
                    gamesMessage4.setMessage("為了表示綿綿情愛，要新娘削蘋果餵新郎吃，但蘋果皮不准削斷，斷了的話，罰新娘長吻新郎十分鐘。");
                    gamesMessage4.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog4 = gamesMessage4.create();
                    dialog4.show();
                    break;
                case 5:
                    AlertDialog.Builder gamesMessage5 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage5.setTitle("要你好看");
                    gamesMessage5.setMessage("要新郎猜新娘新婚之夜的內褲是什麼顏色，猜對了，新娘獻寶，只要……只要露出一點點，表示答對即可；猜錯了，要新郎只著內褲「要求裸體可」跑洞房三圈。");
                    gamesMessage5.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog5 = gamesMessage5.create();
                    dialog5.show();
                    break;
                case 6:
                    AlertDialog.Builder gamesMessage6 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage6.setTitle("熱情冰塊");
                    gamesMessage6.setMessage("首先要求新郎將新娘抱起來，接著，好友兩三人將事先備好的碎冰塊，倒入新郎懷中，然後眾人一起擁抱這對新人，讓新新郎冷得過癮，跳上跳下，以免圓房時，熱情過度。");
                    gamesMessage6.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog6 = gamesMessage6.create();
                    dialog6.show();
                    break;
                case 7:
                    AlertDialog.Builder gamesMessage7 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage7.setTitle("四面埋伏");
                    gamesMessage7.setMessage("事先想辦法潛入洞房，躲在不易查覺的角落或衣櫥，再把預先錄好警報鳴笛聲響的錄音帶轉到最大聲，適時放出，讓這對新人嚇上一大跳，而躲在各處的暗樁一起竄逃，在洞房裡叫鬧一陣，再祝新人「早生貴子」。");
                    gamesMessage7.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog7 = gamesMessage7.create();
                    dialog7.show();
                    break;
                case 8:
                    AlertDialog.Builder gamesMessage8 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage8.setTitle("愛情汽球");
                    gamesMessage8.setMessage("在床單下放置汽球數粒，請新郎新娘一起躺下，以表示愛情堅貞，共赴落難。");
                    gamesMessage8.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog8 = gamesMessage8.create();
                    dialog8.show();
                    break;
                case 9:
                    AlertDialog.Builder gamesMessage9 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage9.setTitle("巧克旗袍");
                    gamesMessage9.setMessage("由女性貴賓把巧克力放進新娘旗袍內「新娘當然是坐著」，再要求新郎如數檢取，一粒也少不得，否則要求新改用嘴巴逐粒尋回。");
                    gamesMessage9.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog9 = gamesMessage9.create();
                    dialog9.show();
                    break;
                case 10:
                    AlertDialog.Builder gamesMessage10 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage10.setTitle(" 香酥巧克");
                    gamesMessage10.setMessage("由女性好友，用巧克力汁在新娘胸口擠出心形甜蜜液，然後要求新郎當眾舔嚐，以示心心相印。");
                    gamesMessage10.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog10 = gamesMessage10.create();
                    dialog10.show();
                    break;
                case 11:
                    AlertDialog.Builder gamesMessage11 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage11.setTitle("洞房上鎖");
                    gamesMessage11.setMessage("事先把洞房房門鎖上，鑰匙則藏到某處或某好友身上，再讓新郎尋找，每找不到一次，新娘則必須讓來賓親嘴嘴一次，直到找著為止。");
                    gamesMessage11.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog11 = gamesMessage11.create();
                    dialog11.show();
                    break;
                case 12:
                    AlertDialog.Builder gamesMessage12 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage12.setTitle("錯愛結晶");
                    gamesMessage12.setMessage("故意放個借來的某家嬰兒在床上，以造成短暫的誤會。");
                    gamesMessage12.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog12 = gamesMessage12.create();
                    dialog12.show();
                    break;
                case 13:
                    AlertDialog.Builder gamesMessage13 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage13.setTitle("舊愛重演");
                    gamesMessage13.setMessage("要新人當眾表演求婚時，最逼真的原始場面。");
                    gamesMessage13.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog13 = gamesMessage13.create();
                    dialog13.show();
                    break;
                case 14:
                    AlertDialog.Builder gamesMessage14 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage14.setTitle("警告逃妻");
                    gamesMessage14.setMessage("把新娘藏諸某處，再由新郎尋覓，直到找著為止，才准送進洞房。");
                    gamesMessage14.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog14 = gamesMessage14.create();
                    dialog14.show();
                    break;
                case 15:
                    AlertDialog.Builder gamesMessage15 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage15.setTitle("舊情綿綿");
                    gamesMessage15.setMessage("要新人雙方各招出過去男女朋友交往的人數、長相、經過，否則不准同眠共枕。");
                    gamesMessage15.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog15 = gamesMessage15.create();
                    dialog15.show();
                    break;
                case 16:
                    AlertDialog.Builder gamesMessage16 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage16.setTitle("大地之母");
                    gamesMessage16.setMessage("要新郎喊新娘三聲「媽」，否則罰新娘對新郎「三娘教子」一番。");
                    gamesMessage16.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog16 = gamesMessage16.create();
                    dialog16.show();
                    break;
                case 17:
                    AlertDialog.Builder gamesMessage17 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage17.setTitle("啞口無言");
                    gamesMessage17.setMessage("買本號角出版社出版的「看笑話」，用其中的創新謎語考考新人，答不出來，男賓各親吻新娘一分鐘。");
                    gamesMessage17.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog17 = gamesMessage17.create();
                    dialog17.show();
                    break;
                case 18:
                    AlertDialog.Builder gamesMessage18 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage18.setTitle("比手劃腳");
                    gamesMessage18.setMessage("出題目「比手劃腳」的遊戲，考考雙方的默契，所出題目愈糗人愈好，譬如：你們都還是處男處女嗎？她的三圍？你愛我嗎？我今天穿紅色的，二十點上床，妳今天很漂亮(不用保險套)等等。");
                    gamesMessage18.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog18 = gamesMessage18.create();
                    dialog18.show();
                    break;

                case 19:
                    AlertDialog.Builder gamesMessage19 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage19.setTitle("愛的黑痣");
                    gamesMessage19.setMessage("聽說新娘的肚臍眼上方三公分處，有一顆痣，不知道是不是真的，可不可以請新郎為新娘揭開謎底？");
                    gamesMessage19.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog19 = gamesMessage19.create();
                    dialog19.show();
                    break;
                case 20:
                    AlertDialog.Builder gamesMessage20 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage20.setTitle("昨日重現");
                    gamesMessage20.setMessage("要新人在眾人面前重演當年約會情景，包括親熱、摟抱、牽手等動作，直到賓客滿意為止。");
                    gamesMessage20.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog20 = gamesMessage20.create();
                    dialog20.show();
                    break;
                case 21:
                    AlertDialog.Builder gamesMessage21 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage21.setTitle("七步成詩");
                    gamesMessage21.setMessage("以頭到腳，身體各部器官為題，由兩人輪流成詩或成詞，如胸：胸有成竹；主考官為客人，假設客人不滿意答案，可要求另一方吻該部位，是嘴的話，很好，如果是私處，呵！該糟啦！");
                    gamesMessage21.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog21 = gamesMessage21.create();
                    dialog21.show();
                    break;
                case 22:
                    AlertDialog.Builder gamesMessage22 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage22.setTitle("胡椒飛天");
                    gamesMessage22.setMessage("預先在花炮裡混入胡椒粉，在新郎新娘進洞房時，炮火猛放，後果…有得收拾了。");
                    gamesMessage22.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog22 = gamesMessage22.create();
                    dialog22.show();
                    break;
                case 23:
                    AlertDialog.Builder gamesMessage23 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage23.setTitle("三圍新裁");
                    gamesMessage23.setMessage("要新郎手環抱新娘的身裁三圍，絲毫不差才過關，任何一圍有誤，罰新郎正面抱起新娘，口口相連走洞房三圈。");
                    gamesMessage23.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog23 = gamesMessage23.create();
                    dialog23.show();
                    break;
                case 24:
                    AlertDialog.Builder gamesMessage24 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage24.setTitle(" 三毛薪傳");
                    gamesMessage24.setMessage("要新郎背向新娘，在自已身上拔取三根毛、頭髮一根、腋毛一根、陰毛一根，然後要新娘猜，猜錯了(記住：新人會彼此照應，是不容易猜錯)，要新娘褪下底褲讓新郎在頭上(這可避邪，你信不信。)");
                    gamesMessage24.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog24 = gamesMessage24.create();
                    dialog24.show();
                    break;
                case 25:
                    AlertDialog.Builder gamesMessage25 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage25.setTitle("愛的軟糖");
                    gamesMessage25.setMessage("要新郎用嘴去銜結婚喜糖(軟糖)給新娘吃，一共得吃卅粒，當然，新可以幫新娘吃，如果新郎不吃，別的男人也可以代替哩！");
                    gamesMessage25.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog25 = gamesMessage25.create();
                    dialog25.show();
                    break;
                case 26:
                    AlertDialog.Builder gamesMessage26 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage26.setTitle("三寸金蓮");
                    gamesMessage26.setMessage("要新郎猜新娘的腳丫子有幾公分長，猜錯了，要求新郎穿新狀的高跟鞋走洞房三圈。");
                    gamesMessage26.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog26 = gamesMessage26.create();
                    dialog26.show();
                    break;
                case 27:
                    AlertDialog.Builder gamesMessage27 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage27.setTitle("情歌接唱");
                    gamesMessage27.setMessage("準備幾首炎喜氣的情歌，由賓客帶頭唱，再由新郎或新娘接力，唱錯或不會唱的到方，新娘罰讓男賓客親嘴嘴，新郎罰酒三杯，YA!");
                    gamesMessage27.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog27 = gamesMessage27.create();
                    dialog27.show();
                    break;
                case 28:
                    AlertDialog.Builder gamesMessage28 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage28.setTitle("彈簧有愛");
                    gamesMessage28.setMessage("為了表示新郎孔武有力，將來才能持家，所以要新郎抱新娘入洞房，並且在彈簧床上走五圈，新娘不准掉下，如果新郎體力不繼，可由別的男人代勞，啊！很好，我喜歡。");
                    gamesMessage28.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog28 = gamesMessage28.create();
                    dialog28.show();
                    break;
                case 29:
                    AlertDialog.Builder gamesMessage29 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage29.setTitle("生辰八字");
                    gamesMessage29.setMessage("要新郎猜新娘正確的農曆出生年月日，答錯了做馬讓新娘騎。");
                    gamesMessage29.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog29 = gamesMessage29.create();
                    dialog29.show();
                    break;
                case 30:
                    AlertDialog.Builder gamesMessage30 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage30.setTitle("春泥護花");
                    gamesMessage30.setMessage("為了表示新郎對新娘護愛情誼，要新郎當眾用大圍巾包裹兩人，為新娘換上簡便家居服，如果有穿戴異常時，新郎即罰酒三杯。");
                    gamesMessage30.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog30 = gamesMessage30.create();
                    dialog30.show();
                    break;

            }

        }
    };
    private View.OnClickListener btnGames_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int randGames = (int)(Math.random()*29+1);
            switch (randGames){
                case 1:
                    AlertDialog.Builder gamesMessage = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage.setTitle("如數家珍");
                    gamesMessage.setMessage("結婚當天，新娘衣著單薄，鬧洞時，賓客可以想法子讓新人互玩划拳遊戲，輸一拳即褪去身上衣物或手飾一件，直到---不能再褪了為止。");
                    gamesMessage.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog = gamesMessage.create();
                    dialog.show();
                    break;
                case 2:
                    AlertDialog.Builder gamesMessage2 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage2.setTitle("高跟杯酒");
                    gamesMessage2.setMessage("慫恿新娘讓新郎為了表示對她愛意深深，想法子讓他用高跟鞋，連喝三杯。");
                    gamesMessage2.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog2 = gamesMessage2.create();
                    dialog2.show();
                    break;
                case 3:
                    AlertDialog.Builder gamesMessage3 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage3.setTitle("圓桌武士");
                    gamesMessage3.setMessage("讓新郎新娘拿凳子坐到桌面上，共飲同心酒。");
                    gamesMessage3.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog3 = gamesMessage3.create();
                    dialog3.show();
                    break;
                case 4:
                    AlertDialog.Builder gamesMessage4 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage4.setTitle("愛的蘋果");
                    gamesMessage4.setMessage("為了表示綿綿情愛，要新娘削蘋果餵新郎吃，但蘋果皮不准削斷，斷了的話，罰新娘長吻新郎十分鐘。");
                    gamesMessage4.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog4 = gamesMessage4.create();
                    dialog4.show();
                    break;
                case 5:
                    AlertDialog.Builder gamesMessage5 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage5.setTitle("要你好看");
                    gamesMessage5.setMessage("要新郎猜新娘新婚之夜的內褲是什麼顏色，猜對了，新娘獻寶，只要……只要露出一點點，表示答對即可；猜錯了，要新郎只著內褲「要求裸體可」跑洞房三圈。");
                    gamesMessage5.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog5 = gamesMessage5.create();
                    dialog5.show();
                    break;
                case 6:
                    AlertDialog.Builder gamesMessage6 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage6.setTitle("熱情冰塊");
                    gamesMessage6.setMessage("首先要求新郎將新娘抱起來，接著，好友兩三人將事先備好的碎冰塊，倒入新郎懷中，然後眾人一起擁抱這對新人，讓新新郎冷得過癮，跳上跳下，以免圓房時，熱情過度。");
                    gamesMessage6.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog6 = gamesMessage6.create();
                    dialog6.show();
                    break;
                case 7:
                    AlertDialog.Builder gamesMessage7 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage7.setTitle("四面埋伏");
                    gamesMessage7.setMessage("事先想辦法潛入洞房，躲在不易查覺的角落或衣櫥，再把預先錄好警報鳴笛聲響的錄音帶轉到最大聲，適時放出，讓這對新人嚇上一大跳，而躲在各處的暗樁一起竄逃，在洞房裡叫鬧一陣，再祝新人「早生貴子」。");
                    gamesMessage7.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog7 = gamesMessage7.create();
                    dialog7.show();
                    break;
                case 8:
                    AlertDialog.Builder gamesMessage8 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage8.setTitle("愛情汽球");
                    gamesMessage8.setMessage("在床單下放置汽球數粒，請新郎新娘一起躺下，以表示愛情堅貞，共赴落難。");
                    gamesMessage8.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog8 = gamesMessage8.create();
                    dialog8.show();
                    break;
                case 9:
                    AlertDialog.Builder gamesMessage9 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage9.setTitle("巧克旗袍");
                    gamesMessage9.setMessage("由女性貴賓把巧克力放進新娘旗袍內「新娘當然是坐著」，再要求新郎如數檢取，一粒也少不得，否則要求新改用嘴巴逐粒尋回。");
                    gamesMessage9.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog9 = gamesMessage9.create();
                    dialog9.show();
                    break;
                case 10:
                    AlertDialog.Builder gamesMessage10 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage10.setTitle(" 香酥巧克");
                    gamesMessage10.setMessage("由女性好友，用巧克力汁在新娘胸口擠出心形甜蜜液，然後要求新郎當眾舔嚐，以示心心相印。");
                    gamesMessage10.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog10 = gamesMessage10.create();
                    dialog10.show();
                    break;
                case 11:
                    AlertDialog.Builder gamesMessage11 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage11.setTitle("洞房上鎖");
                    gamesMessage11.setMessage("事先把洞房房門鎖上，鑰匙則藏到某處或某好友身上，再讓新郎尋找，每找不到一次，新娘則必須讓來賓親嘴嘴一次，直到找著為止。");
                    gamesMessage11.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog11 = gamesMessage11.create();
                    dialog11.show();
                    break;
                case 12:
                    AlertDialog.Builder gamesMessage12 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage12.setTitle("錯愛結晶");
                    gamesMessage12.setMessage("故意放個借來的某家嬰兒在床上，以造成短暫的誤會。");
                    gamesMessage12.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog12 = gamesMessage12.create();
                    dialog12.show();
                    break;
                case 13:
                    AlertDialog.Builder gamesMessage13 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage13.setTitle("舊愛重演");
                    gamesMessage13.setMessage("要新人當眾表演求婚時，最逼真的原始場面。");
                    gamesMessage13.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog13 = gamesMessage13.create();
                    dialog13.show();
                    break;
                case 14:
                    AlertDialog.Builder gamesMessage14 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage14.setTitle("警告逃妻");
                    gamesMessage14.setMessage("把新娘藏諸某處，再由新郎尋覓，直到找著為止，才准送進洞房。");
                    gamesMessage14.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog14 = gamesMessage14.create();
                    dialog14.show();
                    break;
                case 15:
                    AlertDialog.Builder gamesMessage15 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage15.setTitle("舊情綿綿");
                    gamesMessage15.setMessage("要新人雙方各招出過去男女朋友交往的人數、長相、經過，否則不准同眠共枕。");
                    gamesMessage15.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog15 = gamesMessage15.create();
                    dialog15.show();
                    break;
                case 16:
                    AlertDialog.Builder gamesMessage16 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage16.setTitle("大地之母");
                    gamesMessage16.setMessage("要新郎喊新娘三聲「媽」，否則罰新娘對新郎「三娘教子」一番。");
                    gamesMessage16.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog16 = gamesMessage16.create();
                    dialog16.show();
                    break;
                case 17:
                    AlertDialog.Builder gamesMessage17 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage17.setTitle("啞口無言");
                    gamesMessage17.setMessage("買本號角出版社出版的「看笑話」，用其中的創新謎語考考新人，答不出來，男賓各親吻新娘一分鐘。");
                    gamesMessage17.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog17 = gamesMessage17.create();
                    dialog17.show();
                    break;
                case 18:
                    AlertDialog.Builder gamesMessage18 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage18.setTitle("比手劃腳");
                    gamesMessage18.setMessage("出題目「比手劃腳」的遊戲，考考雙方的默契，所出題目愈糗人愈好，譬如：你們都還是處男處女嗎？她的三圍？你愛我嗎？我今天穿紅色的，二十點上床，妳今天很漂亮(不用保險套)等等。");
                    gamesMessage18.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog18 = gamesMessage18.create();
                    dialog18.show();
                    break;

                case 19:
                    AlertDialog.Builder gamesMessage19 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage19.setTitle("愛的黑痣");
                    gamesMessage19.setMessage("聽說新娘的肚臍眼上方三公分處，有一顆痣，不知道是不是真的，可不可以請新郎為新娘揭開謎底？");
                    gamesMessage19.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog19 = gamesMessage19.create();
                    dialog19.show();
                    break;
                case 20:
                    AlertDialog.Builder gamesMessage20 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage20.setTitle("昨日重現");
                    gamesMessage20.setMessage("要新人在眾人面前重演當年約會情景，包括親熱、摟抱、牽手等動作，直到賓客滿意為止。");
                    gamesMessage20.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog20 = gamesMessage20.create();
                    dialog20.show();
                    break;
                case 21:
                    AlertDialog.Builder gamesMessage21 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage21.setTitle("七步成詩");
                    gamesMessage21.setMessage("以頭到腳，身體各部器官為題，由兩人輪流成詩或成詞，如胸：胸有成竹；主考官為客人，假設客人不滿意答案，可要求另一方吻該部位，是嘴的話，很好，如果是私處，呵！該糟啦！");
                    gamesMessage21.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog21 = gamesMessage21.create();
                    dialog21.show();
                    break;
                case 22:
                    AlertDialog.Builder gamesMessage22 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage22.setTitle("胡椒飛天");
                    gamesMessage22.setMessage("預先在花炮裡混入胡椒粉，在新郎新娘進洞房時，炮火猛放，後果…有得收拾了。");
                    gamesMessage22.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog22 = gamesMessage22.create();
                    dialog22.show();
                    break;
                case 23:
                    AlertDialog.Builder gamesMessage23 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage23.setTitle("三圍新裁");
                    gamesMessage23.setMessage("要新郎手環抱新娘的身裁三圍，絲毫不差才過關，任何一圍有誤，罰新郎正面抱起新娘，口口相連走洞房三圈。");
                    gamesMessage23.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog23 = gamesMessage23.create();
                    dialog23.show();
                    break;
                case 24:
                    AlertDialog.Builder gamesMessage24 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage24.setTitle(" 三毛薪傳");
                    gamesMessage24.setMessage("要新郎背向新娘，在自已身上拔取三根毛、頭髮一根、腋毛一根、陰毛一根，然後要新娘猜，猜錯了(記住：新人會彼此照應，是不容易猜錯)，要新娘褪下底褲讓新郎在頭上(這可避邪，你信不信。)");
                    gamesMessage24.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog24 = gamesMessage24.create();
                    dialog24.show();
                    break;
                case 25:
                    AlertDialog.Builder gamesMessage25 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage25.setTitle("愛的軟糖");
                    gamesMessage25.setMessage("要新郎用嘴去銜結婚喜糖(軟糖)給新娘吃，一共得吃卅粒，當然，新可以幫新娘吃，如果新郎不吃，別的男人也可以代替哩！");
                    gamesMessage25.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog25 = gamesMessage25.create();
                    dialog25.show();
                    break;
                case 26:
                    AlertDialog.Builder gamesMessage26 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage26.setTitle("三寸金蓮");
                    gamesMessage26.setMessage("要新郎猜新娘的腳丫子有幾公分長，猜錯了，要求新郎穿新狀的高跟鞋走洞房三圈。");
                    gamesMessage26.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog26 = gamesMessage26.create();
                    dialog26.show();
                    break;
                case 27:
                    AlertDialog.Builder gamesMessage27 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage27.setTitle("情歌接唱");
                    gamesMessage27.setMessage("準備幾首炎喜氣的情歌，由賓客帶頭唱，再由新郎或新娘接力，唱錯或不會唱的到方，新娘罰讓男賓客親嘴嘴，新郎罰酒三杯，YA!");
                    gamesMessage27.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog27 = gamesMessage27.create();
                    dialog27.show();
                    break;
                case 28:
                    AlertDialog.Builder gamesMessage28 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage28.setTitle("彈簧有愛");
                    gamesMessage28.setMessage("為了表示新郎孔武有力，將來才能持家，所以要新郎抱新娘入洞房，並且在彈簧床上走五圈，新娘不准掉下，如果新郎體力不繼，可由別的男人代勞，啊！很好，我喜歡。");
                    gamesMessage28.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog28 = gamesMessage28.create();
                    dialog28.show();
                    break;
                case 29:
                    AlertDialog.Builder gamesMessage29 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage29.setTitle("生辰八字");
                    gamesMessage29.setMessage("要新郎猜新娘正確的農曆出生年月日，答錯了做馬讓新娘騎。");
                    gamesMessage29.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog29 = gamesMessage29.create();
                    dialog29.show();
                    break;
                case 30:
                    AlertDialog.Builder gamesMessage30 = new AlertDialog.Builder(ActWhiptheGroom.this);
                    gamesMessage30.setTitle("春泥護花");
                    gamesMessage30.setMessage("為了表示新郎對新娘護愛情誼，要新郎當眾用大圍巾包裹兩人，為新娘換上簡便家居服，如果有穿戴異常時，新郎即罰酒三杯。");
                    gamesMessage30.setPositiveButton("下個遊戲",btnNext_click);
                    Dialog dialog30 = gamesMessage30.create();
                    dialog30.show();
                    break;

            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actwhipthegroom);
        InitialComponent();
    }

    private void InitialComponent() {
        btnGames = (Button)findViewById(R.id.btnGames);
        btnGames.setOnClickListener(btnGames_click);
    }
    Button btnGames;
}
